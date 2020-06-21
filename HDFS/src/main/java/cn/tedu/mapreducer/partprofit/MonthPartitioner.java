package cn.tedu.mapreducer.partprofit;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MonthPartitioner extends Partitioner<Text, Profit> {
    @Override
    public int getPartition(Text text, Profit profit, int numPartitions) {
        int month = profit.getMonth();
        // 1 -- 0
        // 2 -- 1
        // 3 -- 2
        return month - 1;
    }
}
