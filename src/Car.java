import java.util.Scanner;

public class Car {
    Car(String carBrand){
        System.out.println("The Car Brand is " + carBrand);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Car Brand: ");
        String cb = sc.nextLine();

        Car c = new Car(cb);

    }
}
