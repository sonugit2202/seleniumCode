package ClassAndObj;

public class Car {

    String name;
    int price;
    String color;
    static int wheels = 4;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.price = 80;
        car1.color = "White";

        System.out.println(car1.name + " "+ car1.price + " "+ car1.color +" "+ Car.wheels);
        System.out.println("*********************");
        Car car2 = new Car();
        car2.name = "Audi";
        car2.price = 70;
        car2.color = "Black";

        System.out.println(car2.name + " "+ car2.price + " "+ car2.color +" "+ Car.wheels);
        System.out.println("*********************");
        Car car3 = new Car();
        car3.name = "Ferrari";
        car3.price = 100;
        car3.color = "Red";
        System.out.println(car3.name + " "+ car3.price + " "+ car3.color +" "+ Car.wheels);
        System.out.println(car3.wheels);
        System.out.println(wheels);
    }
}
