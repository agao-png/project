public class Character {
    private String name;
    private int health;
    private int maxHealth;
    private int attackPower;
    private int defense;

    public Character(String name, int health, int maxHealth, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public static String healthBar(int current, int max) {
        int filled = (int)((current / (double) max) * 20);
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            bar.append(i < filled ? "\u2588" : "\u2591");
        }
        return bar.toString();
    }

    public String toString() {
     String bar = healthBar(health, maxHealth);
        String result = "";
            result += "+==============================================+" + "|\n";
            result += "| " + name.toUpperCase() + "\n"; 
            result += "|----------------------------------------------" + "|\n";
            result += "| HP   : " + bar + "  " + health + "/" + maxHealth + "|\n";
            result += "| ATK  : " + attackPower + "      DEF  : " + defense + "|\n";
            result += "+==============================================+";
        return result; 
    }
}