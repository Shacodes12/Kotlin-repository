package structure

fun main(args: Array<String>) {
    var names =arrayOf("King", "Tom","Purity", "Ian", "Jasmin")
    for (name in names){
        println(name)
    }
    if ("Sharon" in names){
        println("Sharon is here")
    } else{
        println("The student is not in the list")
    }

}