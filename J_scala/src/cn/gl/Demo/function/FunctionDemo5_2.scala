package cn.gl.Demo.function

import scala.io.StdIn

object FunctionDemo5_2 {

  def main(args: Array[String]): Unit = {
    var cai = StdIn.readInt()
    def guess(i:Int) = {

      def m(j:Int)=
        if(i>j) "小了"
        else if (i<j) "大了"
        else "ok"
      m _
    }
    var abc = guess(87)
    println(abc(cai))

  }

}
