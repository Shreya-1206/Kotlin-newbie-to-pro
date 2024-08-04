
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
    val isAdmin : Boolean = false
    println("Kiya is A Admin - $isAdmin")

    ///ARITHMETIC OPERATIONS //////
    val x =9
    val y = 10
    println("$x + $y = ${x+y}")

    println("${x*y}")
    println(10090*1234)
    println(15/7) // 15 / 7 is 2.something but whole num / whole num = result is whole num

    println(15/7f) // add f to whole to make it float

    // / DECIMALS Numbers ////
    println(calVolumeOfSphere(2))

    val dec1 : Float = 23.45F
    val dec2 = 90.34
    println("$dec1 + $dec2 = ${dec1 + dec2}")

    val doub1 : Double = 20.8989363792716673637
    val doub2 = 8.909
    println("Double Number Addition - ${doub1 + doub2}")

    ////STRINGS ////
    val nameIs = "Shreya"
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

    println(number1 == number2)
    println(number1 < number2)
    println(number1 <= number2)
    println(number1 != number2)
    println(number1 == number2 && number3 == number4)
    println(number1 == number2 || number3 == number4)
    println(!(number1 == number2) || number3 == number4)

    //AND  is the boss of OR operator
    println(!(number1 == number2 || number1 < number2 && number3 == number4 ))


    /// IF CONDITIONS ///
    val x1 =3
    val x2 = 3
    val x3 = if(x1 + x2 == 5) 5 else 4
    if(x1 < x2 || x1*x1 == 5 ){
        println("One statement is true ")
    } else if(x1 < x2){
        println("Both the statement is true")
    } else {
        println("None of the statement is true")
    }
    println("Here the the value of the x3 is based on condition - $x3")


    //check palindrome
    println(chckPalindrome("hello"))
    println(chckPalindrome("racecar"))
    println(chckPalindrome("otto"))
    println(chckPalindrome("bottle"))

    ////  Null values User Input Readline() /////////

    val userAge = readLine()
    val age = userAge?.toInt()
    if(age != null && age < 18){
        println("You are Not Allowed ")
    } else if(age != null && age >= 18 && age <= 56) {
        println("Your Welcome here ")
    } else{
        println("Sorry Your Too old For this ...")
    }

    val userSum = readLine()
    val sum = userSum?.toInt()
    if(sum != null){
        println(sum - 5)
    }

    // WHILE LOOPS/////

    val arr = arrayOf("Hello", "Hey" , "Namaste")

    var holder = 0
    while (holder < arr.size){
        println(arr[holder])
        holder ++
    }


      // questions : take an input of a num and count down till 0
    var num = readLine()
    var numToInt = num?.toInt()

    if(numToInt != null){
        var i = numToInt
        while(i >= 0){
            println(i)
            i--
        }
    }

    // Now Question take 2 numbers as input val cal power
    println("Write A Number")
    val int = readLine()
    println("Write the second number")
    val expo = readLine()

    val intConvert = int?.toInt()
    val expoConvert = expo?.toInt()

    if(intConvert != null && expoConvert != null){
        var result = 1
        var count  = 0
        while (count < expoConvert) {
            result = result * intConvert
            count++
        }
        println("$intConvert and $expoConvert power is = $result")
    }

    ///FOR LOOPS ////

    for (x in 1 ..9){
        println(x)
    }

    for (x in 10 downTo 1 step 3) {
        println("Down to $x")
    }

    val arr1 = arrayOf(1,2,3,4,5,6)
    var total =  0

    for (x in arr1){
        total = total + x
    }
    println("The sum of the array is  - $total")

    // Homework for loop
      var avg = 0.0
      for (x in 1..5){
          var intNum = readLine()?.toInt()
          if(intNum != null ) {
              avg = avg + intNum/5.0
          }
      }
      println("The New Average of 5 Numbers  - $avg")
    /////LISTS/////

    var numArr = arrayOf(1,2,3)
    var numList = listOf(1,2,3)
    var numMutableList = mutableListOf(1,2,3)

    numMutableList[0] = 3
//    numList[0]=3
    numArr[0] = 3


    println(numMutableList)
    println(numList)
