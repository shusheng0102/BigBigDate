package cn.gl.Demo.controller

object ForDemo4 {

  def main(args: Array[String]): Unit = {

    // for (i <- 1 to 5)
    //   for (j <- 1 to 3)
    //     println(i + "行" + j + "列")
    // 等价于
    // for (i <- 1 to 5; j <- 1 to 3)
    //   println(i + "行" + j + "列")
    // 等价于：
    for {
      i <- 1 to 5
      j <- 1 to 3
    } {
      println(i + "行" + j + "列")
    }

  }

}
