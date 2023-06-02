import java.util.Scanner

fun main(){
    //perimeter of a rectangle
    var read=Scanner(System.`in`)
     println("Enter the length of the rectangle:")
    var length=read.nextInt()
    println("Entered $length ")

    println("Enter the width of the rectangle:")
    var width=read.nextInt()
    println("Entered $width")

    println("Perimeter:")
    println((length+width)*2)

    //perimeter of a circle
    println("Enter the radius of the circle:")
    var radius=read.nextInt()
    println("Entered $radius ")
    val pi=3.142

    println("Perimeter:")
    println((pi*radius)*2)
}