// package cn.tedu.objectx.a
// 等价于
package cn
package tedu
package objectx
package a

object PackageDemo {

  def main(args: Array[String]): Unit = {

    var p1 = new a.b.P1
    var p2 = new a.P2
    var p3 = new a.c.P3

  }

}

package b {

  class P1 {}

}

class P2 {}

package c {

  class P3 {
    def m() = test()
  }

}

class P4 {
  def m() = c.test()
}

// 包对象
package object c {
  def test() = "abc"

  var i = 9
}
