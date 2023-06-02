import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("Enter the three numbers:")
    var num1:Int=read.nextInt()
    var num2:Int=read.nextInt()
    var num3:Int=read.nextInt()

    if (num1>num2 && num1>num3){
        println("num1 is a Maximum number")
    }
    else if (num2>num1 && num2>num3){
        println(" num2 is a Maximum number")
    }
    else{
        println("num3 is a Maximum number")
    }
}