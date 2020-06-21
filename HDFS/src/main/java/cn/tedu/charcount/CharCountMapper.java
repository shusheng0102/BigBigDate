package cn.tedu.charcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/12 0012-12:54
 */
//Mapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT>
// MapReduce中要求被传输的类型能够被序列化的
// KEYIN - 输入的键的类型。默认是这一行数据的字节偏移量   第几个字节
// VALUEIN - 输入的值的类型。默认是读取的这一行数据
// KEYOUT - 输出的键的类型 -当前案例而言，字符统计的键是字符
// VALUEOUT - 输出的值的类型 - 当前案例而言看，输出的值是这一行对应字符的个数
public class CharCountMapper extends Mapper<LongWritable, Text,Text, IntWritable> {
    @Override
    // key - 字节偏移量
    // value - 一行数据
    // context - 环境参数，用于获取配置以及将结果发给ReduceTask
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // value中封装了读取到的一行数据
        // 统计这一行中每一个字符出现的次数
        // 首先要先拆分出这一行中的字符
        char[] cs = value.toString().toCharArray();
        // hello
        // h:1 e:1 l:2 o:1
        // h:1 e:1 l:1 l:1 o:1   采用这个方案
        for (char c : cs) {
            context.write(new Text(String.valueOf(c)),new IntWritable(1));
        }

    }
}
