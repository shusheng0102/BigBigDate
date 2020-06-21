package cn.tedu.day15.collection.list;

import java.util.Arrays;

//用数组实现ArrayList
public class ListText {
    public static void main(String[] args) {
        //创建子列表
        ListArray list=new ListArray();
        list.add("abc");
        list.add("c");
        list.add("3abc");
        list.add("a54bc");
        list.add(0,"1");
        list.remove(1);
        System.out.println(list.subList(0,2));
        System.out.println(list);
    }
}


//实现ArrayList
class ListArray{

    //用于存储集合数据的数组
    String[] data;

    //表示数组下标
    //元素的个数
    int size=0;

    //通过无参构造创建对象
    //指定数组长度
    public ListArray(){
        //默认长度为10
        data=new String[10];
    }

    //有参构造
    //可以指定初始容量
    public ListArray(int initCapcity){
        //数组长度为给定的参数值
        //判断参数值是否是小于0的数
        if(initCapcity<0)
            throw new IllegalArgumentException("initCapcity"+initCapcity);

        data=new String[initCapcity];
    }


    //扩容方法
    public void grow(){
        //判断数组长度是否为0或者1
        if(data.length<=1)
            data=Arrays.copyOf(data,data.length+1);
        data= Arrays.copyOf(data,data.length+(data.length>>1));
    }

    //下标越界问题
    public void isout(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Index:"+index);
        }
    }



    //添加元素
    public void add(String str){
        //判断数组是否需要扩容
        if(size>=data.length){//数组长度和元素个数相等就要扩容
            grow();//调用扩容方法
        }
        //往数组里添加元素
        //下标和元素个数+1
        data[size++]=str;
    }

    //插入
    public void add(int index,String str){
        //判断下标是否越界
        if (index<0||index>size)
            throw new IllegalArgumentException("Index:"+index);


        //判断数组是否需要扩容
        if(size>=data.length){
            grow();
        }

        //依次往后赋值
        /*for(int i=size-1;i>=index;i--){//从后往前遍历
            //前面的值赋值给后面的值
            data[i+1]=data[i];
        }*/
        System.arraycopy(data,index,data,index+1,size-index);

        //把要插入的元素进行赋值
        data[index]=str;
        //元素个数加1
        size++;

    }


    //删除---根据下标进行删除
    public void remove(int index){
        //下标越界问题
        isout(index);

        //依次往前赋值
        /*for (int i=index;i<size-1;i++){
            //后面的元素赋值给前面的
            data[i]=data[i+1];
        }*/
        System.arraycopy
                (data,index+1,data,index,size-(index+1));

        //元素个数减1
        size--;
    }


    //根据元素进行删除
    public void remove(String str){
        //根据参数值返回下标值
        int index=indexOf(str);
        //判断返回值是否为-1
        if(index!=-1){//返回的就是下标值
            remove(index);
        }
    }



    //根据元素返回第一次出现的下标值
    public int indexOf(String str){
        //遍历数组
        for(int i=0;i<size;i++){
            //判断数组元素是否和参数相等
            if (data[i]==str||data[i]!=null&&data[i].equals(str)){
                return i;
            }
        }
        //如果没有找到相等的元素
        return -1;
    }




    //清空集合
    public void clear(){
        //元素个数置为0
        size=0;
    }


    //判断参数是否包含在集合
    public boolean contains(String str){
        //返回的值不是-1说明包含
        return indexOf(str)!=-1;
    }


    //根据下标获取集合元素
    public String get(int index){
        //下标越界问题
        isout(index);
        //返回对应的元素
        return data[index];
    }


    //判断集合是否为空
    public boolean isEmpty(){
        //根据元素个数来进行判断
        return size==0;
    }


    //替换集合元素
    public void set(int index,String str){
        //下标越界问题
        isout(index);
        //替换元素
        data[index]=str;
    }


    //返回元素个数
    public int size(){
        return size;
    }


    //截取子列表
    public ListArray subList(int fromindex, int toindex){
        //下标越界问题
        isout(fromindex);
        isout(toindex);
        //判断结束下标是否大于起始下标
        if(fromindex>toindex)
            throw new IllegalArgumentException
                    ("Fromindex:"+fromindex+",Toindex:"+toindex);

        //截取子列表的元素个数
        int count=toindex-fromindex;
        //创建新的子列表---新的本类对象
        //指定新子列表的数组的初始容量
        ListArray list=new ListArray(count);
        //把原数组里的元素复制到子列表的新数组中
        System.arraycopy(data,fromindex,list.data,0,count);
        //把复制的元素个数赋值给子列表的size
        list.size=count;
        //返回子列表对象
        return list;
    }


    //重写toString方法
    public String toString(){
        //创建StringBuilder对象进行拼接
        StringBuilder sb=new StringBuilder("[");
        //遍历数组---元素
        for(int i=0;i<size;i++){
            //拼接中间结果
            sb.append(data[i]).append(", ");
        }

        //转成字符串
        String s=sb.toString();
        //截取子串---把最后的， 去掉
        //判断是否有元素
        if(size>0)
        s=s.substring(0,s.length()-2);
        //返回拼接结果
        return s+="]";
    }


}









