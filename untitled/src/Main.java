import Game.AbstractFactory.FantasyMUDFactory;
import Game.AbstractFactory.IMUDAbstractFactory;
import Game.AbstractFactory.SciFiMUDFactory;
import Game.Entities.Room;
import Game.GAMEENTITY.IGameEntity;
import Game.controller.MUDController.MUDController;
import Game.player.Player;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  /*  AnimalFactory animalFactory = new ConcreteImplementFactory();
        Animal dog1 = animalFactory.createAnimal("Dog");
        animalFactory.createAnimal("Cat").description();
*/

        Player player = new Player("Darhan");
        Room startRoom = (Room) new SciFiMUDFactory().createRoom();
        player.setCurrentRoom(startRoom);
        new MUDController(player).runGameLoop();


    }
}


interface Animal {
    void description();
}

class Dog implements Animal{

    public Dog() {
    }

    @Override
    public void description(){
        System.out.println("Dog");
    }
}

class Cat implements Animal{
    public Cat() {
    }

    @Override
    public void description(){
        System.out.println("Cat");
    }
}

interface AnimalFactory{
    Animal createAnimal(String type);
}

class ConcreteImplementFactory implements AnimalFactory {

    public ConcreteImplementFactory() {
    }

    @Override
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        }else return new Cat();
    }
}
