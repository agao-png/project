import java.util.ArrayList;

public class Room implements Interactable {
    private String name;
    private String description;
    private ArrayList<Item> items;
    private ArrayList<Monster> monsters;
    private boolean visited;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<Item>();
        this.monsters = new ArrayList<Monster>();
        this.visited = false;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String toString() {
     String itemNames = "";
        for (Item item : items) {
            itemNames += item.getName() + ", ";
        }

     String monsterNames = "";
        for (Monster monster : monsters) {
            monsterNames += monster.getName() + ", ";
        }

     String result = "";
        result += "#============================================#" + "\n";
        result += "#  ROOM: " + name + "\n";
        result += "#  " + description + "\n";
        result += "#--------------------------------------------#" + "\n";
        result += "#  ITEMS   : " + itemNames + "\n";
        result += "#  MONSTERS: " + monsterNames + "\n";
        result += "#  VISITED : " + visited + "\n";
        result += "#============================================#";
     return result;
    }
    
    public void interact(Hero hero) {
    visited = true;
    System.out.println(this);
    for (Item item : items) {
        if (item instanceof Interactable) {
            ((Interactable) item).interact(hero);
        }
    }
    for (Monster monster : monsters) {
        monster.attack(hero);
    }
}
}