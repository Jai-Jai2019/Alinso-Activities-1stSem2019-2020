package arraysort;

import java.util.Scanner;  

public class ArraySort {   
    
    public static void main(String[] args) {
        
        Scanner ian = new Scanner (System.in);
        int as, a, b, temp, s=0, m=0;
      
        System.out.println("How many Arrays do you want?");
        as = ian.nextInt();
        int [] e = new int[as];
        
        for (a = 0; a < as; a++) {
            System.out.println("Element # " + a);
            e[a] =ian.nextInt();
            s += e[a];
            m = s / as;
        }
        
        System.out.println("The Unordered List:");
        for (b = 0; b < as; b++) {
            System.out.println(e[b]);
        }
        
        System.out.println("The Ordered List:");
        for (b = 0; b < as; b++) {
            for (a = 0; a < as; a++) {
                if (e [a] > e[b]) {
                    temp = e[a];
                    e[a] = e[b];
                    e[b] = temp;
                }
            }
        }
        
        for (b= 0; b < as; b++) {
            System.out.println(e[b]);
        }
        System.out.println("Mean " + m);
    }
}  
