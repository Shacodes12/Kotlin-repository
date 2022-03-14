package oop

class Flower {

    private var name: String = ""
    private var color: String = ""
    private var price: Double = 0.0

    fun setFlowerName(name: String) {

        this.name = name
    }

    fun setFlowerColor(color: String) {

        this.color = color
    }

    fun setFlowerPrice(price: Double) {

        this.price = price
    }

    fun getFlowerName(): String {

        return this.name
    }

    fun getFlowerColor(): String {

        return this.color
    }

    fun getFlowerPrice(): Double {

        return this.price
    }
}

fun main(args: Array<String>) {
    var flower = Flower()
    flower.setFlowerName("Rose")
    flower.setFlowerColor("Red")
    flower.setFlowerPrice(500.50)
    println(flower.getFlowerName())
}