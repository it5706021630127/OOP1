import javax.swing.JOptionPane;
public class Skocimis_method {
	public static void main(String[] args) 
	{

		int n1, n2, n3;
		String s1,s2,s3;
		do {
			s1=JOptionPane.showInputDialog("Enter integer :");
			n1 = Integer.parseInt(s1);
			s2=JOptionPane.showInputDialog("Enter integer :");
			n2 = Integer.parseInt(s2);
			s3=JOptionPane.showInputDialog("Enter integer :");
			n3 = Integer.parseInt(s3);
			if (n1 <= 0 || n1 >= 100) {
				JOptionPane.showMessageDialog(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (n2 <= 0 || n2 >= 100) {
				JOptionPane.showMessageDialog(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (n3 <= 0 || n3 >= 100) {
				JOptionPane.showMessageDialog(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (n2 <= n1) {
				JOptionPane.showMessageDialog(null,"Number2 must more than Number1. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (n3 <= n2) {
				JOptionPane.showMessageDialog(null,"Number3 must more than Number2. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			}
		} while (n1 <= 0 || n1 >= 100 || n2 <= 0 || n2 >= 100 || n3 <= 0 || n3 >= 100 || n3 < n1 || n3 < n2 || n2 < n1
				|| n1 > n2 || n1 > n3);
		JOptionPane.showMessageDialog(null," Most played : " + total(n1,n2,n3) + " time.",null, JOptionPane.INFORMATION_MESSAGE);
	
	}
		public static int total(int n1,int n2,int n3)
		{
		return(((n3 - n2) - 1));
		}
	}