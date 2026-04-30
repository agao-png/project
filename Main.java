import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Monkey", 20, 50, 10, 15, 5, 12, "Warrior");

        Monster monster1 = new Monster("Goblin", 30, 30, 8, 3, 20, "Goblin");
        Monster monster2 = new Monster("Ogre", 50, 50, 12, 5, 40, "Ogre");
        Monster monster3 = new Monster("Troll", 40, 40, 10, 4, 30, "Troll");

        Potion potion = new Potion("Health Potion", 25, "Healing");
        Weapon weapon = new Weapon("Iron Sword", 15, "Sharp iron");
        Armor armor = new Armor("Iron Armor", 20, "Iron armor");

        Room room1 = new Room("Room1", "small");
        Room room2 = new Room("Room2", "big");
        Room room3 = new Room("Room3", "tiny");
        Room room4 = new Room("Room4", "huge");

        room1.addMonster(monster1);
        room1.addMonster(monster2);
        room1.addMonster(monster3);
        room1.addItem(potion);
        room1.addItem(weapon);
        room1.addItem(armor);

        Dungeon dungeon = new Dungeon();
        dungeon.addRoom(room1);
        dungeon.addRoom(room2);
        dungeon.addRoom(room3);
        dungeon.addRoom(room4);

        hero.getInventory().addItem(new Weapon("Spear", 20, "sharp"));
        hero.getInventory().addItem(new Weapon("Crossbow", 18, "ranged"));
        hero.getInventory().addItem(new Weapon("Stick", 5, "long"));
        hero.getInventory().displaySorted();

        Stack<Room> history = new Stack<>();
        history.push(room1);
        history.push(room2);
        history.push(room3);
        history.pop();
        history.pop();

        room1.loadMonsters();
        while (room1.hasMonsters()) {
            Monster m = room1.spawnNextMonster();
            m.attack(hero);
            hero.attack(m);
        }

        System.out.println("before");
        System.out.println(hero);
        System.out.println();
        room1.interact(hero);
        System.out.println();
        System.out.println("after");
        System.out.println(hero);

        hero.setHealth(-50);
        hero.setAttackPower(0);

        Leaderboard leaderboard = new Leaderboard();
        leaderboard.addScore("Monkey1", 10);
        leaderboard.addScore("Monkey2", 20);
        leaderboard.addScore("Monkey3", 30);
        leaderboard.printLeaderboard();

        System.out.println();
        System.out.println(dungeon);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Potion("elixir", 30, "blue"));
        itemList.add(new Weapon("bow", 10, "long range"));
        itemList.add(new Armor("helmet", 40, "sturdy"));
        itemList.add(new Potion("magic", 20, "purple"));
        Collections.sort(itemList);
        System.out.println();
        System.out.println("Items");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}