package cn.gl.Demo.controller

import scala.io.StdIn

object IfElseDemo {

  def main(args: Array[String]): Unit = {

    // 输入一个数字判断奇偶性
    var i = StdIn.readInt()

    var r: String = if (i % 2 != 0)
      i + "是一个奇数"
    else
      i + "是一个偶数"

    println(r)

    // var r2 = if(a > b) a else b
  }

}
