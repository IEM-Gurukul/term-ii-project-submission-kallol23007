class GameRoom {
    private Player p1;
    private Player p2;

    public GameRoom(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        System.out.println("Game Started: " + p1.getName() + " vs " + p2.getName());
    }
}