import javax.swing.JFrame;


public class Driver {

	public static void main(String[] args) {
		JFrame main = new JFrame();
		main.setContentPane(new Dashboard());
		main.pack();
		main.setVisible(true);
	}

}
