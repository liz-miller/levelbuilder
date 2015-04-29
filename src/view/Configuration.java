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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Configuration extends JFrame {

	private JPanel contentPane;
	private JTextField txtLevelNumber;
	private static Master master;

	public Configuration(Master master){
		super();
		this.master = master;

		initalize();
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void initalize() {
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(195, 366, 26, 25);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(195, 335, 26, 25);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.LIGHT_GRAY);
		textArea_2.setBounds(195, 397, 26, 25);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.LIGHT_GRAY);
		textArea_3.setBounds(362, 335, 26, 25);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.LIGHT_GRAY);
		textArea_4.setBounds(362, 366, 26, 25);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(Color.LIGHT_GRAY);
		textArea_5.setBounds(362, 397, 26, 25);
		
		JLabel lbls = new JLabel("1's Frequency");
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
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.LIGHT_GRAY);
		textArea_6.setBounds(105, 160, 26, 25);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBackground(Color.LIGHT_GRAY);
		textArea_7.setBounds(105, 204, 26, 25);
		
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
		contentPane.add(textArea_5);
		contentPane.add(lblEnterAmountOf_4);
		contentPane.add(textArea_3);
		contentPane.add(lblEnterAmountOf_2);
		contentPane.add(textArea_1);
		contentPane.add(lblEnterAmountOf);
		contentPane.add(textArea);
		contentPane.add(lbls);
		contentPane.add(textArea_2);
		contentPane.add(lblEnterAmountOf_1);
		contentPane.add(textArea_4);
		contentPane.add(lblEnterAmountOf_3);
		contentPane.add(lblRowNumber);
		contentPane.add(textArea_6);
		contentPane.add(lblColNumber);
		contentPane.add(textArea_7);
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
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(441, 73, 135, 29);
		contentPane.add(button_3);
		
		JLabel lblSquarePlacement = new JLabel("Square Activation");
		lblSquarePlacement.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSquarePlacement.setBounds(50, 132, 123, 16);
		contentPane.add(lblSquarePlacement);
		
		JLabel lblPlaces = new JLabel("Place 6's");
		lblPlaces.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPlaces.setBounds(203, 132, 61, 16);
		contentPane.add(lblPlaces);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBackground(Color.LIGHT_GRAY);
		textArea_8.setBounds(213, 160, 26, 25);
		contentPane.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBackground(Color.LIGHT_GRAY);
		textArea_9.setBounds(213, 204, 26, 25);
		contentPane.add(textArea_9);
		
		JButton btnSets = new JButton("Set 6's");
		btnSets.setBounds(183, 241, 95, 29);
		contentPane.add(btnSets);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBackground(Color.LIGHT_GRAY);
		textArea_10.setBounds(11, 397, 26, 25);
		contentPane.add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setBackground(Color.LIGHT_GRAY);
		textArea_11.setBounds(11, 366, 26, 25);
		contentPane.add(textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setBackground(Color.LIGHT_GRAY);
		textArea_12.setBounds(11, 335, 26, 25);
		contentPane.add(textArea_12);
		
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
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setBackground(Color.LIGHT_GRAY);
		textArea_13.setBounds(318, 160, 26, 25);
		contentPane.add(textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setBackground(Color.LIGHT_GRAY);
		textArea_14.setBounds(318, 204, 26, 25);
		contentPane.add(textArea_14);
		
		JButton btnSetBins = new JButton("Set Bins");
		btnSetBins.setBounds(288, 241, 95, 29);
		contentPane.add(btnSetBins);
		
		JButton btnPreview_1 = new JButton("Preview");
		btnPreview_1.setBounds(439, 5, 137, 29);
		contentPane.add(btnPreview_1);
		
		JLabel lblWelcomeTos = new JLabel("Welcome to 6's Wild Level Builder!");
		lblWelcomeTos.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblWelcomeTos.setBounds(29, 9, 290, 16);
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
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setBackground(Color.LIGHT_GRAY);
		textArea_15.setBounds(441, 160, 26, 25);
		contentPane.add(textArea_15);
		
		JTextArea textArea_16 = new JTextArea();
		textArea_16.setBackground(Color.LIGHT_GRAY);
		textArea_16.setBounds(441, 228, 26, 25);
		contentPane.add(textArea_16);
		
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
	}
}
