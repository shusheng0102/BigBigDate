package cn.tedu.mapreducer.partprofit;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class PartProfitMapper
        extends Mapper<LongWritable, Text, Text, Profit> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] arr = value.toString().split(" ");
        Profit p = new Profit();
        p.setMonth(Integer.parseInt(arr[0]));
        p.setName(arr[1]);
        p.setIncome(Integer.parseInt(arr[2]));
        p.setOutcome(Integer.parseInt(arr[3]));
        context.write(new Text(p.getName()), p);
    }
}
