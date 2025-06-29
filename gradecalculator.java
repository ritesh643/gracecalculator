import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner rp=new Scanner(System.in);
        System.out.println("enter marks for subject 1 : ");
        int sub1=rp.nextInt();
        System.out.println("enter marks for subject 2 : ");
        int sub2=rp.nextInt();
        System.out.println("enter marks for subject 3 : ");
        int sub3=rp.nextInt();
        System.out.println("enter marks for subject 4 : ");
        int sub4=rp.nextInt();
        System.out.println("enter marks for subject 5 : ");
        int sub5=rp.nextInt();

        int total_marks=sub1+sub2+sub3+sub4+sub5;
        float per=total_marks/5;
        if (per>=75 && per<=100)
        {
            System.out.println("your grade is : A+ \n Total marks :"+total_marks+"\n percentage is : "+per);

        }
        if (per>=60 && per<75)
        {
            System.out.println("your grade is : A \n Total marks :"+total_marks+"\n percentage is : "+per);

        }
        if (per>=55 && per<60)
        {
            System.out.println("your grade is : B \n Total marks :"+total_marks+"\n percentage is : "+per);

        }
        if (per>=35 && per<55)
        {
            System.out.println("your grade is : C \n Total marks :"+total_marks +"\n percentage is : "+per);

        }
        if(per<35) {
            System.out.println("You are Fail");
        }
    }
}
