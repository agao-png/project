import java.util.HashMap;

// Hashmap so you can look up the room easily
public class Dungeon {
    private HashMap<String, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getName(), r);
    }

    public Room getRoom(String name) {
        return rooms.get(name);
    }

    public void listRooms() {
        for (Room r : rooms.values()) {
         System.out.println(r.getName() + " - visited: " + r.isVisited());
        }
    }

    public String toString() {
        String result = "";
        result += "=============================\n";
        result += "         DUNGEON MAP         \n";
        result += "=============================\n";
        for (String name : rooms.keySet()) {
            String visited = rooms.get(name).isVisited() ? "[X]" : "[ ]";
            result += "#  " + visited + " " + name + "\n";
        }
        result += "#  [X] = visited                 #\n";
        result += "#================================#";
        return result;
    }
}