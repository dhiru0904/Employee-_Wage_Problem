package EmployeeWage;

public class DailyEmployeeWage {
    public DailyEmployeeWage () {
        System.out.println("Welcome to EmployeeWage....");
    }

    public static void main(String[] args) {
        DailyEmployeeWage  employee = new DailyEmployeeWage();
        System.out.println();
        //Declare the variable
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);
        int fullDayHour = 8;
        int wagePerHour = 20;
        int salary = 0;

        //Check the Employee is present or Absent
        if(randomCheck == isPresent)
        {
            System.out.println("Employee is present");
            salary = fullDayHour * wagePerHour;
            System.out.println("Salary is: $"+salary);
        }
        else
        {
            System.out.println("Employee is absent");
            System.out.println("Salary is: $"+salary);
        }
    }
}
