package cn.gl.Demo.function

object FunctionDemo1 {

  // 求两个整数的和
  def add(x: Int, y: Int): Int = {
    print("求和：")
    return x + y
  }

  // 如果不写return，那么函数的最后一行的计算结果默认作为返回值
  def minus(x: Int, y: Int): Int = {
    print("求差：")
    x - y
  }

  // 如果函数体只有1句，那么可以省略{}不写
  def mutiply(x: Int, y: Int): Int = x * y

  // 函数的返回值类型是可以由函数的结果来推导的
  // 那么省略返回值类型
  // 如果省略了返回值类型，那么此时不能写return只能自动推导
  def devide(x: Double, y: Double) = x / y

  // 如果一个函数没有参数，那么可以省略()
  // 如果这个函数没有()，那么调用的时候就不能写()
  def random = Math.random()

  // def random() = Math.random()


  def main(args: Array[String]): Unit = {
    println(add(2, 8))
    println(minus(8, 1))
    // 如果一个函数没有参数，那么在调用的时候可以省略()
    // println(random())
    println(random)

    var c = new Cat
  }

}

class Cat {}
