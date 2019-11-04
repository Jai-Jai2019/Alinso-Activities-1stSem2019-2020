import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Final2 {
   
    public static void main(String[] args) throws IOException {
       
        DecimalFormat df = new DecimalFormat("0.00");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
            String shape = "";
            double radius = 0, width, height, side;
           
            while(true){
                System.out.println("Enter The Desired shape: ");
                shape = br.readLine();
           
            switch(shape){
                     
                case "Circle":  
                    boolean a = true;
                   
                    System.out.println("Enter Radius: ");
                    radius = Float.parseFloat(br.readLine());
                    double ans0 = (Math.PI * (radius * radius));
                   
                    System.out.println(df.format(ans0));
                    while(true){
                       
                        System.out.println("Do You Want To Try Again? [Y/N]");
                        char ans = br.readLine().charAt(0);

                        if (ans == 'Y'){
                            break;
                        }
                        else if (ans == 'N'){
                        	System.out.println("Thank You For Using Me!");
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                           System.out.println("Wrong Input");
                           continue;
                        }
                    }
                    break;
           
                case "Square":
                   
                    System.out.println("Enter : ");
                    side = Float.parseFloat(br.readLine());
                    double ans2 = (side * side);
                   
                    System.out.println(df.format(ans2));
                    while(true){
                       
                        System.out.println("Do You Want To Try Again? [Y/N]");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'Y'){
                            break;
                        }
                        else if (ans == 'N'){
                        	System.out.println("Thank You For Using Me!");
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Wrong Input");
                            continue;
                        }
                    }
                    break;
         
                   
                case "Rectangle":
                   
                    System.out.println("Enter Height: ");
                    height = Float.parseFloat(br.readLine());
                    System.out.println("How about the Width: ");
                    width = Float.parseFloat(br.readLine());
                    double ans3 = (height * width);
                   
                    System.out.println(df.format(ans3));
                    while(true){
                       
                        System.out.println("Do You Want To Try Again? [Y/N]");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'Y'){
                            break;
                        }
                        else if (ans == 'N'){
                        	System.out.println("Thank You For Using Me!");
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Wrong Input :(");
                            continue;
                        }
                    }
                    break;
                   
                case "Triangle":
                    System.out.println("Enter Height: ");
                    height = Float.parseFloat(br.readLine());
                    System.out.println("How about the Width: ");
                    width = Float.parseFloat(br.readLine());
                    double ans4 = 1/2 * (height * width);
                   
                    System.out.println(df.format(ans4));
                    while(true){
                       
                        System.out.println("Do You Want To Try Again? [Y/N]");
                        char ans = br.readLine().charAt(0);
                       
                        if (ans == 'Y'){
                            break;
                        }
                        else if (ans == 'N'){
                        	System.out.println("Thank You For Using Me!");
                            System.exit(0);
                        }
                        else if (ans != 'y' && ans != 'n'){
                            System.out.println("Wrong Input :(");
                            continue;
                        }
                    }
                    break;
                   
                default:
                    System.out.println("Try again");
            }
		}            
	}
}

