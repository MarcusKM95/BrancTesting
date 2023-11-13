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

    @Override
    public void mood(boolean happy) {
        if (happy){
            System.out.println("spinder");
        }
        else {
            System.out.println("hvæser");
        }
    }

    @Override
    public void jump(double distance) {
        System.out.println(distance + " " + "Meters jumped");
    }

}
