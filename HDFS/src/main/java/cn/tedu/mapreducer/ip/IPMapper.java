package cn.tedu.mapreducer.ip;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class IPMapper
        extends Mapper<LongWritable, Text, Text, NullWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // 读取的一行数据就是IP
        // 10.9.80.16
        //  NullWritable是一个单例模式的产物
        context.write(value, NullWritable.get());
    }
}
