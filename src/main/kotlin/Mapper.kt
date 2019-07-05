import Models.Player
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class Mapper {

    fun map(line: String): Player {

        var tab = line.split(";")
        println(tab)
        try {
            return Player(
                tab[1].toInt(),
                tab[2],
                tab[3].toInt(),
                tab[4],
                tab[5],
                tab[6],
                tab[7].toInt(),
                tab[8].toInt(),
                tab[9],
                tab[10],
                moneyFormatter(tab[11]),
                moneyFormatter(tab[12]),
                tab[13].toInt(),
                tab[14],
                tab[15].toInt(),
                tab[16].toInt(),
                tab[17].toInt(),
                tab[18],
                tab[19],
                tab[20].toBoolean(),
                tab[21],
                tab[22].toInt(),
                dateParser(tab[23]),
                tab[24],
                tab[25],
                tab[26],
                tab[27]
            )
        } catch (e: Exception) {
            return Player()
        }
    }

    fun dateParser(dateString: String): Date? {
        if (dateString.isEmpty()) {
            return null
        } else {
            return SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).parse(dateString)
        }
    }

    fun moneyFormatter(value: String): Double {
        val moneyRegex = "(?<number>\\d+\\.\\d+|\\d+)(?<literal>\\w)"
        val pattern = Pattern.compile(moneyRegex)
        val matcher = pattern.matcher(value)
        return if (matcher.find()) {
            val number = matcher.group("number").toDouble()
            val literal = matcher.group("literal")
            when (literal) {
                "K" -> number * 1000
                "M" -> number * 1000000
                else -> number
            }
        } else {
            0.0
        }
    }
}