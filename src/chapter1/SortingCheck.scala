package chapter1
/**
 * You can use assign a reference to higher order function
 * and pass it to another function call, because in Scala internally everything is an object
 * 
 */
object SortingCheck {
  def main(args:Array[String]):Unit={
    val elementsAsc = Array(1,2,3,4,5,6)
    val elementsAscFalse = Array(1,2,3,5,4,6)
    val elementsDesc = Array(5,4,3,2,1)
    val elementsDescFalse = Array(1,2,3,4,5,6)
    
    val checkForAscendingOrder = (x:Int, y:Int)=>{if (x<=y)true else false}
    
    println(isSorted(elementsAsc, checkForAscendingOrder))
    println(isSorted(elementsAscFalse, checkForAscendingOrder))
    
    val checkForDecendingOrder = (x:Int, y:Int)=>{if (x>=y)true else false}
    
    println(isSorted(elementsDesc, checkForDecendingOrder))
    println(isSorted(elementsDescFalse, checkForDecendingOrder))
  }
  
  import scala.annotation.tailrec
  def isSorted[A](arr:Array[A],f:(A,A)=>Boolean):Boolean={
    @tailrec
    def loop(n:Int,x:A):Boolean={
      if(n>=arr.length)true
      else if(!f(x,arr(n)))false
      else loop(n+1,arr(n))
    }
    loop(0,arr(0))
  }
}