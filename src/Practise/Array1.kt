package Practise

fun main(args: Array<String>) {
    var cars = arrayOf("BMW ", "Lexus ","TX ","Harrier ","Prado ","Land Cruiser ","Toyota ")

  //  println(cars.size)
    //println(cars[3])
    //println(cars.get(0))

    cars.forEachIndexed{index, cars ->
        println("$cars is at index $index")
        
    }
}