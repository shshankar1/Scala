package part2
/**
 * function addAndThenMultiply has input params as 2 separate list
 * 1st set has number where as 2nd set has factor which need to be multiplied
 */
object MultipleArgumentParameterList {
  def main(args:Array[String]):Unit={
    println(addAndThenMultiply(4, 5)(3))
  }
  
  def addAndThenMultiply(x:Int,y:Int)(multiplyFactor:Int):Int={
    (x+y)*multiplyFactor
  }
}