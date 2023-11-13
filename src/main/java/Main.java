public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Hans");
        Cat cat1 = new Cat("Ole");
        cat1.makeSound();
        dog1.makeSound();
        dog1.eat("dogfood");
        cat1.eat("catfood");
        dog1.mood(true);
        cat1.mood(false);

    }
}
