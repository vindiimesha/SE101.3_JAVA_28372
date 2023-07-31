package com.mycompany.practical3_exercise3_2;

public class Practical3_Exercise3_2 {

    public static void main(String[] args) {
        Employee e1 = new Employee(10000.00f);    // pass the value of bonus
        
        //set employee name
        e1.setname("Bogdan");
        //get employee name
        System.out.println("Employee Name: "+ e1.getname());
        
        //set basic salary
        e1.setbasicsal(50000.00f);
        //get basic salary
        System.out.println("Basic Salary"+ e1.getbasicsal());
        
        //get bonus
        System.out.println("Bonus: "+ e1.getbonus());
        
        //call bonus amount method
        System.out.println("Bonus Amount: "+ e1.bonusamount());
    }
}
