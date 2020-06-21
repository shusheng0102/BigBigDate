package cn.tedu.mapreducer.partprofit;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class PartProfitReducer
        extends Reducer<Text, Profit, Text, IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<Profit> values, Context context) throws IOException, InterruptedException {
        int profit = 0;
        for (Profit val : values) {
            profit += val.getIncome() - val.getOutcome();
        }
        context.write(key, new IntWritable(profit));
    }
}
