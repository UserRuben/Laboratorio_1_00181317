import figures.*
import javax.swing.JOptionPane
import utilities.Time

fun main(){

    var figs = arrayOf(

        Circle("Circle", 4.0),
        Square("Square", 5.0),
        Rectangle("Rectangle", 3.0, 6.0),
        Triangle("Triangle", 5.0, 10.0, 2.0, 8.0)
    )


    var mess = ""
    figs.forEach{
        mess += "${it.name}, surface: ${it.surface()}, perimeter: ${it.perimeter()}\n"
    }

    JOptionPane.showMessageDialog(null, mess)

    mess = ""
    var t = Time(22, 22, 3)
    var tt = Time(22, 22, 3)
    var ttt = Time(22, 22, 3)

    mess += "time in Francia ${t.convertTime("fra")}\n"
    mess += "time in Japon ${tt.convertTime("jap")}\n"
    mess += "time in Noruega ${ttt.convertTime("nor")}\n"

    JOptionPane.showMessageDialog(null,mess)

}
