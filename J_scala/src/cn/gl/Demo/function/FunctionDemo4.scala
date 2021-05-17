package cn.gl.Demo.function

object FunctionDemo4 {

  // 递归求和--------递归函数必须手动执行返回值类型，因为在递归结束之前无法判断结果类型
  // def sum(n: Int): Int = {
  //   if (n == 1)
  //     return 1
  //   n + sum(n - 1)
  // }
  def sum(n: Int): Int = {
    if (n == 1) 1
    else n + sum(n - 1)
  }
  //1是參數默認值。如果沒有指定折扣，那么就按照全价来计算
  def realPrice(price:Double,off:Double=1)= price*off

  def main(args: Array[String]): Unit = {
    println(sum(10))
  }

}
