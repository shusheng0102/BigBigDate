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

  }
}
