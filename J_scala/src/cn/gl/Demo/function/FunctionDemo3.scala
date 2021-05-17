package cn.gl.Demo.function

object FunctionDemo3 {

  // 函数可以重载
  def sum(i: Int, j: Int) = i + j

  def sum(i: Int, j: Int, k: Int) = i + j + k

  // 求任意多个整数的和
  /*
   在Java中可以利用可变参数：
   public int sum(int... arr)
   */
  // 可变参数本质上是一个数组
  // 利用*来定义可变参数
  def sum(arr: Int*) = {
    var sum = 0
    for (i <- 0 until arr.length)
      sum += arr(i)
    sum
  }

  def twice(i: Int) = {
    i * 2
  }

  def main(args: Array[String]): Unit = {
    println(twice(5))
  }
}
