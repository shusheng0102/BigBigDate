package cn.tedu.mapreducer.serialscore;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class SerialScoreReducer
        extends Reducer<Text, Score, Text, IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<Score> values, Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (Score value : values) {
            sum += value.getChinese() + value.getMath() + value.getEnglish();
        }
        context.write(key, new IntWritable(sum));
    }

}
