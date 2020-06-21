package cn.tedu.mapreducer.serialflow;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

// 统计每一个人花费的总流量 - Text, IntWritable
// 统计每一个人手机号 - Text, Text
// 统计每一个人出现过的地区 - Text, Text
// ...
public class SerialFlowReducer
        extends Reducer<Text, Flow, Text, Text> {
    @Override
    protected void reduce(Text key, Iterable<Flow> values, Context context) throws IOException, InterruptedException {
        // 去重
        Set<String> set = new HashSet<>();
        for (Flow value : values) {
            set.add(value.getAddr());
        }
        // 拼接
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s).append("\t");
        }
        context.write(key, new Text(sb.toString()));
    }
}
