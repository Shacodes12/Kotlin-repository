package oop

open class ClassOne{
    fun ugali(){
        println("I love ugali")
    }
    fun githeri(){
        println("I love githeri")

    }
}
open class ClassTwo: ClassOne(){

}
open class ClassThree: ClassTwo(){

}

fun main(args: Array<String>) {
    var myObj = ClassThree()
    myObj.githeri()

}
