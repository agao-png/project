public abstract class Character {
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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(int health) {
    if (health < 0) {
        System.out.println("Health cannot be negative");
    } 
    else if (health > maxHealth) {
        System.out.println("Health cannot exceed max health");
    } 
    else {
        this.health = health;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
    if (attackPower <= 0) {
        System.out.println("Attack power must > 0");
    } 
    else {
        this.attackPower = attackPower;
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
    if (defense < 0) {
        System.out.println("Defense cannot be negative");
    } 
    else {
        this.defense = defense;
        }
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

    public abstract void attack(Character target);

}