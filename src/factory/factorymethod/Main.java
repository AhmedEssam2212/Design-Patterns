package factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new RandomizedAnimalFactory();
       System.out.println(animalFactory.crateAnimal());
    }
}
