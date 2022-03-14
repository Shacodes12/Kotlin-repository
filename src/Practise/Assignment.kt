package Practise
import java.util.Scanner


fun main(args: Array<String>) {
    checkCredentials("Sharon","pass123")
    var BMI: Double

    


}


fun checkCredentials(userName: String, password: String) {
    val scn = Scanner(System.`in`)
    println("Enter your user name: ")
    var userName = scn.nextLine()

    println("Enter your password: ")
    var password = scn.nextLine()

    if (userName == "eMobilis" && password == "eMobilis@123") {
        println("You've logged in successfully")
    } else {
        println("Wrong password or username!! Enter the correct credentials")
    }
    fun calculateBMI(weight: Double, height: Double) {
        val scn = Scanner(System.`in`)

        println("Enter your body weight: ")
        var weight = scn.nextDouble()

        println("Enter your body height: ")
        var height = scn.nextDouble()



        var BMI = weight / height
        if (BMI <= 40) {
            println("You are under weight")
        } else if (BMI <= 60) {
            println("You weight is normal")
        } else {
            println("You are obessed")
        }

    }



}