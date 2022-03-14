package oop

class SuperUser(override var email: String,
                override var password: String) :Verification(email,password) {

    var status = "SuperUser"
    fun manageAdmins(){

        println("Yeah, I can manage admins")
    }


}

fun main(args: Array<String>) {
    var userOne = SuperUser("king@email","king@123")

    userOne.register()
    println(userOne.status)
}

