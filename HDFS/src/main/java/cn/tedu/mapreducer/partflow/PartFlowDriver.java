package cn.tedu.mapreducer.partflow;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class PartFlowDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setMapperClass(PartFlowMapper.class);
        job.setReducerClass(PartFlowReducer.class);
        job.setJarByClass(PartFlowDriver.class);

        // 指定分区类
        job.setPartitionerClass(AddrPartitioner.class);
        // 分了几类，每一类数据都需要一个线程处理
        // 这3个线程的处理逻辑一样，只是处理的数据不同
        job.setNumReduceTasks(3);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Flow.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        FileInputFormat.addInputPath(job,
                new Path("hdfs://hadoop01:9000/txt/flow.txt"));
        FileOutputFormat.setOutputPath(job,
                new Path("hdfs://hadoop01:9000/result/partflow"));

        job.waitForCompletion(true);
    }
}
