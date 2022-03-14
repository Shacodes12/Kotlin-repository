package oop

class User1 {
    var firstName: String
    var  lastName: String
    var email: String
    var password: String
    var dateOfBirth: String


    constructor(firstName: String, lastName: String, email: String, password: String, dateOfBirth: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.password = password
        this.dateOfBirth = dateOfBirth
    }

    fun login(){
        if(password != "eMobilis@123" && firstName  != "eMobilis" ){

            println("Wrong password or username!! Enter the correct credentials")

        }
        else if(password.length <= 5){

            println("Password should be more than 4 characters")

        }else{
            println("You have successfully logged in")

        }

    }
    fun register(){
        println("Registered $firstName using $email and password $password " )
    }

}

fun main(args: Array<String>) {
var person1 = User1("Sharon","Cherono","Sharon@gmail.com","pass123","19/9/1999" )
    var person2 = User1("eMobilis","Institute","Emobilis@gmail.com","eMobilis@123","4/2/2014")

        person1.login()
    person2.login()
    person1.register()


}