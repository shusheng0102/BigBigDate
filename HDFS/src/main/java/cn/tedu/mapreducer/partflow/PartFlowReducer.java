package cn.tedu.mapreducer.partflow;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

// 统计每一个人的总流量
public class PartFlowReducer
        extends Reducer<Text, Flow, Text, IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<Flow> values, Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (Flow val : values) {
            sum += val.getFlow();
        }
        context.write(key, new IntWritable(sum));
    }
}
