import java.util.*;

class MatchmakingSystem {

    private Queue<Player> queue = new LinkedList<>();

    // method to add player to matchmaking queue
    public void joinQueue(Player p) {
        if (p == null) {
            System.out.println("Cannot add null player to queue");
            return;
        }

        if (queue.contains(p)) {
            System.out.println(p.getName() + " is already in matchmaking queue");
            return;
        }

        queue.add(p);
        System.out.println("Player " + p.getName() + " successfully joined matchmaking queue");
    }

    public GameRoom matchPlayers() {
        System.out.println("Searching for players to match...");

        if (queue.size() >= 2) {
            Player p1 = queue.poll();
            Player p2 = queue.poll();

            System.out.println("Match found: " + p1.getName() + " vs " + p2.getName());

            return new GameRoom(p1, p2);
        }

        return null;
    }

    public int getQueueSize() {
        return queue.size();
    }

    // TODO: Implement skill-based matchmaking logic
}
