import java.util.*;

class MatchmakingSystem {
    private Queue<Player> queue = new LinkedList<>();

   //method to add player to matchmaking queue
    public void joinQueue(Player p) throws Exception {
        // Check if player already exists in queue
        if (queue.contains(p)) {
            throw new Exception("Player already in queue");
        }
        queue.add(p);
        System.out.println("player " + p.getName() + "successfully joined matchmaking queue");
    }

    public GameRoom matchPlayers() {
        System.out.println("Matching players...");
        if (queue.size() >= 2) {
            Player p1 = queue.poll();
            Player p2 = queue.poll();
            return new GameRoom(p1, p2);
        }
        return null;
    }
}
