/*
Electricity Bill Calculator
Calculate bill based on units
*/
import java.util.*;
public class Bill {
    float rate; // Variable for storing rate of electricity
    float previous_reading; // Variable for storing previous reading 
    float current_reading; // Variable for storing current reading

    public Bill(float rate) {
        this.rate=rate;
    }
    public void bill_calculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter previous reading (in Kwh)");
        previous_reading = sc.nextFloat();
        System.out.println("Enter current reading (in Kwh)");
        current_reading = sc.nextFloat();
        float total_units = current_reading-previous_reading; // Variable for calculating total units consumed

        float bill_amount = total_units*rate; // Variable for calculating total bill 
        System.out.println("RATE (per unit cost) = "+rate);
        System.out.println("UNITS CONSUMED(in Kwh) = "+total_units);
        System.out.println("Total Electricity bill = "+bill_amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rate_of_elec;

        System.out.println("Enter the rate of electricity (per KwH cost) ");
        rate_of_elec = sc.nextFloat();
        
        Bill b = new Bill(rate_of_elec);
        b.bill_calculator();
    }
}