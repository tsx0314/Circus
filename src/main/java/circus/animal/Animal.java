package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();

    // static comparator object
    public static Comparator<Animal> AnimalNoneComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    };
}
