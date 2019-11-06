public class carApp {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car();
        car.Start("Grey camry");
        car1.Start("blue Hyundai");
        car.Accelerate("Grey camry");
        car1.Accelerate("blue Hyundai");
        car.setSpeed(56);
        car1.setSpeed(100);
    }
}
