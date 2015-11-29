import javax.swing.JFrame;


public class Driver {

	public static void main(String[] args) {
		JFrame main = new JFrame();
		main.setContentPane(new Dashboard());
		main.pack();
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
	}

}
