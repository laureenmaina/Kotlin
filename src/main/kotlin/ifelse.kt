import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)
    println("Enter the value of temperatures:")
    var temperature=read.nextInt()

    if(temperature<37){
        println("It is too cold")
    }
    else if (temperature==37){
        println("Normal temperatures")
    }
    else{
        println("It is too hot")
    }
}