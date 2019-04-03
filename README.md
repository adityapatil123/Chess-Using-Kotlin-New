Chess Program

Aim:
Print basic arrangement of chess
2 players(2 colors-black and white) will play one by one.First will be played by white.
Follow all the rules of chess.
i.e. No coin can move the position when some other is in between,
    Black coin can acquire position of white by acquiring it,but not of black,same for White
User need to provide Coin and Desired place it has to move.If possible move,do it.Else
Ask again for instruction.
When ‘Check’ condition is there.Give the message.

Approach:
Coin Class(color,id) → Pawn Class(color,id) , Rook Class(color,id) , ….
For color,id and coin_type enum classes to be made and to be validated
ChessPlace Class(x,y)
X and y to be validated(1 to 8)
Mapping ChessPlace → Coin
Using nested For loops on x and y, print coinID associated and Hence the desired table.

Algorithm:
Ask user for input in form “coinID-place” one-by-one Black and White
Make move according to conditions of associated cointype.Otherwise ask again for input.
While moving(or killing),first it will check if anything is there at Desired Location,
If at desired location coin of same color present,then ask again for move.
While moving(or killing),check if anything is present between source and destination.If yes,then ask again for move.
Look for ‘Check’ other king is getting,If yes alert about it.
Repeat asking till any king get killed

Kotlin Files:
1)ChessMain Fun:Basically calls UserInstr fun
2)UserInstr:Takes user input and make ask for the move and check fun
3)Coin:Enum classes for color,coinType, getValidCoin fun    (Coin is the value)
4)ChessPlace:getPlace funs  (ChessPlace is the key)
5)ChessBoard:makeBasicArrangement and  printTable funs
6)CoinOperations(Interface) with methods as move(with actual moving code) and check
7)Pawn(Class) with methods move(checking for Pawn moving conditions), same for Knight,Rook,Bishop,Queen,King.

How it Works:
BP:Black Pawn
BK:Black Knight
BR:Black Rook
BB:Black Bishop
BQ:Black Queen
BS:Black King('S' due to naming issues)
Same for White coins

Basic Arrangement will be like

BR1 BK1 BB1 BQ1 BS1 BB2 BK2 BR2  
BP1 BP2 BP3 BP4 BP5 BP6 BP7 BP8  
                                 
                                 
                                 
                                 
WP1 WP2 WP3 WP4 WP5 WP6 WP7 WP8  
WR1 WK1 WB1 WQ1 WS1 WB2 WK2 WR2

User will be asked for input like:"CoinID-PlaceID"   e.g. "BP1-A3"    One-by-One for Black and White
Xaxis:A->H
Yaxix:1 downTo 8