//    println(numArr)   /// num arr are not able to print

    numMutableList.removeAt(0)
    println(numMutableList)

    //List can do ths but not array
    var list = mutableListOf<Int>()

    for (x in 1..10){
        var x = readLine()?.toInt()
        if(x != null ) {
            list.add(x)
        } else {
            println("Strings are not allowed")
        }
    }
    println(list)


    //Homework for list
    println("enter 5 numbers")
    var list1 = mutableListOf<Int>()
    for (x in 1..6){
        var x =  readLine()?.toInt()
        if(x != null) {
            list1.add(x)
        }else {
            println("Please write a correct input ")
        }
    }
    val list1Reversed = list1.reversed()
    for (x in list1Reversed){
        println("reversed ${x}")
    }

    ////// WHEN eEXPRESSION/////
    val userAge2 = readLine()?.toInt()

    when(userAge2) {
        in 0..10 ->("Your very young !!!")
        in 11..17 -> println("Your a teenager")
        18 -> println("Yes you are 18 now !!!")
        19,20,21-> println("you are young adult")
        in 22..55 -> println("You are an adult")
    }
    //fibbonic series
    var list3= mutableListOf(0,1)
    var numFibb = readLine()?.toInt()

    if(numFibb != null){
        for (x in 2..numFibb- 1){
            list3.add(list3[x-2] + list3[x-1])
        }
    }
    println(list3)


    ////FUNCTIONS AND PARAMETERS////
    calSum(10)

    ///FUNCTIONS AND RETURN////
   val itemOfFruits = printList(listOf("Apple", "Banana","Cherry"))
    println(itemOfFruits)

    val findIndex =findNum(listOf(1,2,3),3)
    println(findIndex)

    ///FUNCTIONS USING VARAG , DEFAULT PARAMETER AND NAMED FUNCTION ///////
    var arrVararg = intArrayOf(10,20,30)
    var maxValue = getMax(1,8,9,*arrVararg,2,3,4,)
    println("The Max Number using Varag is $maxValue")


    ////////EXTENTION FUNCTIONS //////
    println("Hey plz enter a number to check weather its a prime or not ")
    var chkPrime = readLine()?.toInt()

    if(chkPrime != null){
        println("Hey the $chkPrime is ${chkPrime.isPrime()}")
    }else {
        "No Not A Prime "
    }

    var listOfNums = mutableListOf(1,2,3,4,5)
    println("The product of the list is - ${listOfNums.multiplyNum()}")

}
  ///Logic volume of sphere
fun calVolumeOfSphere(radius : Int) : String{
    val constant = 0.75
    val pi = Math.PI
    val result = constant * pi*radius*radius*radius
    return "The volume of a sphere with radius $radius is - $result"
}

 /// Check Palindrome (IF CONDITION))
fun chckPalindrome(word : String) : String {
    val reverseWord = word.reversed()
     if(word == reverseWord) {
        return "$word is a Palindrome !!!"

     } else {
         return "${word} is not a Palindrome !!!"
     }
}

////FUNCTIONS AND PARAMETERS////
fun calPower (base : Int, expo:  Int) {
    var result = 1
    for (x in 1.. expo){
        result *= base
    }
    println("$base to the $expo the power is $result")
}


fun calSum (n: Int) {
    var result  = 0
    for (x in 1..n ){
        result += x
    }
    println("The Sum From 1 to $n is $result")
}

///FUNCTIONS WITH RETURN KEYWORD///
fun printList(list :List<String>) : String{
//    var list = listOf<String>("Apple", "Banana","Cherry")

    return list[1]
}

fun findNum (list : List<Int>, num : Int) : Int{
   for (i in 0.. list.size -1) {
       if(list[i] == num){
           return i
       }
   }
    return -1
}

//// function with vararg and default para meters

fun getMax (vararg numbers : Int) : Int{
    var max = numbers[0]
    for (number in numbers){
        if(number > max){
            max  = number
        }
    }
    return max
}

////EXTENSION FUNCTION ///////
fun Int.isPrime() :Boolean{
    for (i in 2..this - 1){
        if(this % i == 0) {
            return false
        }
    }
    return true
}
fun List<Int>.multiplyNum() : Int {
    var res = 1
   for (i in this){
    res *= this[i]
   }
    return res
}
