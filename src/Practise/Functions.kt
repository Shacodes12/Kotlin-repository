package Functions

import java.util.Scanner

fun main(args: Array<String>) {
    BMI(1.65,80.0)



}
fun BMI(height: Double, weight: Double ){

    val scanner = Scanner(System.`in`)
    println("Enter your body weight: ")
    val weight = scanner.nextDouble()
     println("Enter your body height: ")
    val height = scanner.nextDouble()

    val calculateBMI = weight/height

    println(calculateBMI)



    if (calculateBMI <= 40.0){
        println("Your are underweight")

    }else if(calculateBMI <= 60.0){
        println("You weight is normal")

    }else{
        println("You are obessed")
    }

}