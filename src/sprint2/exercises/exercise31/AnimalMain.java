class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(getName() + " says Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void meow() {
        System.out.println(getName() + " says Meow!");
    }
}

class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }
    public void squak() {
        System.out.println(getName() + " says Squawk!");
    }
}

class AnimalShow {
    public void perform(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else if (animal instanceof Parrot) {
            Parrot parrot = (Parrot) animal;
            parrot.squak();
        } else {
            System.out.println(animal.getName() + " does not know a trick!");
        }
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        AnimalShow show = new AnimalShow();
        Animal dog = new Dog("The Dog");
        Animal cat = new Cat("My cat");
        Animal parrot = new Parrot("Pari");
        Animal unknown = new Animal("unknown animal");
        show.perform(dog);
        show.perform(cat);
        show.perform(parrot);
        show.perform(unknown);
    }
}