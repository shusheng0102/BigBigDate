package cn.tedu.charcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * @author 冷夜雨花未眠
 * @create 2020/3/12 0012-12:54
 */

// KEYIN,VALUEIN - Reduce的结果从Map来，
// 所以Map的输出类型和Reduce的输入类型应该是一样的
// KEYOUT,VALUEOUT - 字符对应的总次数
public class CharCountReducer extends Reducer <Text, IntWritable,Text,IntWritable>{
    @Override
    // key：字符
    // values：这个字符对应的次数
    // key = 'a'
    // values = 2,5,9,4...
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        // 定义一个变量来记录总次数
        int sum = 0;
        // 遍历迭代器
        for (IntWritable value : values) {
            sum += value.get();
        }
        context.write(key, new IntWritable(sum));
    }
}
