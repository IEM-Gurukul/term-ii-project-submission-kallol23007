// Entry point of the multiplayer matchmaking system 
public class Main {

    // Utility method to simulate delayed joining
    public static void simulateJoin(MatchmakingSystem system, Player p) throws Exception {
        Thread.sleep(1000);
        system.joinQueue(p);
    }

    public static void main(String[] args) {
        try {
            System.out.println("=== Multiplayer Matchmaking System Started ===");

            // Initialize lobby and matchmaking system
            Lobby lobby = new Lobby();
            MatchmakingSystem system = new MatchmakingSystem();

            // creating sample players with skill levels
            Player p1 = new Player("Alice", 10);
            Player p2 = new Player("Bob", 20);
            Player p3 = new Player("Charlie", 15);

            System.out.println("Players created successfully");

            // adding players to lobby 
            lobby.addPlayer(p1);
            lobby.addPlayer(p2);
            lobby.addPlayer(p3);

            System.out.println("All players added to lobby");
            System.out.println("Starting matchmaking process...");

            simulateJoin(system, p1);
            simulateJoin(system, p2);
            simulateJoin(system, p3);

            // Start matchmaking thread for continuous player matching
            MatchmakingThread thread = new MatchmakingThread(system);
            thread.start();

            System.out.println("Matchmaking thread started successfully");

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
