package Game.player;

import Game.GAMEENTITY.IGameEntity;
import Game.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {


    String name;
    List<IGameEntity> inventory;
    IGameEntity currentRoom;
    public Player(String name) {
        this.name = name;
        inventory = new ArrayList<>();
    }



    public IGameEntity getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(IGameEntity room) {
        this.currentRoom = room;
    }

    public void addItemToInventory(IGameEntity item) {
        inventory.add(item);
    }

    public List<IGameEntity> getInventory() {
        return inventory;
    }
}
