import java.util.Scanner

fun main(){
    //Area of a rectangle
    var read=Scanner(System.`in`)
    println("Enter length:")
    var length=read.nextInt()
    println("Entered $length")


    println("Enter width:")
    var width=read.nextInt()
    println("Entered $width")


    println("Area of rectangle:")
    println(length*width)

    //Area of a trapezium
    println("Area of a trapezium")
    println("Enter the length of side A:")
    var sideA=read.nextInt()

    println("Enter the length of side B:")
    var sideB=read.nextInt()

    println("Enter the height of the trapezium:")
    var height=read.nextInt()

    val constant=0.5

    println("Area of a trapezium")
    println(constant*height*(sideA+sideB))


}




