package chapter1

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(36); 
  val emptyArr:Array[Int] = Array();System.out.println("""emptyArr  : Array[Int] = """ + $show(emptyArr ));$skip(16); val res$0 = 
  emptyArr :+ 4;System.out.println("""res0: Array[Int] = """ + $show(res$0))}
}
