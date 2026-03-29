import java.util.*;

// Manages players waiting in the lobby
class Lobby {

    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        if (p == null) {
            System.out.println("Cannot add null player");
            return;
        }
        if (players.contains(p)) {
            System.out.println(p.getName() + " already in lobby");
            return;
        }
        players.add(p);
        System.out.println(p.getName() + " joined lobby");
    }

    public void showPlayers() {
        if (players.isEmpty()) {
            System.out.println("Lobby is empty");
            return;
        }
        for (Player p : players) {
            System.out.println("Player: " + p.getName());
        }
    }

    public int getPlayerCount() {
        return players.size();
    }

    public boolean isEmpty() {
        return players.isEmpty();
    }

    // TODO: Add feature to remove players from lobby
}
