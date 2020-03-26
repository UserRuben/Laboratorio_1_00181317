package figures

class Triangle(
    override var name: String,
    var side1: Double,
    var side2: Double,
    var base: Double,
    var height: Double
) : Figure{

    override fun surface(): Double{
        return (base * height) / 2
    }

    override fun perimeter(): Double{
        return side1 + side2 + base
    }
}
