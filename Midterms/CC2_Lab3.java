public class CC2_Lab3 {

  public static void main (String [] args) {
    
    char A, L, I, N;
    int  a, b, c, d;
    A = 'J';
    L = 'A';
    I = 'I';
    N = '!';
    
    a = A;
    b = L;
    c = I;
    d = N;
    
    int sum = a+b+c+d;
    int product = a*b*c*d;
    int sum2 = a+b+c;
    //int average = sum / 3;
    int average2 = sum2 /3;
    int modulo = sum % 4;
    System.out.println(A + " - " + a);
    System.out.println(L + " - " + b);
    System.out.println(I + " - " + c);
    System.out.println(N + " - " + d);
    System.out.println("JAI!");
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Average: " + average);
    System.out.println("Remainder: " + product % average2);
    
    
    
  }
}
