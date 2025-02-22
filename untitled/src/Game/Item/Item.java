package Game.Item;

import Game.GAMEENTITY.IGameEntity;

public class Item implements IGameEntity {
    private String name;
    private String description;
    public Item(String name, String s) {
        this.name = name;
        this.description = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println(name + ": " + description);
    }
}
