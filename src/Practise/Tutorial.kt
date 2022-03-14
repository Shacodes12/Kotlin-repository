package Practise


fun main(args: Array<String>) {


    var name: String = "Sharon"
    var greeting: String? = "Evening"

    var getToGreeting= when(greeting ) {
        null -> "Hi"
        else -> greeting


    }
    println(getToGreeting)
    println(name)

}








