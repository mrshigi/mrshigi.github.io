package hw03;
import java.util.ArrayList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
public class bmicalc {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmicalc window = new bmicalc();
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
	public bmicalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JPanel name = new JPanel();
		frame.getContentPane().add(name);
		JLabel lblNewLabel = new JLabel("Name:");
		name.add(lblNewLabel);
		JTextField name1 = new JTextField();
		name.add(name1);
		name1.setColumns(10);
		JPanel weight2 = new JPanel();
		frame.getContentPane().add(weight2);
		JLabel lblNewLabel_1 = new JLabel("Weight");
		weight2.add(lblNewLabel_1);
		JTextField weight1 = new JTextField();
		weight2.add(weight1);
		weight1.setColumns(10);
		JPanel height2 = new JPanel();
		frame.getContentPane().add(height2);
		JLabel lblNewLabel_2 = new JLabel("Height");
		height2.add(lblNewLabel_2);
		JTextField height1 = new JTextField();
		height2.add(height1);
		height1.setColumns(10);
		JPanel age2 = new JPanel();
		frame.getContentPane().add(age2);
		JLabel lblNewLabel_3 = new JLabel("Age:");
		age2.add(lblNewLabel_3);
		JTextField age1 = new JTextField();
		age2.add(age1);
		age1.setColumns(10);
		JTextArea textArea = new JTextArea();
		JPanel PoundInch = new JPanel();
		frame.getContentPane().add(PoundInch);
		JToggleButton PoundInchButton = new JToggleButton("Use Pounds/Inches");
		PoundInch.add(PoundInchButton);
		PoundInchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        double ht = Double.parseDouble(height1.getText());
			        double wt = Double.parseDouble(weight1.getText());
						if(PoundInchButton.isSelected()) {
							wt = wt/2.2;
							ht = ht * 2.54;
						}
				}catch(Exception e1) {
					 textArea .setText(e1.toString()+e1.getMessage());
				}
			}
		});
		JToggleButton DoRec = new JToggleButton("Do Recommendations");
		frame.getContentPane().add(DoRec);
		JToggleButton tglbtnIsMale = new JToggleButton("Male?");
		frame.getContentPane().add(tglbtnIsMale);
		tglbtnIsMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						
				}catch(Exception e1) {
					 textArea .setText(e1.toString()+e1.getMessage());
				}
			}
		});
		JButton calculate = new JButton("Calculate");
		frame.getContentPane().add(calculate);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ht = Double.parseDouble(height1.getText());
				    double wt = Double.parseDouble(weight1.getText());
			        int age = Integer.parseInt(age1.getText());
			        if(PoundInchButton.isSelected()) {
						wt = wt/2.2;
						ht = ht * 2.54;
					}
			        double bmr = WeightLossApp.BMR(wt, ht, age, tglbtnIsMale.isSelected());
			        double dailyCaloricIntake = bmr;
					double bmi = wt/(ht*ht);
					textArea.setText(
							"\n BMI: "+ bmi*10000+
							"\n BMR: "+ dailyCaloricIntake);
					if(DoRec.isSelected()) {
						 textArea.setText(
								 "\n BMI: "+ bmi*10000+
									"\n BMR: "+ dailyCaloricIntake+
									"\nFor different Activity Levels, Calorie intake to maintain weight:"
							 		+ "\n1: "+ dailyCaloricIntake*1.2 + " calories"+
									 "\n2: "+ dailyCaloricIntake *1.375 +" calories"+
							 		"\n3: "+ dailyCaloricIntake *1.55 +" calories"+
									 "\n4: "+ dailyCaloricIntake *1.725 +" calories"+
							 		"\n5: "+ dailyCaloricIntake *1.9 +" calories"+
									 "\nEat 500 calories less a day to lose 1 pound(~0.5Kg) per week"+
							 		"\nEat 1000 calories less a day to lose 2 pounds(~0.9Kg) per week");
						
					}
				}catch(Exception e1) {
					textArea.setText("Error: The input weight, height and age should all be positive numbers");
				}
			}
		});
		DoRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ht = Double.parseDouble(height1.getText());
				    double wt = Double.parseDouble(weight1.getText());
			        int age = Integer.parseInt(age1.getText());
			        if(PoundInchButton.isSelected()) {
						wt = wt/2.2;
						ht = ht * 2.54;
					}
			       /* double bmr = WeightLossApp.BMR(wt, ht, age, tglbtnIsMale.isSelected());
					double dailyCaloricIntake = bmr;
					 textArea.setText("For different Activity Levels, Calorie intake to maintain weight:"
					 		+ "\n1: "+ dailyCaloricIntake*1.2 + " calories"+
							 "\n2: "+ dailyCaloricIntake *1.375 +" calories"+
					 		"\n3: "+ dailyCaloricIntake *1.55 +" calories"+
							 "\n4: "+ dailyCaloricIntake *1.725 +" calories"+
					 		"\n5: "+ dailyCaloricIntake *1.9 +" calories"+
							 "\nEat 500 calories less a day to lose 1 pound(~0.5Kg) per week"+
					 		"\nEat 1000 calories less a day to lose 2 pounds(~0.9Kg) per week");*/
				}catch(Exception e1) {
					 textArea .setText(e1.toString()+e1.getMessage());
				}
			}
		});
		textArea.setColumns(40);
		textArea.setRows(15);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
	}

}
