import org.example.demo.Player;
import org.example.demo.Game;

import java.util.*;

public class GameController{
    private Game startGame(int dimension, List<Player> players){
        return Game.getBuilder().setDimension(dimension).setPlayers(players).build();
    }

    public void makeMove(Game  game, Player player, int row, int col){
        game.makeMove(player, row, col);
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player winner(Game game){
        return game.getWinner();
    }
}