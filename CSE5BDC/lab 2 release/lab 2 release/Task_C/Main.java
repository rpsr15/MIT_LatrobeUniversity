import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.conf.Configuration;

// The driver class
public class Main
{
  public static void main(String[] args) throws Exception
  {
    if(args.length == 2)
    {
      // Configure the job to use 3 reducers
      Configuration conf = new Configuration();
      conf.set("mapred.reduce.tasks", "3");

      // Instantiate a Job object for your job's configuration
      Job job = Job.getInstance(conf);
      job.setJarByClass(Main.class);
      job.setJobName("Longest word(with combiner)");

      // Set input format to key/value space-separated pairs of type Text
      job.setInputFormatClass(KeyValueTextInputFormat.class);

      // Set input and output names from arguments
      FileInputFormat.setInputPaths(job, new Path(args[0]));
      FileOutputFormat.setOutputPath(job, new Path(args[1]));

      // Set mapper and reducer classes
      job.setMapperClass(DocMapper.class);
      job.setReducerClass(DocReducer.class);

      // *** TODO: Uncomment the following line to use a combiner ***
       job.setCombinerClass(DocReducer.class);

      // Set key and value types for the mapper output
      job.setMapOutputKeyClass(IntWritable.class);
      job.setMapOutputValueClass(Text.class);

      // Set key and value types for the reducer (final) output
      job.setOutputKeyClass(IntWritable.class);
      job.setOutputValueClass(Text.class);

      // Start the MapReduce job and wait for it to finish
      boolean success = job.waitForCompletion(true);
      System.out.printf("Job %s.", success ? "succeeded" : "failed");
    }
    else
    {
      System.out.println("Usage: Main <input file> <output dir>");
    }
  }
}
