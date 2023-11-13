public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Vuf");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(boolean happy) {
        if (happy){
            System.out.println("logrer");
        }
        else {
            System.out.println("knurrer");
        }
    }

    @Override
    public void jump(double distance){
        System.out.println(distance + " " + "Meters jumped");
    }

}

