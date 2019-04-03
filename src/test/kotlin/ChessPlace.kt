
import java.util.Objects
import java.util.stream.Collectors



data class ChessPlace(
    val xPlace: Int,
    val yPlace: Int
)

fun getPlace(placeId:Array<Int>): ChessPlace {

    if(placeId.size==2) {
        val xPlace = checkPlace(placeId[0])
        val yPlace = checkPlace(placeId[1])

        return ChessPlace(xPlace,yPlace)
    }
    throw Exception("Invalid Length")

}

fun getPlaceUser(placeId:String):ChessPlace{

    if(placeId.length==2)
    {
        val xOldPlace= checkPlaceUser(placeId[0].toString())
        val xPlace = xPlaceMap.getValue(xOldPlace)
        val yPlace=checkPlace(Integer.parseInt(placeId[1].toString()))
        return ChessPlace(xPlace,yPlace)
    }
    throw Exception("Invalid Length")
}

fun checkPlace(num: Int): Int {
    if (num >= 1 && num <= 8) return num
    throw Exception("Invalid Place")
}

fun checkPlaceUser(str:String):String{
        if (("ABCDEFGH").contains(str))
            return str
        throw Exception("Invalid Place")

}

val xPlaceMap = mutableMapOf<String,Int>(
    Pair("A",1),
    Pair("B",2),
    Pair("C",3),
    Pair("D",4),
    Pair("E",5),
    Pair("F",6),
    Pair("G",7),
    Pair("H",8)
)

fun getPlaceFromCoin(coinAsked: AnyCoin):ChessPlace
{
    try {
        for ((key, value1) in coinMap) {
            if (coinAsked.getID() == value1.getID()) {
                return key
            }
        }
    }
    catch(e:Exception)
    {
        println("Invalid input")
        moveAgain()
    }
    return ChessPlace(1,1)
}

