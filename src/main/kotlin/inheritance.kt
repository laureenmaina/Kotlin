//Parent class
open class Animal{
    var age:Int=16
    var gender:String="Female"
    fun isMammal(){
        println("Animal is a mammal")
    }
}
//Child class
class Duck:Animal(){
    var color:String="White"

    fun swim(){
        println("Swimming")
    }
}
class Fish:Animal(){
    var canEat:Boolean=true

    fun swim(){
        println("Swims")
    }
}
class Horse:Animal(){
    var isWild:Boolean=true

    fun run(){
        println("Runs")
    }
}

fun main(){
    var d=Duck()
    println(d.gender)

    var h=Horse()
    println(h.isMammal())

    var f=Fish()
    println(f.swim())
}
