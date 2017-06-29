package stringinterpolation

object MyApp {
  def main(args: Array[String]):Unit={
    val name ="Tim"
    val age = 45
    println(s"$name is $age years old")
    println(s"$name's age is 1 year less than ${age+1}")
    println(s"$name's age is $age: ${age==45}")
    
    val s = new Student("Shashi",45)
    println(s"${s.name} has total score of ${s.score}")
    
    //raw interpolation
    val test = raw"never put \n a new line"
    println(raw"$test")
  }
}

case class Student(name:String, score:Int)