package cn.tedu.mapreducer.avgscore;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * 第四个练习求平均分，txt/score2/  目录  下滑线开头不会被MR处理，默认是隐藏文件
 */
public class AverageScoreDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setMapperClass(AverageScoreMapper.class);
        job.setReducerClass(AverageScoreReducer.class);
        job.setJarByClass(AverageScoreDriver.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);

        FileInputFormat.addInputPath(job,
                new Path("hdfs://hadoop01:9000/txt/score2/"));
        FileOutputFormat.setOutputPath(job,
                new Path("hdfs://hadoop01:9000/result/avgscore"));

        job.waitForCompletion(true);
    }
}
