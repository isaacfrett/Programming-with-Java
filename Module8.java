// Isaac Frett 11/27/2022 Module 8 Programming Assignment
// The prupose of this code is to test method overloading with four methods of yearlyService with different parameters

import java.text.NumberFormat;
import java.util.Locale;

public class Module8 {
    
    // standard charge for all methods
    public static double standard_charge = 49.99;

    public static void main(String[] args) {

        // To format our currency and dollar amount output
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        
        // 8 method calls for each method twice with different amounts for each service to test each method
        System.out.println(currency.format(yearlyService())); 
        System.out.println(currency.format(yearlyService())); 
        System.out.println(currency.format(yearlyService(49.97)));
        System.out.println(currency.format(yearlyService(42.00)));
        System.out.println(currency.format(yearlyService(45.86, 79.65)));
        System.out.println(currency.format(yearlyService(43.65, 78.56)));
        System.out.println(currency.format(yearlyService(44.56, 77.45, 20)));   
        System.out.println(currency.format(yearlyService(48.76, 79.43, 30)));
    }

    // the four methods of yearlyService each adding an additional parameter
    public static double yearlyService() {
        return standard_charge;
    }

    public static double yearlyService(Double oil_charge) {
        return standard_charge + oil_charge;
    }

    public static double yearlyService(Double oil_charge, Double tire_charge) {
        return standard_charge + oil_charge + tire_charge;
    }

    public static double yearlyService(Double oil_charge, Double tire_charge, int coupon) {
        return standard_charge + oil_charge + tire_charge - coupon;
    }

}
