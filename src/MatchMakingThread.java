class MatchmakingThread extends Thread {
    private MatchmakingSystem system;

    public MatchmakingThread(MatchmakingSystem system) {
        this.system = system;
    }

    public void run() {
        while (true) {
            System.out.println("Thread running... ");


            GameRoom room = system.matchPlayers();
            if (room != null) {
                room.startGame();
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Thread error");
            }
        }
    }
}