import java.util.*;

class Lobby {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
        System.out.println(p.getName() + " joined lobby");
    }

    public void showPlayers() {
        for (Player p : players) {
            System.out.println(p.getName());
        }
    }
}