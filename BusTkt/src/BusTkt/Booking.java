package BusTkt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengername;
    int bus_no;
    Date date;
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        passengername = sc.nextLine();

        System.out.println("Enter Bus.No : ");
        bus_no = sc.nextInt();
        sc.nextLine() ;
        System.out.println("Enter date : ");
        String dateip = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateip);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusNo()==bus_no){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.bus_no==bus_no && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity;
    }
}
