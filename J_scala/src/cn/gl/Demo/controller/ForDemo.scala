package cn.gl.Demo.controller

object ForDemo {

  def main(args: Array[String]): Unit = {

    // 求1-10的和
    var sum = 0
    /*
     Java:
     for(int i = 1; i <= 10; i++)
      sum += i
     */
    for (i <- 1 to 10)
      sum += i

    println(sum)

    // 遍历数组
    // 等价于Java中：int[] arr = {2, 5, 4, 8, 9};
    var arr = Array[Int](2, 5, 4, 8, 9)
    // Java：for(int i = 0; i < arr.length; i++)
    for (i <- 0 to arr.length - 1)
      println(arr(i))
    // 等价于
    for (i <- 0 until arr.length)
      println(arr(i))
    // to和until：to到边界，until不包含边界
  }

}
