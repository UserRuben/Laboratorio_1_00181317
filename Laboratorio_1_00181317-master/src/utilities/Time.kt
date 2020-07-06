package utilities


class Time(
    var hours: Int = 0,
    var minutes: Int = 0,
    var seconds: Int = 0
){

    val fra = "fra"
    val jap = "jap"
    val nor = "nor"

    fun convertTime(zone: String): String{
        var newHour: Int = 0

        if(zone.equals("fra")){
            if(hours + 7 > 23)
                newHour = hours + 6 - 23
            else
                newHour = hours + 7
        }
        else if(zone.equals("jap")){
            if(hours + 3 > 23)
                newHour = hours + 2 - 23
            else
                newHour = hours + 3
        }
        else if(zone.equals("nor")){
            if(hours + 7 > 23)
                newHour = hours + 6 - 23
            else
                newHour = hours + 7
        }
        return """
            ${newHour}:${minutes}:${seconds}
        """.trimIndent()
    }

}
