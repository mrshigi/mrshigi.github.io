package lab09;
//Sean Raudat for CSCE 145 lab09
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradeCalculator {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JTextField textField_18;
	private JLabel lblNewLabel_18;
	private JButton btnNewButton;
	private JLabel lblNewLabel_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeCalculator window = new GradeCalculator();
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
	public GradeCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 408, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("HW00");
		panel_3.add(lblNewLabel_2);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_3 = new JLabel("HW01");
		panel_2.add(lblNewLabel_3);
		
		panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		
		textField_4 = new JTextField();
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_4 = new JLabel("HW02");
		panel_4.add(lblNewLabel_4);
		
		panel_5 = new JPanel();
		frame.getContentPane().add(panel_5);
		
		textField_5 = new JTextField();
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_5 = new JLabel("HW03");
		panel_5.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("HW04");
		panel.add(lblNewLabel);
		
		panel_14 = new JPanel();
		frame.getContentPane().add(panel_14);
		
		textField_6 = new JTextField();
		panel_14.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Lab00");
		panel_14.add(lblNewLabel_6);
		
		panel_13 = new JPanel();
		frame.getContentPane().add(panel_13);
		
		textField_7 = new JTextField();
		panel_13.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Lab01");
		panel_13.add(lblNewLabel_7);
		
		panel_12 = new JPanel();
		frame.getContentPane().add(panel_12);
		
		textField_8 = new JTextField();
		panel_12.add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Lab02");
		panel_12.add(lblNewLabel_9);
		
		panel_10 = new JPanel();
		frame.getContentPane().add(panel_10);
		
		textField_9 = new JTextField();
		panel_10.add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Lab03");
		panel_10.add(lblNewLabel_10);
		
		panel_11 = new JPanel();
		frame.getContentPane().add(panel_11);
		
		textField_10 = new JTextField();
		panel_11.add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Lab04");
		panel_11.add(lblNewLabel_8);
		
		panel_9 = new JPanel();
		frame.getContentPane().add(panel_9);
		
		textField_11 = new JTextField();
		panel_9.add(textField_11);
		textField_11.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Lab05");
		panel_9.add(lblNewLabel_11);
		
		panel_8 = new JPanel();
		frame.getContentPane().add(panel_8);
		
		textField_12 = new JTextField();
		panel_8.add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Lab06");
		panel_8.add(lblNewLabel_12);
		
		panel_7 = new JPanel();
		frame.getContentPane().add(panel_7);
		
		textField_13 = new JTextField();
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		lblNewLabel_13 = new JLabel("Lab07");
		panel_7.add(lblNewLabel_13);
		
		panel_6 = new JPanel();
		frame.getContentPane().add(panel_6);
		
		textField_14 = new JTextField();
		panel_6.add(textField_14);
		textField_14.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Lab08");
		panel_6.add(lblNewLabel_14);
		
		panel_15 = new JPanel();
		frame.getContentPane().add(panel_15);
		
		textField_15 = new JTextField();
		panel_15.add(textField_15);
		textField_15.setColumns(10);
		
		lblNewLabel_15 = new JLabel("Lab09");
		panel_15.add(lblNewLabel_15);
		
		panel_16 = new JPanel();
		frame.getContentPane().add(panel_16);
		
		textField_16 = new JTextField();
		panel_16.add(textField_16);
		textField_16.setColumns(10);
		
		lblNewLabel_16 = new JLabel("Lab10");
		panel_16.add(lblNewLabel_16);
		
		panel_17 = new JPanel();
		frame.getContentPane().add(panel_17);
		
		textField_17 = new JTextField();
		panel_17.add(textField_17);
		textField_17.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Lab11");
		panel_17.add(lblNewLabel_17);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Lab12");
		panel_1.add(lblNewLabel_1);
		
		panel_18 = new JPanel();
		frame.getContentPane().add(panel_18);
		
		textField_18 = new JTextField();
		panel_18.add(textField_18);
		textField_18.setColumns(10);
		
		lblNewLabel_18 = new JLabel("Extra Credit");
		panel_18.add(lblNewLabel_18);
		
		panel_19 = new JPanel();
		frame.getContentPane().add(panel_19);
		
		JTextField[] tfs = {textField, textField_1, textField_2, textField_3, textField_4, 
				textField_5, textField_6, textField_7, textField_8, textField_9, textField_10, 
				textField_11, textField_12, textField_13, textField_14, 
				textField_15, textField_16, textField_17,textField_18};
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sum =0;
					for(JTextField tf : tfs) {
						sum+= Double.parseDouble(tf.getText());
					}
					lblNewLabel_19.setText("Calculated avg; "+ ((sum/2200)*100)+"%");
				}catch(Exception e1) {
					lblNewLabel_19.setText(e1.toString()+e1.getMessage());
					
				}
			}
		});
		
		lblNewLabel_19 = new JLabel("<avg>");
		panel_19.add(lblNewLabel_19);
		panel_19.add(btnNewButton);
	}

}
