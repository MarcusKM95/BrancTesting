public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miav");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
