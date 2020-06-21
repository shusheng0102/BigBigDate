package cn.tedu.mapreducer.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * 第一个练习：单词计数
 */
public class WordCountDriver {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);

        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);
        job.setJarByClass(WordCountDriver.class);

        // 如果Mapper和Reducer的输出结果类型相同
        // 那么可以只设置一次
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        // 设置输入路径
        FileInputFormat.addInputPath(job,
                new Path("hdfs://hadoop01:9000/txt/words.txt"));
        // 设置输出路径
        FileOutputFormat.setOutputPath(job,
                new Path("hdfs://hadoop01:9000/result/wordcount"));

        job.waitForCompletion(true);
    }

}
