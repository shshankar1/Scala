package part1
/**
 * pass any condition as function
 * and getAllMatches function will return all elements which satisfies that condition
 * Note: Manifest is used because JVM does type erasure and on runtime there is not type
 * associated with generic object, so we cannot initialize an array on line 37 if type
 * is not specified. As a workaround Scala given an option of Manifest 
 * (for more details check Scala documentation on Manifest) 
 */
object PolymorphicFunctionWithHigherOrder {
  def main(args: Array[String]): Unit = {
    val intArray = Array(13, 45, 21, 34, 21, 19, 5, 98, 101, 23)

    //get array of all elements greater than 20
    println(getAllMatches(intArray, (x: Int) => { x > 20 }).deep.mkString(","))

    //get array of all elements greater than 69
    println(getAllMatches(intArray, (x: Int) => { x > 69 }).deep.mkString(","))
    
    //get all characters greater than D
    val charArray = Array("A","C","B","T","U","I")
    println(getAllMatches(charArray, (x: String) => { x > "D" }).deep.mkString(","))
  }

  import scala.annotation.tailrec
  def getAllMatches[A: Manifest](arr: Array[A], f: A => Boolean): Array[A] = {
    @tailrec
    def loop(n: Int, acc: Array[A]): Array[A] = {
      if (n >= arr.length) return acc
      else {
        if (f(arr(n))) {
          loop(n + 1, acc :+ arr(n))
        } else {
          loop(n + 1, acc)
        }
      }
    }

    loop(0, Array[A]())
  }
}