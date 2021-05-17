package cn.gl.Demo.function

object FunctionDemo5_1 {

  def main(args: Array[String]): Unit = {

    def max(i:Int): Int=>Int = {
      def m(j:Int)=if (i>j) i else j
      m _
    }
    var r = max(5)
    println(r(2))
    println(r(8))

    var t = max(9)(10)
    println(t)
  }

}
