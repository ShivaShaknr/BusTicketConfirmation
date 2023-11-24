package BusTkt;

public class Bus {
    private int bus_no;
    private boolean ac;
    private int capacity;//bcoz of private define get and set method
    Bus(int no,boolean ac,int cap){
        this.bus_no=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBusNo(){
        return bus_no;
    }
    public boolean isAC(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public void setAc(boolean val){
        ac=val;
    }
    public void displayInfo(){
        System.out.println("Bus No : "+bus_no+" - AC/NON-AC : "+ac+" - Capacity : "+capacity);
    }
}
