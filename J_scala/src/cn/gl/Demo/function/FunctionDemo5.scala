package cn.gl.Demo.function

object FunctionDemo5 {

  def sum_lazy(n: Int)= {
    println("sum函数开始加载")
    var sum = 0
    for (i <- 1 to n)
      sum +=i
    sum
  }
  def main(args: Array[String]): Unit = {
    lazy val i = sum_lazy(100)
    // 定义一个函数，输入三个整数
    // 打印较小的两个数字的和，如果有需要可以选择是否获取较大的数字
    def sum(x: Int, y: Int, z: Int): () => Int = {
      def max() = {
        println("max被调用了")
        var max = if (x > y) x else y
        max = if (max > z) max else z
        max
      }
      println(x + y + z - max)
      // 不是调用max函数，而是将max函数整个函数作为结果返回
      // 所以此时这个sum的返回值是一个函数
      max _
    }
    // 此时r是一个函数
    var r = sum(3, 6, 2)
    println("***********")
    println(r)
    println("***********")
    println(r())
    println(i)

  }

}
