package exampleOne.caretaker;

import exampleOne.memento.ConfigurationMemento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void save(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int lastMementoIndex = history.size() - 1;
            ConfigurationMemento lastMemento = history.get(lastMementoIndex);
            history.remove(lastMementoIndex);

            return lastMemento;
        }

        return null;
    }
}
