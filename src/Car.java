public class Car extends Vehicle {

    private String color;
    private int year;
    private String type;


    private String description;


    public Car() {
    }

    public Car(String color, int year, String type) {
        this.color = color;
        this.year = year;
        this.type = type;
    }
    public void Start(String var){
        System.out.println(var+" is starting" );
    }

    public void Accelerate(String var){
        System.out.println(var +" is accelerating" );
    }
    public void setSpeed(int num){
       System.out.println("The Speed is "+ num +" mph.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
