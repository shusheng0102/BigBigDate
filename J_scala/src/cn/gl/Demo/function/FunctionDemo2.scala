package cn.gl.Demo.function

object FunctionDemo2 {

  // 打印m行n列的*组成的矩形
  // def printStar(m: Int, n: Int): Unit = {
  //   for (i <- 1 to m)
  //     println("*" * n)
  // }
  // 如果返回值类型是Unit，那么=可以省略
  def printStar(m: Int, n: Int) {
    for (i <- 1 to m)
      println("*" * n)
  }
  def random1To10()=(Math.random()*10+1).toInt

  def main(args: Array[String]): Unit = {
    println(random1To10)
  }

}
