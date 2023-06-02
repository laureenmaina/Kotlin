class dog(var Breed:String,var Size:String,var Age:String,var Color:String){
}
fun Eat(action:String){
}
fun Sleep(action: String){
}
fun Sit(action: String){
}
fun Run(action: String){
}
fun main(){
    var puppy1=dog("Neapolitian Mastiff","Large","5 years","Black")
    println(puppy1.Breed+" "+puppy1.Size+" "+puppy1.Age+" "+puppy1.Color)
    var puppy2=dog("Maltese","Small","2 years", "White")
    println(puppy2.Breed+" "+puppy2.Size+" "+puppy2.Age+" "+puppy2.Color)
    var puppy3=dog("Chow chow","Medium","3 years", "Brown")
    println(puppy3.Breed+" "+puppy3.Size+" "+puppy3.Age+" "+puppy3.Color)


}