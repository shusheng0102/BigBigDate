package cn.tedu.mapreducer.partprofit;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Profit implements Writable {

    private int month;
    private String name;
    private int income;
    private int outcome;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(month);
        out.writeUTF(name);
        out.writeInt(income);
        out.writeInt(outcome);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.month = in.readInt();
        this.name = in.readUTF();
        this.income = in.readInt();
        this.outcome = in.readInt();
    }
}
