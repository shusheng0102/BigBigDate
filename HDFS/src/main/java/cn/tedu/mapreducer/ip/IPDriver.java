package cn.tedu.mapreducer.ip;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * 第二个练习：IP去重
 */
public class IPDriver {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setMapperClass(IPMapper.class);
        job.setReducerClass(IPReducer.class);
        job.setJarByClass(IPDriver.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);

        // 设置输入路径
        FileInputFormat.addInputPath(job,
                new Path("hdfs://hadoop01:9000/txt/ip.txt"));
        // 设置输出路径
        FileOutputFormat.setOutputPath(job,
                new Path("hdfs://hadoop01:9000/result/ip"));

        job.waitForCompletion(true);
    }
}
