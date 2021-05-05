package cn.gl.Demo.operator

object OperatorDemo {

  def main(args: Array[String]): Unit = {

    // var i = 5
    // var j = 7
    // // var sum = i + j
    // // 等价于
    // var sum = i.+(j)
    // println(sum)

    // 如果出现.，先算。
    // 如果全部都有.，那么就顺着计算
    // println(5 + 3 * 7)
    // println(5.+(3) * 7)
    // // println(7 * 5.+(3))
    // println(5.+(3).*(7))
    // println(5 + 3)
    // println(5.+(3))

    // int i = 5;
    // int x =3, y = 4;
    // var i = 5
    // var x=3, y = 4
    // i += 5

    /*
      int i = 3;
      int j = 4;
      int z = 5;
      z = i = j;
     */
    //var i = 3
    //var j = 4
    //var z = 5
    //// z = i = j
    //var r: Unit = i = j
    //println(r)

    //println(i > j)
    //println(i.>(j))

    // var s = "abc" + "def"

    // Scala中，字符串还可以做乘法运算
    println("*" * 5)

  }

}
