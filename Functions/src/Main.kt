fun main() {
    greetTraveler()
    println(findOasis(10, 20))
    println("Average Temperature:"+currentTemperature(25,40))
}

fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x:Int , y:Int): String {
    return "Oasis found at coordinates ($x, $y)"
}

fun currentTemperature(morningTemperature:Int , afternoonTemperature:Int): Int {
    var average:Int
    average = (morningTemperature+afternoonTemperature)/2

    return average

    //this function was a trick for me! Watch out!!

}