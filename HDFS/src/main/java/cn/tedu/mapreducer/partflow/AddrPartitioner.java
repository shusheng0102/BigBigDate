package cn.tedu.mapreducer.partflow;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

// 分区类， 作用就是对数据进行分类
public class AddrPartitioner extends Partitioner<Text, Flow> {

    // 在MapReduce中，会自动对分区编号自增，编号是从0开始
    @Override
    public int getPartition(Text text, Flow flow, int numPartitions) {
        // 按照地区分类，首先先获取地区
        String addr = flow.getAddr();
        if (addr.equals("bj"))
            return 0;
        else if (addr.equals("sh"))
            return 1;
        else
            return 2;
    }
}
