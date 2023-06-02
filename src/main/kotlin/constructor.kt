class Dog(var color:String, var breed:String, var sex:String,var age:Int){
    //Properties

}
fun main(){
    var d=Dog("Brown","German Shepherd","Female",10)
    println(d.color+" "+d.breed+" "+d.sex+" "+d.age)

    var puppy=Dog("Black","Kenyan","Male",5)
    println(puppy.color+" "+puppy.breed+" "+puppy.sex+" "+puppy.age)

}
