package Game.AbstractFactory;

import Game.Entities.Room;
import Game.GAMEENTITY.IGameEntity;
import Game.NPC.NPC;

public class SciFiMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Sci-Fi Room", "A futuristic spaceship corridor.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Android", "A highly advanced humanoid robot.");
    }
}
