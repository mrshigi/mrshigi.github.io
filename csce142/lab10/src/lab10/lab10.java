package lab10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class lab10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab10 window = new lab10();
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
	public lab10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea textArea = new JTextArea();
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("btn");
		frame.getContentPane().add(btnNewButton);
	    ArrayList<Double> cards = new ArrayList<Double>();
	   try {
            FileInputStream fis = new FileInputStream("questions.txt");
            Scanner fin = new Scanner(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String Line;

            while((Line = br.readLine())!= null) cards.add(Double.parseDouble(Line));

        } catch(FileNotFoundException fne) {
			textArea.setText("question.txt file Not Found");}
        
        catch(Exception e){
            System.out.println(e);
        }
	}

}
