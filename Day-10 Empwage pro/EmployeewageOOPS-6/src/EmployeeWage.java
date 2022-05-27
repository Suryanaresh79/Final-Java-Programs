import java.util.Random;

public class EmployeeWage {
 /*
 Creating random function to check Weather employee is present or not
  */


    static int random(){
        Random ran = new Random();
        int i = ran.nextInt(3)+1;
        return i;
    }

/*
* Creating hours() method to calculate how many hours and days employee work and return
* how many hours employee works
* */



    static int hours(){
        int emphrs=0;
        int days =0;
       while (emphrs<=99 && days<=20) {
           switch (random()) {
               case 1:
                       emphrs = emphrs + 8;
                       days= days +1;
                       break;
               case 2:
                    emphrs = emphrs + 4;
                       break;
               default:
                   break;
          }
       }
       System.out.println("No of days Employee Worked : "+days);    // printing nof days Employee worked

       return emphrs;
    }



    /*
* Caluculate Total Wage of Employee
* */


    static int total_wage(){
        int total_wage=no_of_hours*wage_per_hour;
        return total_wage;
    }


    public static final int random = random();
    public static int wage_per_hour =20;
    public static final int no_of_hours=hours();

    public static void main(String[] args){
/*
* Printing How many hours,days employee Worked and Total Wage of a Employee
* */
        System.out.println("How many hours employee Worked :"+no_of_hours);
        System.out.println("The total wage of employee is "+total_wage());

    }
}