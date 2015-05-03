package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import model.*;
import controller.BackToLevelType;
import controller.ContentController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

import javax.swing.JRadioButton;

/**
 * 
 */
public class Configuration extends JFrame {
	private JPanel contentPane;
	
	Level level;
	JTextField moves;
	
	/**
	 * Construct the Configuration view.
	 * @return 
	 */
	public Configuration(Level level) {
		this.level = level;
		initialize();
	}
	
	/**
	 * Initialize the Configuration view.
	 */
	public void initialize(){
		String defaultFreq = "20";
		String defaultStars = "500";
		String defaultMoves = "50";
		String defaultLevel = "1";
		String defaultRow = "0";  
		String defaultCol = "0";
		String defaultMult1 = "10";
		String defaultMult2 = "5";
		String defaultMult3 = "2";
		String defaultDiff = "1";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final JTextField text_1 = new JTextField();
		text_1.setBackground(Color.LIGHT_GRAY);
		text_1.setBounds(241, 345, 37, 25);
		text_1.setText(defaultFreq);
		
		final JTextField text_2 = new JTextField();
		text_2.setBackground(Color.LIGHT_GRAY);
		text_2.setBounds(241, 376, 37, 25);
		text_2.setText(defaultFreq);
				
		final JTextField text_3 = new JTextField();
		text_3.setBackground(Color.LIGHT_GRAY);
		text_3.setBounds(241, 407, 37, 25);
		text_3.setText(defaultFreq);
		
		final JTextField text_4 = new JTextField();
		text_4.setBackground(Color.LIGHT_GRAY);
		text_4.setBounds(408, 345, 37, 25);
		text_4.setText(defaultFreq);
		
		final JTextField text_5 = new JTextField();
		text_5.setBackground(Color.LIGHT_GRAY);
		text_5.setBounds(408, 376, 37, 25);
		text_5.setText(defaultFreq);
		
		final JTextField text_6 = new JTextField();
		text_6.setBackground(Color.LIGHT_GRAY);
		text_6.setBounds(408, 407, 37, 25);
		text_6.setText(defaultFreq);
		
		final JLabel lbls = new JLabel("1's Frequency");
		lbls.setBounds(284, 345, 123, 16);
		
		JLabel lblEnterAmountOf = new JLabel("2's Frequency");
		lblEnterAmountOf.setBounds(284, 376, 123, 16);
		
		JLabel lblEnterAmountOf_1 = new JLabel("3's Frequency");
		lblEnterAmountOf_1.setBounds(284, 407, 123, 16);
		
		JLabel lblEnterAmountOf_3 = new JLabel("5's Frequency");
		lblEnterAmountOf_3.setBounds(451, 376, 123, 16);
		
		JLabel lblEnterAmountOf_2 = new JLabel("4's Frequency");
		lblEnterAmountOf_2.setBounds(451, 345, 123, 16);
		
		JLabel lblEnterAmountOf_4 = new JLabel("6's Frequency");
		lblEnterAmountOf_4.setBounds(451, 407, 123, 16);
		
		final JTextField text_rowSquare = new JTextField();
		text_rowSquare.setBackground(Color.LIGHT_GRAY);
		text_rowSquare.setBounds(105, 160, 37, 25);
		text_rowSquare.setText(defaultRow);
		
		final JTextField text_colSquare = new JTextField();
		text_colSquare.setBackground(Color.LIGHT_GRAY);
		text_colSquare.setBounds(105, 204, 37, 25);
		text_colSquare.setText(defaultCol);
		
		JLabel lblRowNumber = new JLabel("row number");
		lblRowNumber.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblRowNumber.setBounds(6, 173, 87, 16);
		
		JLabel lblColNumber = new JLabel("col number");
		lblColNumber.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblColNumber.setBounds(6, 204, 87, 16);
		
		JButton btnActivate = new JButton("Activate");
		btnActivate.setBounds(36, 261, 95, 29);
		btnActivate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).activate(text_rowSquare, text_colSquare);
			}
		});
		
		JButton btnDeactivate = new JButton("Deactivate");
		btnDeactivate.setBounds(36, 235, 95, 29);
		btnDeactivate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).deactivate(text_rowSquare, text_colSquare);
			}
		});
		
		
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
		contentPane.add(btnPreview);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(378, 37, 75, 29);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(378, 5, 71, 29);
		contentPane.add(btnLoad);
		
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
		row_6s.setBounds(213, 160, 37, 25);
		contentPane.add(row_6s);
		row_6s.setText(defaultRow);
		
		JTextField col_6s = new JTextField();
		col_6s.setBackground(Color.LIGHT_GRAY);
		col_6s.setBounds(213, 204, 37, 25);
		contentPane.add(col_6s);
		col_6s.setText(defaultCol);
		
		JButton btnSets = new JButton("Set 6's");
		btnSets.setBounds(183, 241, 95, 29);
		contentPane.add(btnSets);
		
		JTextField freq_3 = new JTextField();
		freq_3.setBackground(Color.LIGHT_GRAY);
		freq_3.setBounds(50, 407, 37, 25);
		contentPane.add(freq_3);
		freq_3.setText(defaultMult3);
		
		JTextField freq_2 = new JTextField();
		freq_2.setBackground(Color.LIGHT_GRAY);
		freq_2.setBounds(50, 376, 37, 25);
		contentPane.add(freq_2);
		freq_2.setText(defaultMult2);
		
		JTextField freq_1 = new JTextField();
		freq_1.setBackground(Color.LIGHT_GRAY);
		freq_1.setBounds(50, 345, 37, 25);
		contentPane.add(freq_1);
		freq_1.setText(defaultMult1);
		
		JLabel lblXFrequency_2 = new JLabel("x3 Frequency");
		lblXFrequency_2.setBounds(93, 407, 123, 16);
		contentPane.add(lblXFrequency_2);
		
		JLabel lblXFrequency_1 = new JLabel("x2 Frequency");
		lblXFrequency_1.setBounds(93, 376, 123, 16);
		contentPane.add(lblXFrequency_1);
		
		JLabel lblXFrequency = new JLabel("x1 Frequency");
		lblXFrequency.setBounds(93, 345, 123, 16);
		contentPane.add(lblXFrequency);
		
		JLabel lblMultiplierConfiguration = new JLabel("Multiplier Configuration");
		lblMultiplierConfiguration.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblMultiplierConfiguration.setBounds(29, 312, 183, 16);
		contentPane.add(lblMultiplierConfiguration);
		
		JLabel lblTileConfiguration = new JLabel("Tile Configuration");
		lblTileConfiguration.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTileConfiguration.setBounds(341, 312, 183, 16);
		contentPane.add(lblTileConfiguration);
		
		JLabel lblPlaceBins = new JLabel("Place 6 Bins");
		lblPlaceBins.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPlaceBins.setBounds(288, 132, 95, 16);
		contentPane.add(lblPlaceBins);
		
		JTextField row_bin = new JTextField();
		row_bin.setBackground(Color.LIGHT_GRAY);
		row_bin.setBounds(318, 160, 37, 25);
		contentPane.add(row_bin);
		row_bin.setText(defaultRow);
		
		JTextField col_bin = new JTextField();
		col_bin.setBackground(Color.LIGHT_GRAY);
		col_bin.setBounds(318, 204, 37, 25);
		contentPane.add(col_bin);
		col_bin.setText(defaultCol);
		
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
		btnSetMultiplier.setBounds(66, 444, 117, 29);
		contentPane.add(btnSetMultiplier);
		
		JButton btnSetTiles = new JButton("Set Tiles");
		btnSetTiles.setBounds(341, 444, 117, 29);
		contentPane.add(btnSetTiles);
		btnSetTiles.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).setTilePercents(text_1, text_2, text_3, text_4, text_5, text_6);
			}
		});
		
		final JTextField starsField = new JTextField();
		starsField.setBackground(Color.LIGHT_GRAY);
		starsField.setBounds(429, 142, 37, 25);
		contentPane.add(starsField);
		starsField.setText(defaultStars);
		
	    final JTextField moves = new JTextField();
		moves.setBackground(Color.LIGHT_GRAY);
		moves.setBounds(429, 204, 37, 25);
		contentPane.add(moves);
		moves.setText(defaultMoves);
		
		JLabel lblSetNumberOf = new JLabel("Set Number of Stars");
		lblSetNumberOf.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSetNumberOf.setBounds(440, 114, 154, 16);
		contentPane.add(lblSetNumberOf);
		
		JLabel lblSetNumberOf_1 = new JLabel("Set Number of Moves");
		lblSetNumberOf_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSetNumberOf_1.setBounds(440, 180, 154, 16);
		contentPane.add(lblSetNumberOf_1);
		
		JButton btnSetStars = new JButton("Set Stars");
		btnSetStars.setBounds(478, 137, 95, 29);
		contentPane.add(btnSetStars);
		btnSetStars.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).setStars(starsField);
			}
		});
		
		JButton btnSetMoves = new JButton("Set Moves");
		btnSetMoves.setBounds(478, 199, 95, 29);
		contentPane.add(btnSetMoves);
		btnSetMoves.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).setMoves(moves);
			}
		});
		
		JButton btnBackToSelection = new JButton("Back to Menu");
		btnBackToSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BackToLevelType(Configuration.this).back(); 
			}
		});
		
		
		btnBackToSelection.setBackground(new Color(255, 175, 175));
		btnBackToSelection.setBounds(461, 73, 134, 29);
		contentPane.add(btnBackToSelection);
		
		final JTextField levelNum = new JTextField();
		levelNum.setBackground(Color.LIGHT_GRAY);
		levelNum.setBounds(157, 73, 37, 25);
		contentPane.add(levelNum);
		levelNum.setText(defaultLevel);
		
		
		// LEVEL NUMBER
		JLabel lblLevelNumber = new JLabel("Level Number");
		lblLevelNumber.setBounds(55, 78, 87, 16);
		contentPane.add(lblLevelNumber);
		
		JButton btnSetLevelNumber = new JButton("Set Level Number");
		btnSetLevelNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).setLevel(levelNum);
			}
		});
		btnSetLevelNumber.setBounds(203, 73, 144, 29);
		contentPane.add(btnSetLevelNumber);
		
		JLabel lblChooseTheLevel = new JLabel("Choose the Level Type");
		lblChooseTheLevel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblChooseTheLevel.setBounds(241, 501, 183, 16);
		contentPane.add(lblChooseTheLevel);
		
		
		// CHOOSE LEVEL
		JRadioButton rdbtnPuzzle = new JRadioButton("Puzzle");
		rdbtnPuzzle.setBounds(29, 529, 141, 23);
		contentPane.add(rdbtnPuzzle);
		
		JRadioButton rdbtnLightning = new JRadioButton("Lightning");
		rdbtnLightning.setBounds(154, 529, 141, 23);
		contentPane.add(rdbtnLightning);
		
		JRadioButton rdbtnElimination = new JRadioButton("Elimination");
		rdbtnElimination.setBounds(318, 529, 141, 23);
		contentPane.add(rdbtnElimination);
		
		JRadioButton rdbtnRelease = new JRadioButton("Release");
		rdbtnRelease.setBounds(479, 529, 141, 23);
		contentPane.add(rdbtnRelease);
		
		// Group Radio Buttons (only allow one to be selected at a time)
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnPuzzle);
        group.add(rdbtnLightning);
        group.add(rdbtnElimination);
        group.add(rdbtnRelease);
        
        JLabel lblSetDifficulty = new JLabel("Set Difficulty");
        lblSetDifficulty.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblSetDifficulty.setBounds(471, 238, 103, 16);
        contentPane.add(lblSetDifficulty);
        
        final JTextField difficulty = new JTextField();
        difficulty.setBackground(Color.LIGHT_GRAY);
        difficulty.setBounds(429, 265, 37, 25);
        contentPane.add(difficulty);
        difficulty.setText(defaultDiff);
        
        JButton btnSetDifficulty = new JButton("Set Difficulty");
        btnSetDifficulty.setBounds(478, 261, 116, 29);
        contentPane.add(btnSetDifficulty);
		btnSetDifficulty.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).setDifficulty(difficulty);
			}
		});
        
      //add listeners
        rdbtnPuzzle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ContentController(Configuration.this).setLevelType(1);

            }
        });
     
        // change level type to Lightning
        rdbtnLightning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 new ContentController(Configuration.this).setLevelType(2);

            }
        });
        
     // change level type to Elimination
        rdbtnElimination.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 new ContentController(Configuration.this).setLevelType(3);

            }
        });
        
     // change level type to Release
        rdbtnRelease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 new ContentController(Configuration.this).setLevelType(4);

            }
        });
        
        
		JButton btnGenerate = new JButton("Generate Level");
		btnGenerate.setBounds(460, 5, 135, 29);
		contentPane.add(btnGenerate);
		btnGenerate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new ContentController(Configuration.this).generate(level, levelNum, moves, starsField, difficulty);
			}
		});

        
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuration frame = new Configuration(new Level());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});  
	}
}
