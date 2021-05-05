package cn.gl.Demo.controller

object ForDemo3 {

  def main(args: Array[String]): Unit = {

    /*
      *****
      *****
      *****
     */
    // for (i <- 1 to 3)
    //   println("*" * 5)
    /*
      *
      **
      ***
      ****
      *****
     */
    // for (i <- 1 to 5)
    //   println("*" * i)

    // 打印50以内5的倍数而不是7的倍数的数字
    // for (i <- 0.to(50, 5))
    //   if (i % 7 != 0)
    //     println(i)
    // 等价于
    // 这种写法称之为循环守护式/条件式/判断式
    for (i <- 0.to(50, 5) if (i % 7 != 0))
      println(i)

  }

}
