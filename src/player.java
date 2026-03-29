// Represents a player in the matchmaking system
class Player {

    private String name;
    private int skill;
    private String status;

    public Player(String name, int skill) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (skill < 0) {
            throw new IllegalArgumentException("Skill cannot be negative");
        }
        this.name = name;
        this.skill = skill;
        this.status = "Idle";
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Player: " + name + " | Skill: " + skill + " | Status: " + status);
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', skill=" + skill + ", status='" + status + "'}";
    }

    // TODO: Add ranking system based on skill level
}
