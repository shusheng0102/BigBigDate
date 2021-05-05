package cn.gl.Demo.controller

object WhileDemo {

  def main(args: Array[String]): Unit = {

    var i = 1
    var r = while (i <= 10) {
      println("Hello")
      i += 1
    }
    println(r)

    var j = 0
    var r2 = do {
      println(j)
      j += 1
    } while (j < 3)
    println(r2)
  }

}
