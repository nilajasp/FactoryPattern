package SimpleFactory;

import java.util.Scanner;

/**
 * Created by nilajapatankar on 6/5/14.
 */
public class Broker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which type of house do you want?(Enter 1 or 2)\n1. High budget house\n2. Low budget house");
        int typeOfHouse = sc.nextInt();
        IHouse house = HouseFactory.GetHouse(typeOfHouse);
        int priceOfSelectedHouse = house.getPrice();
        if (typeOfHouse == 1 || typeOfHouse == 2)
            System.out.println("Price of your house will be Rs." + priceOfSelectedHouse);
        else
            System.out.println("This house is not available");
    }
}
