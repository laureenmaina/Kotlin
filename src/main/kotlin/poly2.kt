open class shape{
    open fun area(){
        println("Area")
    }
}
class circle:shape(){
    override fun area(){
        println("Area of a circle")
    }
}
class triangle:shape(){
   override fun area(){
        println("Area of a triangle")
    }
}
class rectangle:shape(){
    override fun area(){
        println("Area of a rectangle")
    }
}
fun main(){
    var c=circle()
    println()
    var t=triangle()
    println()
    var r=rectangle()

}