package oop

import structure.bmi
import java.util.Scanner

class BmiCalc(override var email: String,
              override  var password: String):Auth(email, password) {

                  fun calculatebmi(weight:Double,height: Double){
                      if (email.equals("Sharon@gmail.com") && password.equals("sharon1234")){

                          var bmi = weight/Math.pow(height, 2.0)

                          var scn = Scanner(System.`in`)


                          println("Enter weight: ")
                          var weight = scn.nextDouble()

                          println("Enter height: ")
                          var height = scn.nextDouble()



                      } else{
                          println("Wrong password or email")

                      }
                  }
}
fun main(args: Array<String>) {
    var user1 = BmiCalc("Sharon@gmail.com","sharon1234")

    user1.login()

    user1.calculatebmi(89.9,1.3)

    user1.register()




}