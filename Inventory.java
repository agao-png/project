import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//no duplicates so hashset
public class Inventory<T extends Item> {
    private HashSet<T> items = new HashSet<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public boolean hasItem(T item) {
        return items.contains(item);
    }

    public int getSize() {
        return items.size();
    }

    public void displaySorted() {
        ArrayList<T> sorted = new ArrayList<>(items);
        Collections.sort(sorted);
        System.out.println("Inventory" + items.size() + "items");
        for (T item : sorted) {
            System.out.println(item);
        }
    }
}