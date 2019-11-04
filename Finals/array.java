package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
import  javax.swing.JOptionPane;

public class Array {

   
    public static void main(String[] args) {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int empSalary = 0, counter = 1;
        String empSalary1;
        try{
        for(int i = 1; i < 9 ;i ++){
            do {            
                System.out.println("------------TRYING SIMULATION---------------");
                empSalary1 = JOptionPane.showInputDialog(null, "Enter employees gross salary: ");
                if(empSalary1 == null){
                    System.exit(0);
                }
                else{
                System.out.println("Employee #" + counter);
                counter++;
                empSalary = Integer.parseInt(empSalary1);
               
                if(empSalary < 0 || empSalary > 100000) System.out.println("Please enter gross salary between 0  to 100000.");

                else compute(empSalary);
                int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another Employee?\n[0] Yes\n[1] No"));
                 switch(x){  
                     case 1:
                        print();
                        System.exit(0);
                     default:
                        if(x != 0){
                            System.out.println("-------------SIMULATION FAIL----------------");
                            System.exit(0);
                            }
                        }
                    }  
                }while (empSalary < 0 || empSalary > 100000);
            }
       }
       catch(Exception e){
           System.out.println("-------------SIMULATION FAIL----------------");
       }
    }
    public static void compute(int empSalary){
       
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Weekly Gross: " + df.format(empSalary));
       
        double salary = empSalary * 0.09;
        System.out.println("Weekly Bonus: " + df.format(salary));
       
        double weekTotal = salary + 200;
        System.out.println("Weekly Total: " + df.format(weekTotal));
    }
    static int counter = 0;
    static int counterNumber [] = {0};
    
    public static void print(){
        System.out.println("There is/are " + counterNumber[0] + " employee.");
    }
}
