class Car {
    var make: String = "America"
    var model: String = "Jeep"
    var color: String = "Black"
    var drivingSpeed: Int = 200

    fun drive() {
        println("Driving")
    }

    fun turn() {
        println("Turning")
    }

    fun stop() {
        println("Stopping")
    }
}
fun main(){
    var vehicle=Car()
    println(vehicle.model)

  
    println(vehicle.make+" "+vehicle.model+" "+vehicle.color+" " +vehicle.drivingSpeed)
}