package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;


/**
 * Creates the view for selecting a level type.
 * @author Liz Miller
 * 
 */
public class LevelType extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelType frame = new LevelType();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Initialize the frame contents.
	 * 
	 */
	public LevelType(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSelectTheLevel = new JLabel("Select the level you want to build.");
		
		JButton btnPuzzle = new JButton("Puzzle");
		
		JButton btnLightning = new JButton("Lightning");
		
		JButton btnElimination = new JButton("Elimination");
		
		JButton btnRelease = new JButton("Release");
		
		JLabel lblLevelBuilder = new JLabel("LEVEL BUILDER");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(155)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnRelease, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnElimination, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnLightning, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnPuzzle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(163)
							.addComponent(lblLevelBuilder))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(108)
							.addComponent(lblSelectTheLevel)))
					.addContainerGap(120, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(8)
					.addComponent(lblLevelBuilder)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSelectTheLevel)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnPuzzle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLightning)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnElimination)
					.addGap(12)
					.addComponent(btnRelease)
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
