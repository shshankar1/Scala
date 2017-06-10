package chapter1

object AbsoluteValueCalculator {
  def main(agrs: Array[String]):Unit={
    println(formatAbs(-5))
  }
  
  def abs(n:Int):Int={
    if(n<0)-n
    else n
  }
  
  private def formatAbs(x:Int) ={
    val msg = "The absolute value of %d is %d"
    msg.format(x,abs(x))
  }
}