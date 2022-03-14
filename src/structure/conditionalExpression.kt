package structure

fun main(args: Array<String>) {
    //IF EXPRESSION
     var marks = 98
    var result = if (marks < 40){
        "E"
    }else if(marks < 50){
        "D"
    }else if (marks < 60){
        " C"

    }else if (marks < 70){
        "B"
    }else {
        "A"
    }
    println(result)

    //WHEN EXPRESSION
    var bettingNumber = 3
    var betResult= when(bettingNumber) {
        1 -> {
            "Sorry!! You lost!!!"
        }
        2 -> {
            "Sorry you!! You lost!!1"
        }
        3 -> {
            "Congratulations!! You won!!!"
        }
        else -> {
            "Enter a number 1- 3 to bet"
        }

    }
    println(betResult)
}