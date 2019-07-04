fun main(){
    val csvReader = CSVReader()
    val mapper = Mapper()

    mapper.mapLines(csvReader.readFileLineByLineUsingForEachLine("C:\\Users\\maciejsa\\IdeaProjects\\fifa\\fifa.csv"))
}