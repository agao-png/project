public class Hero extends Character {
    private int level;
    private int experiencePoints;
    private String heroClass;

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
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void gainExperience(int xp) {
        experiencePoints = experiencePoints + xp;
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
            result += "+==============================================+";
        return result;
    }
}