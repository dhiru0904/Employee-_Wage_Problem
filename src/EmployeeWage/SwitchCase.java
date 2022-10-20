package EmployeeWage;

public class SwitchCase {
    public SwitchCase () {
        System.out.println("Welcome to EmployeeWage ....");
    }

    public static void main(String[] args) {

        SwitchCase  a = new SwitchCase ();
        System.out.println();

        final int isPartTime = 1;
        final int isFullTime = 2;
        int randomCheck = (int) Math.floor((Math.random() * 10) % 3);
        int empHour;
        int wagePerHour = 20;
        int salary = 0;

        //Check a part-time
        switch (randomCheck) {
            default :
                System.out.println("Employee is absent");
                empHour=0;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isFullTime :
                System.out.println("Employee is working part-time");
                int partTimeHour = 4;
                empHour = partTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
            case isPartTime :
                System.out.println("Employee is working full-time");
                int fullTimeHour = 8;
                empHour = fullTimeHour;
                salary = empHour * wagePerHour;
                System.out.println("Salary is: $"+salary);
                break;
        }
    }
}
