package figures

class Rectangle(
    override var name: String,
    var base: Double,
    var height: Double
) : Figure{
    override fun surface(): Double{
        return base * height
    }

    override fun perimeter(): Double{
        return base * 2 + height * 2
    }
}