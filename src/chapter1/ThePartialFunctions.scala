package chapter1
/**
 * For kind of requirement where we need to apply a function
 * only on a subset of input and return back a function
 * which will be used in further calculation
 * Here set of inputs are:
 * 1. Type of Interest Rate Calculator
 * 2. Principal Amount
 * 3. Period
 * 4. Interest Rate
 */
object ThePartialFunctions {
  def main(args: Array[String]): Unit = {
    val calculateCompoundInterest = getInterestCalculator("compound")
    println(calculateCompoundInterest(100,10,10))
    
    val calculateSimpleInterest = getInterestCalculator("simple")
    println(calculateSimpleInterest(100,10,10))
  }

 def getInterestCalculator(interestType:String): (Double,Double,Int)=>Double={
   interestType match {
     case "simple" => (principal:Double,rate:Double, time:Int) => principal*rate*time/100
     case "compound" =>(principal:Double,rate:Double, time:Int) => principal*(scala.math.pow((1+rate/100), time))
   }
 }

}