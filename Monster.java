public class Monster extends Character {
    private int rewardXP;
    private String monsterType;

    public Monster(String name, int health, int maxHealth, int attackPower, int defense, int rewardXP, String monsterType) {
        super(name, health, maxHealth, attackPower, defense);
        this.rewardXP = rewardXP;
        this.monsterType = monsterType;
    }

    public int getRewardXP() {
        return rewardXP;
    }

    public void setRewardXP(int rewardXP) {
        this.rewardXP = rewardXP;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public String toString() {
     String result = "";
        result += "+-----------------------------+" + "\n";
        result += "| " + getName().toUpperCase() + "  [Monster]" + "|\n";
        result += "| HP   : " + getHealth() + "/" + getMaxHealth() + "|\n";
        result += "| ATK  : " + getAttackPower() + "    DEF : " + getDefense() + "|\n";
        result += "| Reward XP : " + rewardXP + "|\n";
        result += "+-----------------------------+";
     return result;
    }

    public void attack(Character target) {
    System.out.println(getName() + "snarls and strikes");
    int damage = getAttackPower() - target.getDefense();
        if (damage < 1) damage = 1;
            target.setHealth(target.getHealth() - damage);
            System.out.println(getName() + " attacks, " + damage + " damage");
}
}