package cn.gl.Demo.controller

import scala.io.StdIn

object ForDemo2 {

  def main(args: Array[String]): Unit = {

    // 打印0-10之间的偶数
    // 指定递增步长
    // to在Scala中本质上是一个函数
    // 等价于 for(i <- 0.to(10))
    // Scala中，如果函数只有1个参数，是可以省略()
    // for循环中，写在()中的循环值是一个常量
    // for(i <- 0 to 10)
    // 等价于Java:for(int i = 0; i <= 10; i += 2)
    // for (i <- 0.to(10, 2))
    //   println(i)
    // 等价于Java:for(int i = 0; i < 11; i += 2)
    // for (i <- 0.until(11, 2))
    //   println(i)

    // 打印1-5
    // 倒序打印
    // for (i <- 5.to(1, -1))
    //   println(i)
    // 等价于
    // var r = for (i <- 1 to 5 reverse)
    //   println(i)

    // println(r)

    // 输入一个数字n表示集合元素的个数
    // 集合中的每一项元素都是当前项数的平方
    // ｛1, 4, 9, 16, 25, 36...｝
    var n = StdIn.readInt()
    // 等价于Java：int[] arr = new int[n];
    // var arr = new Array[Int](n)
    // for(i <- 1 to n)
    //   arr(i - 1) = i * i
    // println(arr)
    // yield表示将计算结果返回，放入集合中
    var r = for (i <- 1 to n) yield i * i
    println(r)
  }

}
