package cn.gl.Demo.function

object FunctionDemo8 {

  def main(args: Array[String]): Unit = {

    // 定义一个函数，打印2个整数的计算结果
    // 当定义一个函数的时候，如果出现未知的数据
    // 那么需要将未知的数据以参数形式体现
    def printResult(x: Int, y: Int, f: (Int, Int) => Int) = {
      println(f(x, y))
    }

    def sum(x: Int, y: Int) = x + y

    printResult(3, 7, sum)

    // 匿名函数
    printResult(3, 7, (x: Int, y: Int) => x + y)
    // 等价于：
    // 定义参数的f的时候，已经规定了f中参数的类型
    printResult(4, 7, (x, y) => x + y)
    // 等价于：
    // 如果匿名函数中，参数只使用了一次，那么参数列数列表可以省略
    printResult(5, 9, _ + _)

    printResult(6, 12, (x, y) => if (x > y) x else y)

  }

}
