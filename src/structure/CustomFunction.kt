package structure

fun main(args: Array<String>) {

    motto()
    average(100.0, 200,300.0f )
}
 fun motto(){
     println("Education is the key")
 }
fun average(x:Double, y:Int, z:Float){
    var average=(x + y + z)/3.0

    println("You average is  $average")
}