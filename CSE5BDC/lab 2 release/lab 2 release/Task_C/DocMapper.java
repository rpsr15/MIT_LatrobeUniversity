import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// The mapper class
public class DocMapper extends Mapper<Text, Text, IntWritable, Text>
{
  // The map method runs once for each line of text in the input file
  @Override
  public void map(Text key, Text value, Context context) throws IOException, InterruptedException
  {
      // Emit the doc id as an IntWritable, and the word
      context.write(new IntWritable(Integer.parseInt(key.toString())), value);
  }
}
