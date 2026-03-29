// Thread responsible for continuously matching players
class MatchmakingThread extends Thread {

    private MatchmakingSystem system;
    private boolean running = true;

    public MatchmakingThread(MatchmakingSystem system) {
        this.system = system;
    }

    public void stopThread() {
        running = false;
    }

    private void processMatchmaking() {
        GameRoom room = system.matchPlayers();
        if (room != null) {
            System.out.println("Match found! Starting game...");
            room.startGame();
        }
    }

    public void run() {
        while (running) {
            System.out.println("Matchmaking thread is active...");

            processMatchmaking();

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    // TODO: Add matchmaking based on player skill level
}
