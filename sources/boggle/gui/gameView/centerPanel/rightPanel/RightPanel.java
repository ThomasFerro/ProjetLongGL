package boggle.gui.gameView.centerPanel.rightPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RightPanel extends JPanel {
	
	private WordPanel wordPanel;
	private JPanel panelSubmit;
	
	public RightPanel() {
		wordPanel = new WordPanel();
		panelSubmit = new JPanel();
		
		panelSubmit.setLayout(new GridLayout(1,3));

		panelSubmit.add(new JLabel(""));
		panelSubmit.add(new JButton("Submit"));
		panelSubmit.add(new JLabel(""));
		this.setLayout(new BorderLayout());
		this.add(wordPanel, BorderLayout.CENTER);
		this.add(panelSubmit, BorderLayout.SOUTH);
		this.setPreferredSize(new Dimension(250,300));
	}
}