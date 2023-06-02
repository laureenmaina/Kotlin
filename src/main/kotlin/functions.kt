fun main(){
    //predefined functions
    println("Kotlin")
    var squareroot=Math.sqrt(225.0)
    println(squareroot)

    var round1=Math.ceil(3.45)
    println(round1)

    var round2=Math.round(3.45)
    println(round2)

    myFun() //another function is called out from the main function
    add(34,58)
    add(58,59)

    mydetails("Laurine",18)
    mydetails("Glory",26)
}
//user-defined Functions
fun myFun(){
    println("Today is Friday")
}
fun add(num1:Int,num2:Int){

    println(num1+num2)
}
fun mydetails(name:String,age:Int){

    println("$name is $age years old")
}
