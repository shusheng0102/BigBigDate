package cn.tedu.mapreducer.wordcount;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper
        extends Mapper<LongWritable, Text, Text, LongWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        // hello tom hello bob
        // 需要拆分这一行中的每一个单词
        String[] arr = value.toString().split(" ");
        for (String s : arr) {
            context.write(new Text(s), new LongWritable(1));
        }
    }
}
