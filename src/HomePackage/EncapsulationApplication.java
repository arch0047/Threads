package HomePackage;

import java.util.Scanner;


public class EncapsulationApplication {

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Encapsulate obj = new Encapsulate();

        //setting values of the variables
        System.out.println("Enter Name :");
        obj.setName(myObj.next());
        System.out.println("Enter yr Age :");
        obj.setAge(myObj.nextInt());
        System.out.println("Enter yr Role :");
        obj.setRoll(myObj.next());

        //Displaying values of the variables
        System.out.println("");
        System.out.println("My name: " + obj.getName());
        System.out.println("My age: "  + obj.getAge());
        System.out.println("My roll: " + obj.getRoll());

    }
}