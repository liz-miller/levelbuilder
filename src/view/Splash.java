package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Splash screen for the Level Builder.
 * @author Liz Miller
 *
 */
public class Splash extends JFrame {

	private JPanel contentPane;


	/**
	 * Initialize the frame.
	 * 
	 */
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSixesWildLevel = new JLabel("Sixes Wild Level Builder");
		lblSixesWildLevel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblSixesWildLevel.setBounds(136, 22, 203, 16);
		contentPane.add(lblSixesWildLevel);
		
		JLabel lblLizMiller = new JLabel("Liz Miller");
		lblLizMiller.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblLizMiller.setBounds(193, 102, 61, 16);
		contentPane.add(lblLizMiller);
		
		JLabel lblMay = new JLabel("May 2015");
		lblMay.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblMay.setBounds(193, 136, 61, 16);
		contentPane.add(lblMay);
		
		JLabel lblMadeForCs = new JLabel("Made for CS 3733");
		lblMadeForCs.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblMadeForCs.setBounds(184, 256, 70, 16);
		contentPane.add(lblMadeForCs);
		
		JButton btnEnterBuilder = new JButton("Enter Builder");
		btnEnterBuilder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create a new LevelType and initialize it.
				LevelType l= new LevelType();
				repaint();
			}
		});
		
		btnEnterBuilder.setBounds(327, 243, 117, 29);
		contentPane.add(btnEnterBuilder);
				
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
}
