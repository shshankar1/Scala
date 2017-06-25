<b>Scala Implicit Classes:</b>
Implicit classes in Scala doesn't add anything new which can't be achieved with existing API.
<br/>
It just help to get code more cleaner and once you start building up complicated expressions, this kind of syntax can really help.
</br>
In given example I am trying to match any of given input string in given text and if yes return true.

Now the imperative way to handle this could be write a function for the check and pass everything in input params.
```
println(StrUtils.containsOneOf(text, "implicit","example"))
```
This ends up code very clunky.

In second attempt I have written an implicit class which does the same functionality. So when you call this code looks more cleaner and it gives impression like containsOneOf is function of String only.
```
println(text.containsOneOf("test", "coupon"))
```

Note: Please take care of import required.

