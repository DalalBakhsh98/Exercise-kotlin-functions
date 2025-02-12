fun main() {
    greetTraveler()
    println(findOasis(10, 20))
    println("Average Temperature: " +currentTemperature(25,40))
    println(startCamelRid(time = 10, speed = 5))
    println(startCamelRid(10))
    var result = exploreDune(height = 20 , climbRate = 3 )
    println("Time to Climb the Dune: %.2f hours".format(result))   //Similar to JAVA..
    println("Survival Chance: "+ survivalChance(8))


}

fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x:Int , y:Int): String {
    return "Oasis found at coordinates ($x, $y)"
}

fun currentTemperature(morningTemperature:Int , afternoonTemperature:Int): Int {
    var averageTemperature:Int
    averageTemperature = (morningTemperature+afternoonTemperature)/2

    return averageTemperature

    //this function was a trick for me! Watch out!!

}

fun startCamelRid(time: Int , speed: Int = 5): String{
    var distance: Int
    distance = time * speed

    return "Camel Ride: Distance = $distance, Speed = $speed km/h, Time = $time hours"
  //  return println("Camel Ride: Distance = $distance, Speed = $speed km/h, Time = $time hours")  i can use this line if the function type was Any instead of String...i like this info
}

fun exploreDune(height: Int , climbRate: Int): Double{
    var timeRequired: Double
    timeRequired = height.toDouble() / climbRate
    return timeRequired

}

fun survivalChance(supplies: Int): Int{

    return supplies * 10


}
