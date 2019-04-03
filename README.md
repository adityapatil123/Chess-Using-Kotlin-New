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

