package cn.gl.Demo
import org.slf4j.LoggerFactory
object Demo01  {
  val logger = LoggerFactory.getLogger(this.getClass)
  def main(args: Array[String]): Unit = {
    logger.info("time stamp:{}",System.currentTimeMillis())
    logger.info("abcd")
    //var 就是个变量
    var i : Int = 5
    var + : Int =7   //标识符你可以使用标识符，但是如果是使用了，那么这个标识符整个必须全部使用特殊字符
    logger.info("{}",+)
    var `final` : String = "abc"
    logger.info(`final`)
    //变量反推类型
    var s1 = "中国"
    logger.info(s1)
    //向上造型   不能用第二种的推导方式，必须声明类型
    var a : Animal= new Dog
    var b : Dog = a.asInstanceOf[Dog]

  }

}
class Animal{}
class Dog extends Animal{}