package cn.gl.Demo

import org.slf4j.LoggerFactory

object OperatorDemo {
  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    var i =3
    var j = 7
    var sum = i.+(j)
    logger.info(sum.toString)
    println(3+5*7)   //都是省略形式，那么就按照四则运算的优先级来算
    println(3.+(5)*7)    //56    带点，优先计算带点的   ，  如果全部带点，那么按照顺序计算，大家都是平级，从左往右
    //赋值运算符
    var x=3
    var y=4
    var z=6
    //y=x,将x的值赋给y,此时运算结束，没有结果，所以y=x的值的类型是Unit
    //z是Int类型，所以类型错误
    //z=y=x

    //x+=5  将结果赋值给了X，此时没有计算结果，返回值类型也是Unit
    var r =x+=5
    logger.info(r.toString)    //打印结果   ()

    //允许对字符串进行乘法运算
    // * 出现5次
    println("*"*5)

  }
}
