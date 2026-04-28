import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Monkey", 20, 50, 10, 15, 5, 12, "Warrior");

        Monster monster1 = new Monster("Goblin", 30, 30, 8, 3, 20, "Goblin");
        Monster monster2 = new Monster("Ogre", 50, 50, 12, 5, 40, "Ogre");

        Potion potion = new Potion("Health Potion", 25, "Healing");
        Weapon weapon = new Weapon("Iron Sword", 15, "Sharp iron");
        Armor armor = new Armor("Iron Armor", 20, "Iron armor");

        Room room = new Room("Dark hallway", "dark hallway hard to see");

        room.addMonster(monster1);
        room.addMonster(monster2);

        room.addItem(potion);
        room.addItem(weapon);
        room.addItem(armor);

    System.out.println("--- Before ---");
    System.out.println(hero);
    System.out.println();

    room.interact(hero);

    System.out.println();
    System.out.println("--- After ---");
    System.out.println(hero);

    hero.setHealth(-50);
    hero.setAttackPower(0);

    ArrayList<Item> itemList = new ArrayList<>();
    itemList.add(new Potion("elixir", 10, "blue"));
    itemList.add(new Weapon("bow", 30, "long range"));
    itemList.add(new Armor("helmet", 20, "sturdy"));
    itemList.add(new Potion("magic", 40, "purple"));

    Collections.sort(itemList);

    System.out.println();
    System.out.println("--- Items by value ---");
    for (Item item : itemList) {
        System.out.println(item);
    }
}
}