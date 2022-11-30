import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your annual income");
        int income=sc.nextInt();
        if(income<=100000)
        {
            System.out.println("no tax");
        }
        else if(income>=100001 && income<=150000)
        {    //more than 100000 tax
            int eia=income-100000;
        double a=(eia*0.10)+2000;
            System.out.println("tax= "+a);
        }
        else if (income>=150001 && income<=300000) {
            //more than 150000 tax
            int eib=income-150000;
            double b=(eib*0.15)+5000;
            System.out.println("tax= "+b);

        } else if (income>300000) {
            // more than 300000 tax
            int eic=income-300000;
            double c=(eic*0.25)+10000;
            System.out.println("tax= "+c);
        }
    }
}