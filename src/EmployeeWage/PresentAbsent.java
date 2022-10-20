package EmployeeWage;

public class PresentAbsent {
    public PresentAbsent() {

        System.out.println("Welcome to EmployeeWage ....");
    }

    public static void main(String[] args) {

        //create a object
        PresentAbsent employee = new PresentAbsent();
        System.out.println();

        //Declare the variable....
        double isPresent = 1;
        double randomCheck = (double)Math.floor((Math.random()*10)%2);

        //Check the Employee is present.....
        if (randomCheck == isPresent)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }

    }
}


