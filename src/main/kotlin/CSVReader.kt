import java.io.File

class CSVReader() {

    var playerArray = ArrayList<String>()

    fun readFileLineByLineUsingForEachLine(filename: String): ArrayList<String> {
        File(filename).forEachLine {
            playerArray.add(it)
        }
        playerArray = deleteFirstLine(playerArray)
        return playerArray
    }

    private fun deleteFirstLine(playerArray: ArrayList<String>): ArrayList<String> {
        playerArray.removeAt(0)
        return playerArray
    }
}