import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Dashboard extends JPanel {
	private JLabel folderNaame;
	private JButton browse, sort;
	Dashboard(){
		JPanel folder = new JPanel();
		setPreferredSize(new Dimension(500, 500));
		//setLayout(new GridLayout(0,2));
		folderNaame = new JLabel("Main storage folder");
		folder.add(folderNaame);
		browse = new JButton("Browse");
		browse.addActionListener(new actions());
		folder.add(browse);
		
		JPanel function = new JPanel();
		sort = new JButton("Sort all files on computer");
		function.add(sort);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(folder);
		add(function);
	}
	
	private class actions implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == browse){
				
			}
		}
		
	}
}
