fun main() {
    greetTraveler()
    println(findOasis(10, 20))
    println("Average Temperature:"+ currentTemperature(25,40))
}

fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x: Int , y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}

fun currentTemperature(morningTemperature: Int , afternoonTemperature: Int): Int {
    var averageTemperature: Int
    averageTemperature = (morningTemperature + afternoonTemperature)/2

    return averageTemperature

    //this function was a trick for me! Watch out!!

}
