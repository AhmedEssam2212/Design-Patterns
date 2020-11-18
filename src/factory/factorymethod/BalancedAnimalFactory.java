package factory.factorymethod;

public class BalancedAnimalFactory implements AnimalFactory{
    Animal animal ;
    @Override
    public Animal crateAnimal() {
        if(false)
        {
          animal = new Dog();
        }
        return animal;
    }
}
