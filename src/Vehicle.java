public abstract class Vehicle {
    public void start(){
        System.out.println("The engine have started");
    }
    public void move(){
        System.out.println("The vehicle have started");
    }
    public void stop(){
        System.out.println("The vehicle have stopped");
    }
    abstract String testMethod();
}
