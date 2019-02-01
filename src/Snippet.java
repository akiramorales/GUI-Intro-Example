import java.awt.Point;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Snippet {
	public static void main( String args[]) {
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300, 300, 500, 300);
		myFrame.setLayout(null);
		JLabel label1 = new JLabel("Our First Label");
		label1.setLocation(new Point(35, 50));
		myFrame.add(label1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
