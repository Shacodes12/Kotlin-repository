package structure

fun main(args: Array<String>) {
    average("king",100.0,200,300.0)
    average(10,30,34)


}
fun average(x:Double, y:Int, z:Double){
    var average = (x + y + z)/3.0
    println("Your average is $average")

}

fun average( name:String,x:Double, y:Int, z:Double) {
    var average = (x + y + z) / 3.0
    println("Your average is $average")
}

fun average(x:Int, y:Int, z:Int){
    var average = (x + y + z)/3.0
    println("Your average is $average")

}
//create a function to check if user's uesrname is
//"eMobilis " and the password is "eMobilis123"
//Hence forth, calculate the BMI of the user
// using another seperate function with credential
//provided by the user. Display the results as:
                    //1. Underweight
                    //2. Normal weight
                    //3. Obese
//NOTE: Use a scanner to receive data from the user