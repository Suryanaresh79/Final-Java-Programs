import java.util.Random;

public class EmployeeAttendence {
    static int random(){
        Random ran = new Random();
        int i = ran.nextInt(2)+1;
        return i;
    }

    static String attendence(){
        String att;
        if (random()==1){
            att = "Present";
        }
        else   {
            att = "Absent";
        }
        return att;
    }


    public static void main(String[] args){
        System.out.println("The Employee is "+attendence());
    }
}