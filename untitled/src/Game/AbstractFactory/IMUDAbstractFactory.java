package Game.AbstractFactory;

import Game.GAMEENTITY.IGameEntity;

public interface IMUDAbstractFactory {
    IGameEntity createRoom();
    IGameEntity createNPC();
}
