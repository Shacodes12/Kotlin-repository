package oop
//From Auth class, on register and login methods respectively ,
//validate any user's email and password if the user has an email
//and password of your liking,  calculate the bmi of
// the same user from a child class called Bmicalc
//ensure all credentials are provided by the user through the scanner



import structure.bmi
import java.util.Scanner

open class Auth(open var email: String, open var password: String) {
    fun register(){
        var scn = Scanner(System.`in`)

        println("Enter email: ")
        var email = scn.next()

        println("Enter password: ")
        var password = scn.next()

        if(email.equals("student@gmail.com")  && password.equals("eMobilis123")){
            login()
        }else{
            println("You have registered successfully")
        }


    }
    fun login(){
        var scn = Scanner(System.`in`)

        println("Enter email: ")
        var email = scn.next()

        println("Enter password: ")
        var password = scn.next()

        if(email.equals("student@gmail.com")  && password.equals("eMobilis123")){

            var scn = Scanner(System.`in`)


            println("Enter weight: ")
            var weight = scn.nextDouble()

            println("Enter height: ")
            var height = scn.nextDouble()

            var bmi = BMICalc(weight,height)

            println("Your bmi is ${bmi.bmi}")





        }else{
            println("You entered the wrong password or email")
        }

    }

    class  BMICalc(weight: Double, height: Double){

            var bmi = weight/Math.pow(height,2.0)

    }
}

fun main(args: Array<String>) {
    var user1 = Auth("","")
    user1.login()
}