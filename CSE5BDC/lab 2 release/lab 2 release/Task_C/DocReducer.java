import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// The reducer class
public class DocReducer extends Reducer<IntWritable, Text, IntWritable, Text>
{
  // The reduce method runs once for each key received after the shuffle phase
  @Override
  public void reduce(IntWritable key, Iterable<Text> values, Context context)
    throws IOException, InterruptedException
  {
    // Find the longest word
    int maxLength = -1;
    String longestWord = null;
    for(Text value : values)
    {
      String word = value.toString();
      if(word.length() > maxLength) {
        maxLength = word.length();
        longestWord = word;
      }
    }

    // Emit the document ID and longest word
    if(longestWord != null) {
      context.write(key, new Text(longestWord));
    }
  }
}
