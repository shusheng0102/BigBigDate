package cn.gl.Demo.function

object FunctionDemo6 {

  def main(args: Array[String]): Unit = {

    // 求2个的整数的积
    // 先输入第一个整数
    // 通过函数嵌套并且返回函数的形式
    // 延长了外部函数中变量的生命周期
    // 这种形式称之为闭包
    def multiply(x: Int) = {
      def m(y: Int) = x * y

      m _
    }

    // Scala是运行在JVM上，所以这个函数也是运行在栈内存中
    // 当一个函数运行完成之后，这个函数会立即从栈内存中移除
    var r = multiply(5)
    println(r(7))
    println(r(9))

    var r2 = multiply(3)(6)
    println(r2)

  }

}
