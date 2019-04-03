var count = 0
fun userInstr()
{

    while (isKingAlive(coinMap)) {
        //Input format: coinId-placec
        var coinMapNew=moveAgain()
        printTable(coinMapNew)

        count++
    }
    count--
    if (count % 2 != 1)
        println("White is Winner")
    else
        println("White is Winner")

}

fun moveAgain():MutableMap<ChessPlace, AnyCoin>
{

        if (count % 2 != 1) {
            println("White's Time !!!")
            val userin = readLine()!!
            //split input
            val inArray = userin.split("-")

            if (inArray.size == 2 && inArray.isNullOrEmpty() == false) {
                val coin = getCoin(inArray[0])
                val place = getPlaceUser(inArray[1])
                if(coin.color==Color.White) {
                    coinMap = coin.move(coinMap, coin, place)
                    if(isThereAnyCheck(coinMap))
                        println("Check Alert!!!")
                    return coinMap
                }
            }
            else
                return moveAgain()
        }
        else {
            println("Black's Time !!!")
            val userin = readLine()!!
            //split input
            val inArray = userin.split("-")
            if (inArray.size == 2 && inArray.isNullOrEmpty() == false) {
                val coin = getCoin(inArray[0])
                val place = getPlaceUser(inArray[1])
                if(coin.color==Color.Black) {
                    coinMap = coin.move(coinMap, coin, place)
                    if(isThereAnyCheck(coinMap))
                        println("Check Alert!!!")
                    return coinMap
                }
            }
            else
                return moveAgain()
        }
return moveAgain()
}

