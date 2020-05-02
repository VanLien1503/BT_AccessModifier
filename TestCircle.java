package BT_AccessModifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle circle=new Circle(10);
        System.out.println("Radius : "+circle.getRadius());
        System.out.println("area : "+circle.getArea());
        while (circle.getRadius()<1000){
            System.out.println("setRadius : ");
            circle.setRadius(scanner.nextDouble());
            System.out.println("Radius : "+circle.getRadius());
            System.out.println("area : "+circle.getArea());

        }
    }
}
