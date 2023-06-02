fun main(){
    var hello:String
    hello="Hello World"
    var firstname="Laurine"
    var lastname="Maina"

    println(hello)
    println(hello[1])
    println(firstname+" "+lastname) //or (below)
    println(firstname.plus(lastname))
    println(hello.toUpperCase())
    println(lastname.length)
    println("Hello there,my name is $firstname") //String interpolation
    println(hello.indexOf(string ="World"))

//Comparison Operators
    var num:Int=100
    println(num<20)
    println(num>10)
    println(num==30)
    println(num<=30)
    println(num>=30)
    println(num!=30) //Not equal to

//Logical Operators
    var myNumber=90
    println(myNumber<10 && myNumber==30) //and (checks if all conditions are true,if so,true)
    println(myNumber<10 || myNumber==30)//or
    println(!(myNumber<10 || myNumber==30))//not (!) (reverses the results)

}