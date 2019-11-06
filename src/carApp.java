import java.util.ArrayList;

public class carApp {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        Car car=new Car();
        Car car1=new Car();
        car.Start("Grey camry");
        car1.Start("blue Hyundai");
        car.Accelerate("Grey camry");
        car1.Accelerate("blue Hyundai");
        car.setSpeed(56);
        car1.setSpeed(100);

        //adding the car object to array list
        cars.add(car);
        cars.add(car);

        //enhanced loop inorder to display each car

        for (Car carr:cars){
            System.out.println(car.getDescription());
        }
    }
}
