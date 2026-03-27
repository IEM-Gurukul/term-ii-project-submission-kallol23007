// Entry point of the multiplayer matchmaking system 
public class Main {
    public static void main(String[] args) throws Exception {

        // Initialize lobby and matchmaking system
        Lobby lobby = new Lobby();
        MatchmakingSystem system = new MatchmakingSystem();

       //creating sample players with skill levels
        Player p1 = new Player("Alice", 10);
        Player p2 = new Player("Bob", 20);
        Player p3 = new Player("Charlie", 15);

        // adding players to lobby 
        lobby.addPlayer(p1);
        lobby.addPlayer(p2);
        lobby.addPlayer(p3);

        //simulating delay before players join matchmaking queue
        Thread.sleep(1000);
        system.joinQueue(p1);
        
        Thread.sleep(1000);
        system.joinQueue(p2);

        Thread.sleep(1000);
        system.joinQueue(p3);

        // Start matchmaking thread for continuous player matching
        MatchmakingThread thread = new MatchmakingThread(system);
        thread.start();
    }
}
