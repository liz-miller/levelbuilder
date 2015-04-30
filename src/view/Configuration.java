package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import controller.BackToLevelType;
import controller.ContentController;
import controller.LevelTypeController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Configuration extends JFrame {

	private JPanel contentPane;
	private JTextField txtLevelNumber;
	public int frequency[] = new int[6];

	/**
	 * Create the frame.
	 * @return 
	 */
	public Configuration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtLevelNumber = new JTextField();
		txtLevelNumber.setBackground(Color.LIGHT_GRAY);
		txtLevelNumber.setBounds(9, 72, 104, 28);
		txtLevelNumber.setText("Level Number");
		txtLevelNumber.setColumns(10);
		
		final JTextField text_2 = new JTextField();
		text_2.setBackground(Color.LIGHT_GRAY);
		text_2.setBounds(195, 366, 26, 25);
		
		final JTextField text_1 = new JTextField();
		text_1.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				new ContentController().getNumber(text_1);
			}
		});
		
		text_1.setBackground(Color.LIGHT_GRAY);
		text_1.setBounds(195, 335, 26, 25);
		
		final JTextField text_3 = new JTextField();
		text_3.setBackground(Color.LIGHT_GRAY);
		text_3.setBounds(195, 397, 26, 25);
		text_3.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				ContentController cc = new ContentController();
				int num1 = cc.getNumber(text_1);
				ContentController.setFreq(1,num1);
			}
		});
		
		final JTextField text_4 = new JTextField();
		text_4.setBackground(Color.LIGHT_GRAY);
		text_4.setBounds(362, 335, 26, 25);
		
		final JTextField text_5 = new JTextField();
		text_5.setBackground(Color.LIGHT_GRAY);
		text_5.setBounds(362, 366, 26, 25);
		
		final JTextField text_6 = new JTextField();
		text_6.setBackground(Color.LIGHT_GRAY);
		text_6.setBounds(362, 397, 26, 25);
		
		final JLabel lbls = new JLabel("1's Frequency");
		lbls.setBounds(227, 335, 123, 16);
		
		JLabel lblEnterAmountOf = new JLabel("2's Frequency");
		lblEnterAmountOf.setBounds(227, 366, 123, 16);
		
		JLabel lblEnterAmountOf_1 = new JLabel("3's Frequency");
		lblEnterAmountOf_1.setBounds(227, 397, 123, 16);
		
		JLabel lblEnterAmountOf_3 = new JLabel("5's Frequency");
		lblEnterAmountOf_3.setBounds(394, 366, 123, 16);
		
		JLabel lblEnterAmountOf_2 = new JLabel("4's Frequency");
		lblEnterAmountOf_2.setBounds(394, 335, 123, 16);
		
		JLabel lblEnterAmountOf_4 = new JLabel("6's Frequency");
		lblEnterAmountOf_4.setBounds(394, 397, 123, 16);
		
		JTextField text_rowSquare = new JTextField();
		text_rowSquare.setBackground(Color.LIGHT_GRAY);
		text_rowSquare.setBounds(105, 160, 26, 25);
		
		JTextField text_colSquare = new JTextField();
		text_colSquare.setBackground(Color.LIGHT_GRAY);
		text_colSquare.setBounds(105, 204, 26, 25);
		
		JLabel lblRowNumber = new JLabel("row number");
		lblRowNumber.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblRowNumber.setBounds(6, 173, 87, 16);
		
		JLabel lblColNumber = new JLabel("col number");
		lblColNumber.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblColNumber.setBounds(6, 204, 87, 16);
		
		JButton btnActivate = new JButton("Activate");
		btnActivate.setBounds(36, 261, 95, 29);
		
		JButton btnDeactivate = new JButton("Deactivate");
		btnDeactivate.setBounds(36, 235, 95, 29);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(919, 5, 91, 29);
		contentPane.setLayout(null);
		contentPane.add(text_6);
		contentPane.add(lblEnterAmountOf_4);
		contentPane.add(text_4);
		contentPane.add(lblEnterAmountOf_2);
		contentPane.add(text_2);
		contentPane.add(lblEnterAmountOf);
		contentPane.add(text_1);
		contentPane.add(lbls);
		contentPane.add(text_3);
		contentPane.add(lblEnterAmountOf_1);
		contentPane.add(text_5);
		contentPane.add(lblEnterAmountOf_3);
		contentPane.add(lblRowNumber);
		contentPane.add(text_rowSquare);
		contentPane.add(lblColNumber);
		contentPane.add(text_colSquare);
		contentPane.add(btnActivate);
		contentPane.add(btnDeactivate);
		contentPane.add(txtLevelNumber);
		contentPane.add(btnPreview);
		
		JButton button = new JButton("Save");
		button.setBounds(226, 73, 75, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Load");
		button_1.setBounds(143, 73, 71, 29);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("Generate Level");
		
		button_3.setBounds(460, 5, 135, 29);
		contentPane.add(button_3);
		
		JLabel lblSquarePlacement = new JLabel("Square Activation");
		lblSquarePlacement.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSquarePlacement.setBounds(50, 132, 123, 16);
		contentPane.add(lblSquarePlacement);
		
		JLabel lblPlaces = new JLabel("Place 6's");
		lblPlaces.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPlaces.setBounds(203, 132, 61, 16);
		contentPane.add(lblPlaces);
		
		JTextField row_6s = new JTextField();
		row_6s.setBackground(Color.LIGHT_GRAY);
		row_6s.setBounds(213, 160, 26, 25);
		contentPane.add(row_6s);
		
		JTextField col_6s = new JTextField();
		col_6s.setBackground(Color.LIGHT_GRAY);
		col_6s.setBounds(213, 204, 26, 25);
		contentPane.add(col_6s);
		
		JButton btnSets = new JButton("Set 6's");
		btnSets.setBounds(183, 241, 95, 29);
		contentPane.add(btnSets);
		
		JTextField freq_3 = new JTextField();
		freq_3.setBackground(Color.LIGHT_GRAY);
		freq_3.setBounds(11, 397, 26, 25);
		contentPane.add(freq_3);
		
		JTextField freq_2 = new JTextField();
		freq_2.setBackground(Color.LIGHT_GRAY);
		freq_2.setBounds(11, 366, 26, 25);
		contentPane.add(freq_2);
		
		JTextField freq_1 = new JTextField();
		freq_1.setBackground(Color.LIGHT_GRAY);
		freq_1.setBounds(11, 335, 26, 25);
		contentPane.add(freq_1);
		
		JLabel lblXFrequency_2 = new JLabel("x3 Frequency");
		lblXFrequency_2.setBounds(43, 397, 123, 16);
		contentPane.add(lblXFrequency_2);
		
		JLabel lblXFrequency_1 = new JLabel("x2 Frequency");
		lblXFrequency_1.setBounds(43, 366, 123, 16);
		contentPane.add(lblXFrequency_1);
		
		JLabel lblXFrequency = new JLabel("x1 Frequency");
		lblXFrequency.setBounds(43, 335, 123, 16);
		contentPane.add(lblXFrequency);
		
		JLabel lblMultiplierConfiguration = new JLabel("Multiplier Configuration");
		lblMultiplierConfiguration.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblMultiplierConfiguration.setBounds(11, 302, 183, 16);
		contentPane.add(lblMultiplierConfiguration);
		
		JLabel lblTileConfiguration = new JLabel("Tile Configuration");
		lblTileConfiguration.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTileConfiguration.setBounds(284, 302, 183, 16);
		contentPane.add(lblTileConfiguration);
		
		JLabel lblPlaceBins = new JLabel("Place 6 Bins");
		lblPlaceBins.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPlaceBins.setBounds(288, 132, 95, 16);
		contentPane.add(lblPlaceBins);
		
		JTextField row_bin = new JTextField();
		row_bin.setBackground(Color.LIGHT_GRAY);
		row_bin.setBounds(318, 160, 26, 25);
		contentPane.add(row_bin);
		
		JTextField col_bin = new JTextField();
		col_bin.setBackground(Color.LIGHT_GRAY);
		col_bin.setBounds(318, 204, 26, 25);
		contentPane.add(col_bin);
		
		JButton btnSetBins = new JButton("Set Bins");
		btnSetBins.setBounds(288, 241, 95, 29);
		contentPane.add(btnSetBins);
		
		JButton btnPreview_1 = new JButton("Preview");
		btnPreview_1.setBounds(460, 37, 137, 29);
		contentPane.add(btnPreview_1);
		
		JLabel lblWelcomeTos = new JLabel("Welcome to Sixes Wild Level Builder!");
		lblWelcomeTos.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblWelcomeTos.setBounds(29, 9, 359, 16);
		contentPane.add(lblWelcomeTos);
		
		JLabel lblPleaseConfigureThe = new JLabel("Please configure the following options.");
		lblPleaseConfigureThe.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblPleaseConfigureThe.setBounds(29, 32, 296, 16);
		contentPane.add(lblPleaseConfigureThe);
		
		JButton btnSetMultiplier = new JButton("Set Multiplier");
		btnSetMultiplier.setBounds(9, 434, 117, 29);
		contentPane.add(btnSetMultiplier);
		
		JButton btnSetTiles = new JButton("Set Tiles");
		btnSetTiles.setBounds(284, 434, 117, 29);
		contentPane.add(btnSetTiles);
		
		JTextField stars = new JTextField();
		stars.setBackground(Color.LIGHT_GRAY);
		stars.setBounds(441, 160, 26, 25);
		contentPane.add(stars);
		
		JTextField moves = new JTextField();
		moves.setBackground(Color.LIGHT_GRAY);
		moves.setBounds(441, 228, 26, 25);
		contentPane.add(moves);
		
		JLabel lblSetNumberOf = new JLabel("Set Number of Stars");
		lblSetNumberOf.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSetNumberOf.setBounds(441, 132, 154, 16);
		contentPane.add(lblSetNumberOf);
		
		JLabel lblSetNumberOf_1 = new JLabel("Set Number of Moves");
		lblSetNumberOf_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSetNumberOf_1.setBounds(441, 204, 154, 16);
		contentPane.add(lblSetNumberOf_1);
		
		JButton btnSetStars = new JButton("Set Stars");
		btnSetStars.setBounds(479, 155, 95, 29);
		contentPane.add(btnSetStars);
		
		JButton btnSetMoves = new JButton("Set Moves");
		btnSetMoves.setBounds(479, 223, 95, 29);
		contentPane.add(btnSetMoves);
		
		JButton btnBackToSelection = new JButton("Back to Menu");
		btnBackToSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BackToLevelType(Configuration.this).back(); 
			}
		});
		btnBackToSelection.setBackground(Color.PINK);
		btnBackToSelection.setBounds(461, 73, 134, 29);
		contentPane.add(btnBackToSelection);
		
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuration frame = new Configuration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
