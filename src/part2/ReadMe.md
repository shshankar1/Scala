Benifits of case class:
1. Gives a companion object 
2. Since you have companion object with apply method access, you can use it as an factory method.
3. You get equals and hashcode function which compares the structure
4. toString and copy function by default 
5. unapply function which can help you to deconstruct the case class to extract it fields.

Covariant Return Type:
1. List[T] --> can accomodate elements with type T only (called as invariant)
2. List[+T] --> list with element of subtype of T can be substituted where List[T] required (called as convariant)
3. List[-T] --> list with element of supertype of T can be substituted where List[T] required (called as contravariant)

Trait:
An interface which can have concrete function implementation

sealed trait:
This declaration mean that all implementation will reside in same file.

Companion Objects:
* Scala doesn't have static variable/method functionality. 
* So language has provided the features of static using companion object. 
* This is like single object per class and share same name as class.
* We can use this object as factory to create class objects


scala.collection.immutable.List:
Scala implementation of immutable linked list where list ends with Nil 

Please read the examples in below order:
1. MultipleArgumentParameterList
1. SingleLinkedList
2. PatternMatching
3. CompanionObjects
4. VariadicFunction
5. ListTailFunctionImplementation
