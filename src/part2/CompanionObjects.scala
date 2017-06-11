package part2
/**
 * Here object Pizza is companion for Pizza class.
 * Each companion object has apply function which
 * we can use for our own implementation.
 * Also we can have multiple overloaded version of apply function.
 * Here we are using apply function as factory method
 * to return a new pizza object
 */
object CompanionObjects {
  def main(args: Array[String]): Unit = {
    val thinCrustPizza = Pizza("Thin Crust")
    println(thinCrustPizza)
    
    val thickCrustPizza = Pizza("Thick Crust")
    println(thickCrustPizza)
    
  }
}

class Pizza(crustType: String) {
  override def toString = "Pizza Crust Type: " + crustType

}
object Pizza {
  def apply(crustType: String) = new Pizza(crustType)
}