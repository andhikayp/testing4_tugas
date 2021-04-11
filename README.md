# tictactoe

In a game of Tic-Tac-Toe, two players take turns marking an available cell in a 3-by-3 grid with
their respective tokens (either X or O). When one player has placed three tokens in a horizontal,
vertical, or diagonal row on the grid, the game is over

There are 5 states:
<ul>
<li> 
    X wins: when X occupies either all cells in a vertical line, or all cells in a horizontal line, or all cells in a diagonal.
</li>
<li> 
    O wins: when O occupies either all cells in a vertical line, or all cells in a horizontal line, or all cells in a diagonal.
</li>
<li>
    Draw: no player has won.
</li>
<li> 
    Game in progress: if no player has won and it’s not a draw
</li>
<li>
    Invalid grid: a grid that's not possible to achieve in a real game
</li>