public class Main {
    public static void main(String[] args) throws Exception {

        Lobby lobby = new Lobby();
        MatchmakingSystem system = new MatchmakingSystem();

        Player p1 = new Player("Alice", 10);
        Player p2 = new Player("Bob", 20);
        Player p3 = new Player("Charlie", 15);

        lobby.addPlayer(p1);
        lobby.addPlayer(p2);
        lobby.addPlayer(p3);

        Thread.sleep(1000);
        system.joinQueue(p1);
        
        Thread.sleep(1000);
        system.joinQueue(p2);

        Thread.sleep(1000);
        system.joinQueue(p3);

        MatchmakingThread thread = new MatchmakingThread(system);
        thread.start();
    }
}