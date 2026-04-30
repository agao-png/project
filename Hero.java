public class Hero extends Character {
    private int level;
    private int experiencePoints;
    private String heroClass;
    private Inventory<Item> inventory = new Inventory<>();

    public Hero(String name, int health, int maxHealth, int attackPower, int defense, int level, int experiencePoints, String heroClass) {
        super(name, health, maxHealth, attackPower, defense);
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.heroClass = heroClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
    if (level < 1 || level > 99) {
        System.out.println("level must be between 1 and 99");
    } 
    else {
        this.level = level;
        }
    }

    public void setExperiencePoints(int experiencePoints) {
    if (experiencePoints < 0) {
        System.out.println("XP must be positive");
    } 
    else {
        this.experiencePoints = experiencePoints;
        }
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void gainExperience(int xp) {
    if (xp < 0) {
        System.out.println("XP cannot be negative");
    } 
    else {
        experiencePoints = experiencePoints + xp;
        }
    }

    public String toString() {
     String bar = healthBar(getHealth(), getMaxHealth());
        String result = "";
            result += "+==============================================+" + "|\n";
            result += "| " + getName().toUpperCase() + "  [" + heroClass + "]  Level " + level + "\n";
            result += "|----------------------------------------------" + "|\n";
            result += "| HP   : " + bar + "  " + getHealth() + "/" + getMaxHealth() + "|\n";
            result += "| ATK  : " + getAttackPower() + "      DEF  : " + getDefense() + "|\n";
            result += "| XP   : " + experiencePoints + "|\n";
            result += "| BAG  : " + inventory.getSize() + "items|\n";
            result += "+==============================================+";
        return result;
    }

    public void attack(Character target) {
    int damage = getAttackPower() - target.getDefense();
        if (damage < 1) damage = 1;
            target.setHealth(target.getHealth() - damage);
            System.out.println(getName() + " attacks, " + damage + " damage");
    }

    public Inventory<Item> getInventory() {
        return inventory;
    }
}