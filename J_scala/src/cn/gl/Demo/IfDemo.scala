package cn.gl.Demo

import org.slf4j.LoggerFactory

import scala.io.StdIn

object IfDemo {

  def main(args: Array[String]): Unit = {
    var i =

    println("我输入的是什么："+i)
    implicit def str2int(str:String) : Int = {

      return Integer.parseInt(str)
    }
    var j : Int = i
    //无论if判断失败还是成功，结果类型都是Unit
    var sb=if(i%2 == 0){
      println(j+"是一个偶数")
    }else{
      println("对不起，输入的值不是一个偶数")
    }
    println(sb)

    //if判断成功，则计算结果类型是String,失败就是Unit
    var sb1=if(i%2 == 0){
      "偶数sdhnjfhjksh"
    }
    println(sb1)
  }
}
