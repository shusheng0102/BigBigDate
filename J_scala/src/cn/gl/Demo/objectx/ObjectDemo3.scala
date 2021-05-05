package cn.gl.Demo.objectx

object ObjectDemo3 {

  def main(args: Array[String]): Unit = {

    var t = new Teacher("Amy", 29, "female")

  }

}

// 需要这个类只能对外提供含参构造，有需要这个类中的属性可以改
// 将无参主构造私有
class Teacher private() {

  private var name: String = _
  private var age: Int = _
  private var gender: String = _

  // 提供含参辅构造
  def this(name: String, age: Int, gender: String) {
    this()
    this.name = name
    this.age = age
    this.gender = gender
  }

  def setName(name: String) = this.name = name

}
