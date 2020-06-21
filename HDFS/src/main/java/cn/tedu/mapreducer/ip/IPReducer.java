package cn.tedu.mapreducer.ip;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class IPReducer
        extends Reducer<Text, NullWritable, Text, NullWritable> {
    @Override
    protected void reduce(Text key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
        // key是ip地址
        // values中包含的是一堆的null
        // values = null, null, null...
        context.write(key, NullWritable.get());
    }
}
