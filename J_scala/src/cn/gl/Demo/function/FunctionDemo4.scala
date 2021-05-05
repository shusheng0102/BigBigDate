package cn.gl.Demo.function

object FunctionDemo4 {

  // 递归求和
  // def sum(n: Int): Int = {
  //   if (n == 1)
  //     return 1
  //   n + sum(n - 1)
  // }
  def sum(n: Int): Int = {
    if (n == 1) 1
    else n + sum(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println(sum(10))
  }

}
