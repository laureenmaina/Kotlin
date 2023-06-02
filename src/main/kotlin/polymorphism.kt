open class Shape{
   open fun draw(){
        println("Drawing.")
    }
}
class rectangles:Shape(){
   override fun draw(){
        println("Drawing a rectangle.")
    }
}
class square:Shape(){
   override fun draw(){
        println("Drawing a square.")
    }
}
fun main(){
    var r=rectangles()
    r.draw()
    var s=square()
    s.draw()
}

