package cn.gl.Demo.objectx

object ObjectDemo1 {

  def main(args: Array[String]): Unit = {

    var p = new Person

    var s = new Student
    // s.name = "Amy"
    // s.age = -15
    s.setName("Amy")
    // 通过对象调用方法，并且方法的参数只有1个，那么可以省略.和()
    s setAge 15
    // 等价于
    s.setAge(15)

    for (i <- 1 to 5) {
      println(i)
    }
  }

}

// 如果一个类没有属性和方法，那么可以省略{}
class Person

class Student {

  // 在创建对象的时候会自动给属性赋予默认值
  private var name: String = _
  private var age: Int = _

  def getName = name

  def setName(name: String) = this.name = name

  def getAge = age

  def setAge(age: Int) = if (age > 3) this.age = age
}
