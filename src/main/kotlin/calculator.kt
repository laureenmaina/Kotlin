import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter the first number:")
    var num1 = read.nextFloat()

    println("Choose an operator(+,-,*,/):")
    var operator = readLine()

    println("Enter the second number:")
    var num2 = read.nextFloat()

    var result= when(operator){

        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2

        else->"Invalid operator"
    }
    println("Result =$result")
}



