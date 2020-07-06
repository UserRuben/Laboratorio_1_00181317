package figures



interface Figure {
    var name: String

    fun perimeter(): Double
    fun surface(): Double
}