import java.util.Scanner

fun main(args:Array<String>){
    var read=Scanner(System.`in`)

    println("Enter the letter:")
    var vow:String=read.next()

    val vowels=
        if (vow=="a"||vow=="e"||vow=="i"||vow=="o"||vow=="u"){
            println("Letter is a vowel")
        }
        else{
            println("Letter is a Consonant                                                                                                                                                        ")
        }


}