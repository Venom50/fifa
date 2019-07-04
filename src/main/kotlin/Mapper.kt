import Models.Player
import java.lang.Exception

class Mapper {

    fun mapLines(line: String): Player {

        var tab = line.split(";")
            return Player(
                tab[0].toInt(),
                tab[1],
                tab[2].toInt(),
                tab[3],
                tab[4],
                tab[5],
                tab[6].toInt(),
                tab[7].toInt(),
                tab[8],
                tab[9],
                tab[10],
                tab[11],
                tab[12].toInt(),
                tab[13],
                tab[14].toInt(),
                tab[15].toInt(),
                tab[16],
                tab[17],
                tab[18].toBoolean(),
                tab[19],
                tab[20].toInt(),
                tab[21],
                tab[22],
                tab[23],
                tab[24],
                tab[25]
            )
    }
}