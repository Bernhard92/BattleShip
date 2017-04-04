package group5.battleship.src.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hribhrib on 28.03.2017.
 * <p>
 * This class is for one game. one game contains each move.
 * array sates:
 *      -1 = water
 *       0 = undef
 *      +1 = ship
 */

public class Game {
    List<Move> moves;
    int size = 5; // R x C
    Player player1;
    Player player2;


    public Game(Player p1, Player p2, int size) {
        player1 = p1;
        player2 = p2;
        //this.size = size;

        player1.battleField = new int[this.size][this.size];
        player1.ships = new int[this.size][this.size];
        initBattleField(player1);
        player2.battleField = new int[this.size][this.size];
        player2.ships = new int[this.size][this.size];
        initBattleField(player2);

        moves = new ArrayList<>();
    }

    public void newMove(Move move) {
        moves.add(move);
    }

    private void initBattleField(Player p) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                p.battleField[i][j] = 0;
                p.ships[i][j] = -1;
            }
        }
    }

    public Player getPlayer1(){
        return player1;
    }
    public Player getPlayer2(){
        return player2;
    }
    public int getSize(){
        return size;
    }
}
