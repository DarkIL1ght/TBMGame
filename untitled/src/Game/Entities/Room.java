package Game.Entities;

import Game.GAMEENTITY.IGameEntity;
import Game.Item.Item;

import java.util.*;

public class Room implements IGameEntity {
    private String name;
    private String description;

    private Map<String, Room> exits;
    private List<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        exits = new HashMap<>();
        items = new ArrayList<>();
    }

    @Override
    public void describe() {
        System.out.println("Room: " + name + ", " + description);
    }


    public void addExit(String direction, Room room) {
        exits.put(direction.toLowerCase(), room);
    }

    public Room getExit(String direction) {
        return exits.get(direction.toLowerCase());
    }

    public List<Item> getItems() {
        return items;
    }
    public void addItems(Item item) {
        items.add(item);}

    public IGameEntity removeItem(String itemName) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(itemName)) {
                iterator.remove(); // Теперь удаление безопасно
                return item;
            }
        }
        return null;
    }



}

