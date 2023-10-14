package hw04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import javazoom.jl.player.Player;

public class MusicPlayer implements ActionListener {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayer mp = new MusicPlayer();
					mp.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		//Creating Label for printing the selected song name
	    JLabel songName;

	    //Creating button for selecting a song
	    JButton select;

	    //Creating Panels
	    JPanel playerPanel, controlPanel;

	  

	    //Creating buttons
	    JButton play, pause, resume, stop;

	    JFileChooser fileChooser;
	    FileInputStream fileInputStream;
	    BufferedInputStream bufferedInputStream;
	    File myFile = null;
	    String filename, filePath;
	    long totalLength, pauseLength;
	    Player player;
	    Thread playThread, resumeThread;

	    public void addActionEvents() {
	        //registering action listener to buttons
	        select.addActionListener(this);
	        play.addActionListener(this);
	        pause.addActionListener(this);
	        resume.addActionListener(this);
	        stop.addActionListener(this);
	    }
	
	public MusicPlayer()  {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     
		        songName = new JLabel(" ", SwingConstants.CENTER);

		        select = new JButton("Select Mp3");

		        playerPanel = new JPanel();
		        controlPanel = new JPanel();


		        play = new JButton();
		        play.setIcon(null);
		        play.setText("Play");
		        pause = new JButton();
		        pause.setIcon(null);
		        pause.setText("Pause");
		        resume = new JButton();
		        resume.setIcon(null);
		        resume.setHorizontalAlignment(SwingConstants.LEFT);
		        resume.setText("Resume/start");
		        stop = new JButton();
		        stop.setIcon(null);
		        stop.setText("Stop");

		        playerPanel.setLayout(new GridLayout(2, 1));
		    
		        playerPanel.add(select);
		        playerPanel.add(songName);

		        controlPanel.setLayout(new GridLayout(1, 4));

		        controlPanel.add(play);
		        controlPanel.add(pause);
		        controlPanel.add(resume);
		        controlPanel.add(stop);

		      
		        play.setBackground(Color.WHITE);
		        pause.setBackground(Color.WHITE);
		        resume.setBackground(Color.WHITE);
		        stop.setBackground(Color.WHITE);

		        frame.setTitle("Yeat Music player");

		        //Adding panels in Frame
		        frame.getContentPane().add(playerPanel, BorderLayout.NORTH);
		        frame.getContentPane().add(controlPanel, BorderLayout.SOUTH);

		        //Setting Frame background color
		        frame.setBackground(Color.white);
		        frame.setSize(400, 200);
		        frame.setVisible(true);
		        frame.setResizable(false);
		        select.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (e.getSource().equals(select)) {
		            fileChooser = new JFileChooser();
		            fileChooser.setCurrentDirectory(new File("C:\\Users\\craud\\eclipse-workspace\\hw04\\src"));
		            fileChooser.setDialogTitle("Select Mp3");
		            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		            fileChooser.setFileFilter(new FileNameExtensionFilter(".mp3"));
		            if (fileChooser.showOpenDialog(select) == JFileChooser.APPROVE_OPTION) {
		                myFile = fileChooser.getSelectedFile();
		                
		                filename = fileChooser.getSelectedFile().getName();
		                filePath = fileChooser.getSelectedFile().getPath();
		                songName.setText("File Selected : " + filename);
		            }
		        }
		        if (e.getSource().equals(play)) {
		            if (filename != null) {
		                playThread.start();
		                songName.setText("Now playing : " + filename);
		            } else {
		                songName.setText("No File was selected!");
		            }
		        }
		        if (e.getSource().equals(pause)) {
		            if (player != null && filename != null) {
		                try {
		                    pauseLength = fileInputStream.available();
		                    player.close();
		                } catch (IOException e1) {
		                    e1.printStackTrace();
		                }
		            }
		        }

		        if (e.getSource().equals(resume)) {
		            if (filename != null) {
		                resumeThread.start();
		            } else {
		                songName.setText("No File was selected!");
		            }
		        }
		        if (e.getSource().equals(stop)) {
		            if (player != null) {
		                player.close();
		                songName.setText("");
		            }

		        }

		    

		    Runnable runnablePlay = new Runnable() {
		        @Override
		        public void run() {
		            try {
		                fileInputStream = new FileInputStream(myFile);
		                bufferedInputStream = new BufferedInputStream(fileInputStream);
		                player = new Player(bufferedInputStream);
		                totalLength = fileInputStream.available();
		                player.play();//starting music
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    };

		    Runnable runnableResume = new Runnable() {
		        @Override
		        public void run() {
		            try {
		                fileInputStream = new FileInputStream(myFile);
		                bufferedInputStream = new BufferedInputStream(fileInputStream);
		                player = new Player(bufferedInputStream);
		                fileInputStream.skip(totalLength - pauseLength);
		                player.play();
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    };
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }	
		    });
		        }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}

