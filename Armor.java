public class Armor extends Item implements Interactable {
    public Armor(String name, int value, String description) {
        super(name, "Armor", value, description);
    }

    public void interact(Hero hero) {
        hero.setDefense(hero.getDefense() + getValue());
        System.out.println(hero.getName() + " equips " + getName() + "DEF +" + getValue());
    }
}