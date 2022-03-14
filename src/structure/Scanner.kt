package structure
//create a function to check if user's username is
//"eMobilis " and the password is "eMobilis123"
//Hence forth, calculate the BMI of the user
// using another seperate function with credential
//provided by the user. Display the results as:
//1. Underweight
//2. Normal weight
//3. Obese
//NOTE: Use a scanner to receive data from the user

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    println("Enter your username: ")
    val userName = scanner.nextLine()

    println("Enter your password: ")
    val password = scanner.nextLine()

    if (password =="eMobilis@123" && userName == "eMobilis"){

        val scanner  = Scanner(System.`in`)
        println("Enter your height: ")
        val height = scanner.nextDouble()

        println("Enter your weight: ")
        val weight = scanner.nextDouble()

        var BMI= weight/height
        if(BMI <= 40){
            println(" You are under weight")

        }else if(BMI <= 70){
            println(" You have a Normal weight")
        }
        else{
            println("You are obesed")
        }

    }else{
        println("Wrong password or username !! Enter the correct password and username")
    }



}

