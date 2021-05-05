package cn.gl.Demo.controller

import scala.io.StdIn

object IfDemo {

  def main(args: Array[String]): Unit = {

    // 整体结构上而言，if结构和Java中基本一样
    // 从控制台获取一个数字，如果是5的倍数就输出
    var i = StdIn.readInt()

    // Scala中任何一个结构都需要有计算结果
    // var r = if (i % 5 == 0) println(i + "是5的倍数")

    // 表示如果if判断成立，那么if结构的最后一句话就是if的执行结果
    // 如果if成立，那么r应该是个String --- AnyRef
    // 如果if不成立，那么r应该是Unit --- AnyVal
    // 任何类型的值都可以赋值给Unit
    var r:Unit = if (i % 5 == 0) {
      println("~~~~~")
      "是5的倍数"
    }

    // var z:Unit = 5
    // var j:Unit = 4.25
    println(r)

  }

}
