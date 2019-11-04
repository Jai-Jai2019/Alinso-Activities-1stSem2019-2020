import javax.swing.JOptionPane;

	public class AgeJ {
		public static void main (String [] args) {
		
		
		
		while(true) {
			try {
			    
			    int age;
			    String age1;
			    
			    age1 = JOptionPane.showInputDialog(null, "Age Please");
			    
				if (age1 == null){
					System.exit(0);
				}
				else if (age1 != null){
					age = Integer.parseInt(age1);
					
				
				if (age >= 0 && age <= 3)
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Baby");	
				else if (age >= 4 && age <= 12)
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Child");
				else if (age >= 13 && age <= 19) 
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Teenager");
				else if (age >= 20 && age <= 32) 
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Young Adult");
				else if (age >= 33 && age <= 45) 
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Middle Aged Person");
				else if (age >= 46 && age <= 59)
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Adult");
				else if (age >= 60 && age <= 122) 
					JOptionPane.showMessageDialog(null, "You are " + age + " yrs old so You are a Senior");
				else if (age >= 0)
					JOptionPane.showMessageDialog(null, "I think That was Wrong!");
				break;
			}
		}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Please Try Again! ");
			}
		}
	}
}
