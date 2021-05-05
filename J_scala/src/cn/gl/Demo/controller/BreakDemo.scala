package cn.gl.Demo.controller

import scala.util.control.Breaks._

object BreakDemo {

  def main(args: Array[String]): Unit = {

    // Breaks.breakable(
    //   for (i <- 1 to 10) {
    //     if (i % 5 == 0)
    //     // 底层是利用了抛出异常的方式来终止循环
    //       Breaks.break()
    //     println(i)
    //   }
    // )
    breakable(
      for (i <- 1 to 10) {
        if (i % 5 == 0)
        // 在Scala中，如果一个函数没有参数
        // 那么在调用的时候可以省略()
          break
        println(i)
      }
    )

    println("finish~~~")

  }

}
