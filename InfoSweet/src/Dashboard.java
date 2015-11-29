import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JPanel {
	private JLabel folderNaame;
	private JButton browse, sort;
	private Utilities worker;
	Dashboard(){
		JPanel folder = new JPanel();
//		setPreferredSize(new Dimension(500, 500));
		//setLayout(new GridLayout(0,2));
		folderNaame = new JLabel("Main storage folder");
		folder.add(folderNaame);
		browse = new JButton("Browse");
		browse.addActionListener(new actions());
		folder.add(browse);
		
		JPanel function = new JPanel();
		sort = new JButton("Sort all files on computer");
		sort.addActionListener(new actions());
		sort.setEnabled(false);
		function.add(sort);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(folder);
		add(function);
	}
	
	private void Open(){
		String path;
		JFileChooser files = new JFileChooser();
		files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		files.setDialogTitle("Select the Info Sweet folder or create a new one");
		if(files.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
			sort.setEnabled(true);
			path = files.getSelectedFile().getAbsolutePath(); 
			folderNaame.setText("Main storage folder: " + path);
			worker = new Utilities(path);
		}
	}
	
	private class actions implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == browse){
				Open();
			}else if(e.getSource() == sort){
				String home = System.getProperty("user.home");
				worker.sortFiles(home);
			}
		}
		
	}
}
