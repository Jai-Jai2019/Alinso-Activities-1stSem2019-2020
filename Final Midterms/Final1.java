import javax.swing.JOptionPane;
  public class Time { public static void main (String [] args) { 
  
  int mins, minutes, hrs; 
  JOptionPane.showMessageDialog(null, "Time Calulator"); 
  
  minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Please State Your Time"));
  
  hrs = minutes / 60; 
  mins = minutes % 60; 
  
  JOptionPane.showMessageDialog(null, hrs + " hours " + mins+ " minutes"); 
  
  } 
}
