package factory.factorymethod;

public class RandomizedAnimalFactory implements AnimalFactory {
    Animal animal;
    @Override
    public Animal crateAnimal() {
        if(true)
        {
            animal = new Cat();

        }
        return animal;
    }
}
