import Models.Player

fun main(){
    val csvReader = CSVReader()
    val mapper = Mapper()
    var playerList = ArrayList<Player>()
    var textArray = csvReader.readFileLineByLineUsingForEachLine("C:\\Users\\maciejsa\\IdeaProjects\\fifa\\fifa.csv")

    textArray.forEach { mapper.mapLines(it) }
}