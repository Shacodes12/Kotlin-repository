package Practise
var name: String = "Sharon"
var greeting:String?=null

fun main(args: Array<String>) {
    var greeting = "Hello"
 val greetingToPrint = when (greeting) {
     null -> "Hi"
     else -> greeting
    }
    println(greetingToPrint)



    println(name)




}