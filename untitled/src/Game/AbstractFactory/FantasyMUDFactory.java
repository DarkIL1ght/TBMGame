package Game.AbstractFactory;
import Game.NPC.NPC;
import Game.Entities.Room;
import Game.GAMEENTITY.IGameEntity;

public class FantasyMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Fantasy Room", "A mystical, enchanted chamber.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Elf Warrior", "A brave warrior from the elven lands.");
    }
}
