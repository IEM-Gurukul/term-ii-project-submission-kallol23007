import java.util.*;

class MatchmakingSystem {
    private Queue<Player> queue = new LinkedList<>();

    public void joinQueue(Player p) throws Exception {
        if (queue.contains(p)) {
            throw new Exception("Player already in queue");
        }
        queue.add(p);
        System.out.println(p.getName() + " joined matchmaking queue");
    }

    public GameRoom matchPlayers() {
        if (queue.size() >= 2) {
            Player p1 = queue.poll();
            Player p2 = queue.poll();
            return new GameRoom(p1, p2);
        }
        return null;
    }
}