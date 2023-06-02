import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter a number:")
    var num:Int=read.nextInt()

    val ngnumber=
        if (num<0){
            println("The number is negative")
        }
        else if (num==0){
            println("The number is neither positive or negative ")
        }
        else{
            println("The number is a positive")
        }
}