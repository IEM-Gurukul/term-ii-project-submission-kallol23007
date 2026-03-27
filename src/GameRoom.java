// Represents a game session between two players
class GameRoom {
    private Player p1;
    private Player p2;

    private static int gameCounter = 1;
    private int gameId;
    
    public GameRoom(Player p1, Player p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentExcetion("players cannot be null");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.gameId = gameCounter++;
    }
    public player getPlayer1() {
        return p1;
    }
    public player getPlayer2() {
        return p2;
    }
    public void displayPlayers() {
        system.out.println("players in room: " + p1.getName() + ", " + p2.getName());
    }

    public void startGame() {
        System.out.println("Game " + gameId + "started: " p1.getName() + " vs " + p2.getName());
    }
}
