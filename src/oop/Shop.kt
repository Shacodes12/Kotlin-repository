package oop

class shop {
    private var name: String = ""
    private var price: Double = 0.0

    fun setItemName(name: String){

        this.name = name
    }

    fun setItemPrice(price: Double){

        this.price = price
    }
    fun getItemName(): String{

        return this.name
    }
    fun getItemPrice(): Double{

        return this.price
    }

}

fun main(args: Array<String>) {
    var item =  shop()
   item.setItemName("sugar")
   item.setItemPrice(130.0)

  println(item.getItemName())
    println(item.getItemPrice())

}

