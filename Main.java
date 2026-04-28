public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Monkey", 20, 50, 10, 15, 5, 12, "Warrior");

        Monster monster1 = new Monster("Goblin", 30, 30, 8, 3, 20, "Goblin");
        Monster monster2 = new Monster("Ogre", 50, 50, 12, 5, 40, "Ogre");

        Item item1 = new Item("Iron sword", "Weapon", 15, "Sharp iron");
        Item item2 = new Item("Health potion", "Potion", 25, "Healing");
        Item item3 = new Item("Iron armor", "Armor", 20, "Iron armor");

        Room room = new Room("Dark hallway", "dark hallway hard to see");

        room.addMonster(monster1);
        room.addMonster(monster2);

        room.addItem(item1);
        room.addItem(item2);
        room.addItem(item3);

        System.out.println(hero);
        System.out.println();
        System.out.println(monster1);
        System.out.println();
        System.out.println(monster2);
        System.out.println();
        System.out.println(room);
    }
}