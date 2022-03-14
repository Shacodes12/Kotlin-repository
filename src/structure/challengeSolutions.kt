package structure

import java.util.Scanner

fun main(args: Array<String>) {

    var scn = Scanner(System.`in`)

    println("Enter username: ")
    var userName = scn.nextLine()

    println("Enter password: ")
    var password = scn.nextLine()

    userCheck( userName,password)


}
fun userCheck(userName: String, password: String) {
    if (userName.equals("eMobilis") && password.equals("eMobilis@123")) {
        //calculate bmi
        var scn = Scanner(System.`in`)

        println("Enter weight: ")
        var weight = scn.nextDouble()

        println("Enter heightt: ")
        var height = scn.nextDouble()

        bmi(weight,height)


    } else {
        println("wrong username or password")
    }
}

fun bmi(weight: Double, height:Double){
    var bmi=weight/Math.pow(height,2.0)

    if (bmi< 18){
        println("Underweight")
    }else if(bmi < 24.9){
        println("Normal weight")

    }else {
        println("Obese")
    }

}



