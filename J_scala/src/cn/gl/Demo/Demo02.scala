package cn.gl.Demo

import org.slf4j.LoggerFactory

object Demo02  {
  val logger = LoggerFactory.getLogger(this.getClass)
  def main(args: Array[String]): Unit = {
    logger.info("time stamp:{}",System.currentTimeMillis())
    logger.info("类型转换")
    //默认
    var i = 5
    logger.info("{}",i.getClass)
    logger.info("{}",i)
    var d : Double = i
    logger.info("{}",d.getClass)
    logger.info("{}",d)

    var d1 : String = "2528"
    logger.info("{}",d1.getClass)
    logger.info("{}",d1)
    //通过隐藏函数自定了一个转化规则
    implicit def str2int(strabc:String) : Int = {
      logger.info("调用了方法：implicit def str2int(strabc:String) : Int")
      return Integer.parseInt(strabc)
    }
    //自动调用隐藏函数来进行转换
    var d2 : Int = d1
    logger.info("{}",d2.getClass)
    logger.info("{}",d2)


  }

}
