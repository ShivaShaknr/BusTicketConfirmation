package BusTkt;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
        ArrayList<Bus>buses = new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<>();

        buses.add(new Bus(1,true,4));
        buses.add(new Bus(2,false,3));
        buses.add(new Bus(3,true,2));

        for(Bus b:buses){
            b.displayInfo();
        }


        int userOpt=1;
        Scanner sc = new Scanner(System.in);
        while(userOpt==1){
            System.out.println("Enter 1 to Book and 2 to Exit:");
            userOpt = sc.nextInt();
            if(userOpt==1){
                Booking booking  = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Booking is confirmed!!!");
                }
                else{
                    System.out.println("Sorry!!!Bus is full");
                }
            }
            else{
                System.out.println("Thank You Bye........");
            }
        }
    }
}
