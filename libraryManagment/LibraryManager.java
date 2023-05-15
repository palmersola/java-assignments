package libraryManagment;

import java.util.ArrayList;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T>{
    private ArrayList<T> list;

    public LibraryManager() {
        this.list = new ArrayList<>();
    }

    public void addItem(T item) {
        String add = list.add(item)? item.getTitle() + " was added": item.getTitle() + " not found" ;
        System.out.println(add);
    }

    public void deleteItem(T item) {
        String delete = list.remove(item)? item.getTitle() + " was deleted": item.getTitle() + " not found" ;
        System.out.println(delete);
    }
;
    public void displayItems() {
        for(T item: list) {
            System.out.println(item.getItemDetails());
        }
    }
}
