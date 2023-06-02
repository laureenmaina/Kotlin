open class Figure{
    var Start:String="Start"
    fun Area(){
         println("Area of a figure")
     }
    fun Perimeter(){
        println("Perimeter of a figure")
    }
    fun Draw(){
        println("Drawings of a figure")
    }
}
class Circle:Figure(){
    var Radius:Int=72
}
open class Rectangle:Figure(){
    var Width:Int=605
    var Height:Int=450
}
class Square:Rectangle(){
}
fun main(){
    var c=Circle()
    println(c.Start)
    var r=Rectangle()
    println(r.Height)
    var s=Square()
    println(s.Width)
}