package day20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AverageApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblAvgAllOut;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AverageApp window = new AverageApp();
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
	public AverageApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JTable table = new JTable();
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Numbers:");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		

		
		JLabel lblAvgOut = new JLabel("<average>");
		panel_1.add(lblAvgOut);
		
		JTextField[] tfs = {textField, textField_1, textField_2};
		
		JButton btnNewButton = new JButton("Average");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					double sum = 0;
					for(JTextField tf : tfs) {
						sum += Double.parseDouble(tf.getText());
					}
					lblAvgOut.setText("Average: "+sum/3);
				}catch(Exception e1) {
					lblAvgOut.setText(e1.toString()+e1.getMessage());
				}
			}
		});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JLabel lblMinOut = new JLabel("<min>");
		panel_2.add(lblMinOut);
		
		JButton btnNewButton_1 = new JButton("Min");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double min = Double.parseDouble(textField.getText());
					for(JTextField tf : tfs) {
						double v = Double.parseDouble(tf.getText());
						if (v<min) min = v;
					}
					lblMinOut.setText(""+min);
				}catch(Exception e1) {
					lblMinOut.setText(e1.toString()+e1.getMessage());
				}
			}
		});
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(20);
		textArea.setColumns(8);
		textArea.setText("");
		panel_3.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Average List");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String taInput = textArea.getText();
				String[] stringNums = taInput.split("\\s");
				ArrayList<Double> nums = new ArrayList<Double>();
				for(String sNum : stringNums) {
					try {
						double d = Double.parseDouble(sNum);
						nums.add(d);
					} catch(Exception e1) {
						
					}
				}
				double sum = 0.0;
				for(double d : nums) {
					sum+=d;
				}
				if(nums.size()>0) {
					lblAvgAllOut.setText("Average = " + sum/nums.size());
				} else {
					lblAvgAllOut.setText("Please enter numbers");
				}
				
			}
		});
		panel_3.add(btnNewButton_2);
		
		lblAvgAllOut = new JLabel("<enter some numbers>");
		panel_3.add(lblAvgAllOut);
	}

}