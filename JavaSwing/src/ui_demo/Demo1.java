package ui_demo;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Demo1 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Demo1 window = new Demo1();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Demo1() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();

	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
	gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
	gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
	frame.getContentPane().setLayout(gridBagLayout);

	JButton btnClear = new JButton("clear");
	GridBagConstraints gbc_btnClear = new GridBagConstraints();
	gbc_btnClear.insets = new Insets(0, 0, 5, 5);
	gbc_btnClear.gridx = 1;
	gbc_btnClear.gridy = 1;
	frame.getContentPane().add(btnClear, gbc_btnClear);

	JTextArea textArea = new JTextArea();
	GridBagConstraints gbc_textArea = new GridBagConstraints();
	gbc_textArea.insets = new Insets(0, 0, 5, 5);
	gbc_textArea.gridwidth = 13;
	gbc_textArea.fill = GridBagConstraints.BOTH;
	gbc_textArea.gridx = 1;
	gbc_textArea.gridy = 4;
	frame.getContentPane().add(textArea, gbc_textArea);

	frame.getContentPane().addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		textArea.setText("Button Clicked");
	    }
	});
    }

}
