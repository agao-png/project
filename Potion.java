public class Potion extends Item implements Interactable {
    public Potion(String name, int value, String description) {
        super(name, "Potion", value, description);
    }

    public void interact(Hero hero) {
        hero.setHealth(hero.getHealth() + getValue());
        System.out.println(hero.getName() + " drinks " + getName() + " and recovers " + getValue() + " HP");
    }
}