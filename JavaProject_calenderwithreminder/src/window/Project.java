package window;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Project extends JFrame {

	JTabbedPane pane = new JTabbedPane();

	public Project() {
		setTitle("Reminder");
		setSize(320, 280);
		setLocationRelativeTo(null);
		initComponents();
	}

	public void initComponents() {
		pane.add("Reminder", new Reminder());
		pane.add("Calculator", new Calcu());
		add(pane);
	}

}
