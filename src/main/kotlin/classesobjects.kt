class Person{
    //Variables/Properties/Attributes/Data members
    var name:String="Laurine"
    var age:Int=18
    var location:String="Nairobi"
    var yearOfBirth:Int=2005

    //Methods//Functions
    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }
}

fun main(){
    var teacher=Person()
    println(teacher.location)

    teacher.eat()


}