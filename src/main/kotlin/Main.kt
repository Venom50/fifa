import Models.Player

fun main(){
    val csvReader = CSVReader()
    val mapper = Mapper()
    var textArray = csvReader.readFileLineByLineUsingForEachLine("C:\\Users\\maciejsa\\IdeaProjects\\fifa\\fifa.csv")

    var playerList = textArray.map { mapper.map(it) }
}