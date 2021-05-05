package cn.gl.Demo.objectx

object ObjectDemo2 {

  def main(args: Array[String]): Unit = {

    var d = new Driver("Bob", 19, "male");

  }

}

// 在构造器中定义的参数默认就是当前类的属性
// 主构造器
class Driver(name: String, age: Int, gender: String) {

  var no: String = _
  var addr: String = _

  // def setName(name:String) = this.name = name

  // 辅构造器
  def this(name: String, age: Int, gender: String, addr: String) {
    this(name, age, gender)
    this.addr = addr
  }

  // 辅构造器中必须先调用主构造器
  def this(name: String, gender: String) {
    this(name, 18, gender)
  }

}
