package exampleOne;

import exampleOne.caretaker.ConfigurationCareTaker;
import exampleOne.memento.ConfigurationMemento;
import exampleOne.originator.ConfigurationOriginator;

public class Application {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        ConfigurationOriginator originator = new ConfigurationOriginator(10, 10);
        ConfigurationMemento snapshotOne = originator.createMemento();
        careTaker.save(snapshotOne);

        originator.setHeight(20);
        originator.setWidth(20);
        ConfigurationMemento snapshotTwo = originator.createMemento();
        careTaker.save(snapshotTwo);

        originator.setHeight(30);
        originator.setWidth(30);

        ConfigurationMemento restoredStateMemento = careTaker.undo();
        originator.restoreMemento(restoredStateMemento);

        System.out.println(originator);
    }
}
