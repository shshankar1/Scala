package part2

/**
 * Variadic are variable length arguments 
 */
object VariadicFunction {
  def main(args:Array[String]):Unit={
    val contact1 = new Contact("X","345","6787","456")
    println(contact1.toString)
    
    val updatedPhoneNumbers = contact1.updatePhoneNumbers("789","1245")
    println(updatedPhoneNumbers)
  }
}

class Contact(name:String, phoneNumbers:String*){
  override def toString():String="[Name: "+name+", Phones: "+phoneNumbers+"]"
  
  def updatePhoneNumbers(phoneNumbers:String*):Seq[String]={
    this.phoneNumbers ++ phoneNumbers
  }
}