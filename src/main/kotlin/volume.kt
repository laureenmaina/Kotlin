import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)
    println("Enter the length of the cuboid:")
    var length=read.nextInt()
    println("Entered $length ")

    println("Enter the width of the cuboid:")
    var width=read.nextInt()
    println("Entered $width")

    println("Enter the height of the cuboid:")
    var height=read.nextInt()
    println("Entered $height")

    println("Volume of the cuboid:")
    println(length*width*height)
}