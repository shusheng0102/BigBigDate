package cn.tedu.charcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/12 0012-12:54
 */
public class CharCountDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //1.环境配置
        Configuration conf = new Configuration();
        //2.向YARN来申请一个任务用于执行MapReduce程序
        Job job = Job.getInstance(conf);
        //3.需要告诉这个job的入口类
        job.setJarByClass(CharCountDriver.class);
            // 设置Mapper
        job.setMapperClass(CharCountMapper.class);
            // 设置Reducer
        job.setReducerClass(CharCountReducer.class);

        //4.设置Map的输出结果类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //5.设置Reduce的输出结果类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        //6.设置输入路径    import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
        FileInputFormat.addInputPath(job,
                new Path("hdfs://hadoop01:9000/txt/characters.txt"));

        //7.指定输出路径
            // 这个路径现阶段必须是HDFS路径，并且要求路径在HDFS不存在
        FileOutputFormat.setOutputPath(job,
                new Path("hdfs://hadoop01:9000/result/charcount/"));

        //8.提交任务
        job.waitForCompletion(true);

    }
}
