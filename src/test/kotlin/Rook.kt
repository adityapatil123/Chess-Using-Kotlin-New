import kotlin.math.absoluteValue

class Rook(color: Color, id:Int):AnyCoin(color,id) {
    override fun move(coinMap:MutableMap<ChessPlace, AnyCoin>, coin: AnyCoin,place: ChessPlace):MutableMap<ChessPlace,AnyCoin>{
        val placeFirst = getPlaceFromCoin(coin)
        val yNew = place.yPlace
        val xNew = place.xPlace
        val yOld = placeFirst.yPlace
        val xOld = placeFirst.xPlace

        try {
            val coinPresent=getCoinFromPlace(place)
        }
        catch(e:NoSuchElementException) {
            //No Code
        }

        var a=0
        if((yNew!=yOld)&&(xNew==xOld))
        {
            a= yNew-yOld
            if(a > 0) {
                for (i in 1..a-1) {
                    try {
                        getCoinFromPlace(ChessPlace(xOld, yNew - i))
                        return moveAgain()
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                }
            }
            else{
                for (i in (-1).downTo(a+1)) {
                    try {
                        getCoinFromPlace(ChessPlace(xOld, yNew - i))
                        return moveAgain()
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }

                }
            }
            return super.move(coinMap, coin, place)
        }
        else if((xNew!=xOld)&&(yNew==yOld))
        {
            a= xNew-xOld
            if(a > 0) {
                for (i in 1..a - 1) {
                    try {
                        getCoinFromPlace(ChessPlace(xNew-i, yOld))
                        return moveAgain()
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                    return super.move(coinMap, coin, place)
                }
            }
            else{
                for (i in (-1).downTo(a+1)) {
                    try {
                        getCoinFromPlace(ChessPlace(xNew-i, yOld))
                        return moveAgain()
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                    return super.move(coinMap, coin, place)

                }
            }
            return super.move(coinMap, coin, place)
        }

        return moveAgain()
    }

    override fun getID():String {
        if(color==Color.Black)
            return("BR"+id.toString())
        else
            return("WR"+id.toString())
    }

    override fun check(coinMap:MutableMap<ChessPlace, AnyCoin>, coin: AnyCoin,place: ChessPlace):Boolean
    {
        val placeFirst = getPlaceFromCoin(coin)
        val yNew = place.yPlace
        val xNew = place.xPlace
        val yOld = placeFirst.yPlace
        val xOld = placeFirst.xPlace

        var a=0
        if((yNew!=yOld)&&(xNew==xOld))
        {
            a= yNew-yOld
            if(a > 0) {
                for (i in 1..a-1) {
                    try {
                        getCoinFromPlace(ChessPlace(xOld, yNew - i))
                        return false
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                }
            }
            else{
                for (i in (-1).downTo(a+1)) {
                    try {
                        getCoinFromPlace(ChessPlace(xOld, yNew - i))
                        return false
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }

                }
            }
            return true
        }
        else if((xNew!=xOld)&&(yNew==yOld))
        {
            a= xNew-xOld
            if(a > 0) {
                for (i in 1..a - 1) {
                    try {
                        getCoinFromPlace(ChessPlace(xNew-i, yOld))
                        return false
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                    return true
                }
            }
            else{
                for (i in (-1).downTo(a+1)) {
                    try {
                        getCoinFromPlace(ChessPlace(xNew-i, yOld))
                        return false
                    }
                    catch(e:NoSuchElementException) {
                        //No Code
                    }
                    return true

                }
            }
            return true
        }
        return false
    }
}

