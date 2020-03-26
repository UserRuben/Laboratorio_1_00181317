package figures

class Square(
    override var name: String,
    var side: Double
) : Figure{

    override fun surface(): Double{
        return Math.pow(side, 2.0)
    }

    override fun perimeter(): Double{
        return 4 * side
    }
}
