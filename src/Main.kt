fun main() {
    println("Hello World!")

    // val val Int Boolean String declaration
    var myName : String = "Shreya"
    myName = "Kiya"
    println("My Name is $myName")

    val myAge : Int = 25
   //myAge = 24 // Error Val cannot be reassigned
    println("My Age is $myAge")

    var myHobby : String
    myHobby = "Reading"
    println("My Hobby is $myHobby")

    val isAdmin : Boolean
    isAdmin = false
    println("Kiya is A Admin - $isAdmin")

    ///ARITHMETIC OPERATIONS //////
    val x =9
    val y = 10
    println("$x + $y = ${x+y}")

    println("${x*y}")
    println(10090*1234)
    println(15/7) // 15 / 7 is 2.something but whole num / whole num = result is whole num

    println(15f/7f) // add f to whole to make it float

    // / DECIMALS Numbers ////
    println(calVolumeOfSphere(2))

    val dec1 : Float = 23.45F
    val dec2 = 90.34
    println("$dec1 + $dec2 = ${dec1 + dec2}")

    val doub1 : Double = 20.8989363792716673637
    val doub2 = 8.909
    println("Double Number Addition - ${doub1 + doub2}")

    ////STRINGS ////
    val nameIs = "  Shreya"
    println("My Name is Reversed as - ${nameIs.uppercase().reversed()}")
    println("My Name ends with a  - ${nameIs.endsWith("a")}")
    println("My Name after slicing - ${nameIs.slice(2..5)}")
    println("My Name's hashcode is - ${nameIs.hashCode()}") //changes to hashcode
    println("My Name after implementing char - ${nameIs.chars()}") //doubt
    println("My Name's after trimming the whitespace - ${nameIs.trimStart()}")
    println("My Name's spliting with whitspace  - ${nameIs.split("")}")


    ////LOGICAL OPERATORS AND COMPARISON

    val number1 = 2
    val number2 = 3
    val number3 = 3
    val number4 = 4

    println(number1 == number2) //false
    println(number1 < number2)  //true
    println(number1 <= number2)  //true
    println(number1 != number2)   //true
    println(number1 == number2 && number3 == number4) //false
    println(number1 == number2 || number3 == number4) //false
    println(!(number1 == number2) || number3 == number4) //true

    //and is the boss of Or operator
    println(!(number1 == number2 || number1 < number2 && number3 == number4 )) //true
}
  ///Logic volume of sphere
fun calVolumeOfSphere(radius : Int) : String{
    val constant = 0.75
    val pi = Math.PI
    val result = constant * pi*radius*radius*radius
    return "The volume of a sphere with radius $radius is - $result"
}