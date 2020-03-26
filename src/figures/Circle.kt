package figures

class Circle(
    override var name: String,
    var radius: Double
) : Figure{
    override fun perimeter(): Double{
        return 2 * Math.PI * radius
    }

    override fun surface(): Double{
        return Math.pow(radius, 2.0) * Math.PI
    }
}
