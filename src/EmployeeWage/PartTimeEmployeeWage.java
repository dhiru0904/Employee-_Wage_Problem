package EmployeeWage;

public class PartTimeEmployeeWage {
    public PartTimeEmployeeWage() {
        System.out.println("Welcome to EmployeeWage....");
    }
    public static void main(String[] args) {
        PartTimeEmployeeWage employee = new PartTimeEmployeeWage();
        System.out.println();
        double isPartTime = 1;
        double isFullTime = 2;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Add part_time
        if (randomCheck == isFullTime)
        {
            int fullTimeHour = 8;
            empHour = fullTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Employee is working full time.");
            System.out.println("Salary is: $"+salary);
        }
        else if (randomCheck == isPartTime)
        {
            int partTimeHour = 4;
            empHour = partTimeHour;
            salary = empHour * wagePerHour;
            System.out.println("Employee is working part time.");
            System.out.println("Salary is: $"+salary);
        }
        else
        {
            empHour=0;
            System.out.println("Employee is absent.");
            System.out.println("Salary is: $"+salary);
        }
    }
}
