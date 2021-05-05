package cn.gl.Demo.function

object FunctionDemo9 {

  def main(args: Array[String]): Unit = {

    // 定义一个函数计算价格 - 标价，折扣
    // 参数的隐藏值
    def offPrice(price: Double, off: Double = 1) = price * off

    //println(offPrice(32, 0.88))
    //println(offPrice(20))

    // 函数的懒值
    def sum(x: Int, y: Int) = {
      println("running~~~")
      x + y
    }

    // 函数的懒加载
    lazy val r = sum(5, 9)

    println(offPrice(32, 0.88))
    println(offPrice(20))

    println(r)
  }

}
