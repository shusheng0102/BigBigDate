package cn.gl.Demo.function

object FunctionDemo7 {

  def main(args: Array[String]): Unit = {

    // Curry柯里
    // 构成了闭包，但是函数中直接嵌套并且返回函数，没有其他额外的代码
    // def max(x: Int): Int => Int = {
    //   def m(y: Int) = if (x > y) x else y
    //   m _
    // }
    // 等价于
    // 函数的柯里化
    def max(x: Int)(y: Int) = {
      if (x > y) x else y
    }

    // 柯里化之后，不允许这种写法
    // var r = max(8)
    // println(r(4))

    var r2 = max(8)(4)
    println(r2)

  }

}