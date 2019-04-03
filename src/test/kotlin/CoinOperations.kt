interface CoinOperations{
    fun move(coinMap:MutableMap<ChessPlace, AnyCoin>, coin: AnyCoin,place: ChessPlace):MutableMap<ChessPlace,AnyCoin>
    {

        if(AreConditionsFullfilling(coin,place)==true) {

            try {
                val coinPresent= getCoinFromPlace(place)
            }
            catch(e:NoSuchElementException)
            {
                // No Code
            }
            val placeFirst=getPlaceFromCoin(coin)
            coinMap.remove(placeFirst)
            coinMap[place]=coin
            return coinMap
        }
        return moveAgain()
    }

    fun check(coinMap:MutableMap<ChessPlace, AnyCoin>, coin: AnyCoin,place: ChessPlace):Boolean
    fun getID():String
}


fun AreConditionsFullfilling(coin: AnyCoin,place: ChessPlace):Boolean
{

    if(isCoinPresentAtDesiredLocation(place)) {
        val coinFromPlace = getCoinFromPlace(place)
        if (coin.color == coinFromPlace.color)
        {
            println("Its your coin only!! Try again")
            return false
        }
    }
    return true
}
