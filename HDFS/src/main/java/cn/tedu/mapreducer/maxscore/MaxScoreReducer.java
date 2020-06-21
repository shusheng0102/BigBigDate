package cn.tedu.mapreducer.maxscore;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


public class MaxScoreReducer
        extends Reducer<Text, IntWritable, Text, IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        // 现在这个人对应的分数都在values中
        // 在MapReduce中，为了节省内存空间，采用了地址复用机制
        IntWritable max = new IntWritable(0);
        // IntWritable value = new IntWritable();
        // key = Bob
        // values = 548 684 312 340
        // value.set(548);
        // max.get() < value.get(); -> 0 < 548 -> true
        // max = value; - max是一个引用类型，所以赋值给的是地址
        // value.set(684); - max的值是684
        // max.get() < value.get(); -> 684 < 684 -> false
        // value.set(312); - max的值是312
        // 后续的判断会一直不成立
        // max最后的值是迭代器中最后一个值
        for (IntWritable value : values) {
            if (max.get() < value.get())
                //max = value;
                max.set(value.get());
        }
        context.write(key, max);
    }
}
