import Models.Player

class Mapper(val csvReader: CSVReader) {



    fun mapLines(line: ArrayList<String>): Player {

        line.forEach {

        }

        val tab = line.split(";")
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
            tab[12],
            tab[13],
            tab[14],
            tab[15],
            tab[16],
            tab[17],
            tab[18],
            tab[19],
            tab[20],
            tab[21],
            tab[22],
            tab[23],
            tab[24],
            tab[25],
            tab[26],
            tab[27]
            )

    }
}