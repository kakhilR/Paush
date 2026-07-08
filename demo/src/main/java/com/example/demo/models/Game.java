import java.util.List;

public class Game{
    private Board board;
    private List<Player> players;
    private Player player;
    private GameState gameState;
    private List<Move> moves;
    private int nextPlayerMoveIndex;

    private Game(int dimension, List<Player> players){
        this.board = new Board(dimension);
        this.players = players;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.nextPlayerMoveIndex = 0;
    }

    public void printBoard(){
        this.board.printBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private boolean validateBotCount(){
            int botCount = 0;
            for(Player player: players){
                if(player.getPlayerType() == PlayerType.BOT){
                    botCount++;
                }
            }

            if(botCount > 1){
                throw new InvalidBotCountExecption("Only one bot is allowed in the game");
            }
            return true;
        }

        private boolean validatePlayerCount(){}

        private void validateGame(){
            validateBotCount();
            validatePlayerCount();
        }

        public Game Build(){
            validateGame();

            Game game = new Game(dimension, players);
            game.board = new Board(dimension);
            game.players = players;
            game.player = players.get(0);
            game.gameState = GameState.IN_PROGRESS;
            game.moves = new ArrayList<>();
            return game;
        }
        
    }
}