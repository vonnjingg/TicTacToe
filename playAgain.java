package Swing;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class playAgain {
	String turn;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btnPlayAgain;
	JLabel lblTurn;
	ImageIcon x = new ImageIcon("D:\\SWING PHOTOS\\X.png");
	ImageIcon o = new ImageIcon("D:\\SWING PHOTOS\\O.png");
	private JFrame frame;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playAgain window = new playAgain();
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
	public playAgain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 250, 446, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTurn = new JLabel("X's Turn");
		lblTurn.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblTurn.setBounds(72, 0, 270, 44);
		frame.getContentPane().add(lblTurn);
	
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			turn = lblTurn.getText();
			
			if (turn.equalsIgnoreCase("X's Turn")) {
				JLabel xlabel = new JLabel("X");
				xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
				xlabel.setBounds(90, 52, 89, 74);
				xlabel.setVisible(false);
				frame.getContentPane().add(xlabel);

			
				btn1.setVisible(false);
				xlabel.setVisible(true);
				btn1.setText("X");
				lblTurn.setText("O's Turn");
				
			}			
			else if (turn.equalsIgnoreCase("O's Turn")) {
				JLabel olabel = new JLabel("O");
				olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
				olabel.setBounds(90, 52, 89, 74);
				olabel.setVisible(false);
				frame.getContentPane().add(olabel);

			
				btn1.setVisible(false);
				olabel.setVisible(true);
				btn1.setText("O");
				lblTurn.setText("X's Turn");
			}
			
			winner();
			}
		});
		btn1.setBounds(67, 52, 89, 74);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(189, 52, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn2.setVisible(false);
					xlabel.setVisible(true);
					btn2.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(189, 52, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn2.setVisible(false);
					olabel.setVisible(true);
					btn2.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn2.setBounds(166, 52, 89, 74);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(288, 52, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn3.setVisible(false);
					xlabel.setVisible(true);
					btn3.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(288, 52, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn3.setVisible(false);
					olabel.setVisible(true);
					btn3.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn3.setBounds(265, 52, 89, 74);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(90, 137, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn4.setVisible(false);
					xlabel.setVisible(true);
					btn4.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(90, 137, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn4.setVisible(false);
					olabel.setVisible(true);
					btn4.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn4.setBounds(67, 137, 89, 74);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(189, 137, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn5.setVisible(false);
					xlabel.setVisible(true);
					btn5.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(189, 137, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn5.setVisible(false);
					olabel.setVisible(true);
					btn5.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn5.setBounds(166, 137, 89, 74);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(288, 137, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn6.setVisible(false);
					xlabel.setVisible(true);
					btn6.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(288, 137, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn6.setVisible(false);
					olabel.setVisible(true);
					btn6.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn6.setBounds(265, 137, 89, 74);
		frame.getContentPane().add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(90, 222, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn7.setVisible(false);
					xlabel.setVisible(true);
					btn7.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(90, 222, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn7.setVisible(false);
					olabel.setVisible(true);
					btn7.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn7.setBounds(67, 222, 89, 74);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(189, 222, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn8.setVisible(false);
					xlabel.setVisible(true);
					btn8.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(189, 222, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn8.setVisible(false);
					olabel.setVisible(true);
					btn8.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn8.setBounds(166, 222, 89, 74);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				turn = lblTurn.getText();
				
				if (turn.equalsIgnoreCase("X's Turn")) {
					JLabel xlabel = new JLabel("X");
					xlabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					xlabel.setBounds(288, 222, 89, 74);
					xlabel.setVisible(false);
					frame.getContentPane().add(xlabel);

				
					btn9.setVisible(false);
					xlabel.setVisible(true);
					btn9.setText("X");
					lblTurn.setText("O's Turn");
					
				}			
				else if (turn.equalsIgnoreCase("O's Turn")) {
					JLabel olabel = new JLabel("O");
					olabel.setFont(new Font("Arial Black", Font.BOLD, 50));
					olabel.setBounds(288, 222, 89, 74);
					olabel.setVisible(false);
					frame.getContentPane().add(olabel);

				
					btn9.setVisible(false);
					olabel.setVisible(true);
					btn9.setText("O");
					lblTurn.setText("X's Turn");
				}
				winner();
			}
		});
		btn9.setBounds(265, 222, 89, 74);
		frame.getContentPane().add(btn9);
		
		btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPlayAgain.setFont(new Font("Arial", Font.BOLD, 15));
		
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicTacToe playagain = new TicTacToe();
				playagain.setVisible(true);
				frame.dispose();
		}
		});
		btnPlayAgain.setBounds(294, 317, 126, 36);
		btnPlayAgain.setVisible(false);
		frame.getContentPane().add(btnPlayAgain);
		

		
	}
	public void winner() {
		
		//123
		if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//456
		else if(btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//789
		else if(btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//147
		else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//258
		else if(btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//369
		else if(btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//159
		else if(btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
			JOptionPane.showMessageDialog(null, "O is the Winner!");
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		
		//357
		else if(btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O")) {
			lblTurn.setText("O is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		else if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")) {
			JOptionPane.showMessageDialog(null, "X is the Winner!");
			lblTurn.setText("X is the Winner!");
			btnPlayAgain.setVisible(true);
		}
		boolean a = btn1.isVisible();
		boolean b = btn2.isVisible();
		boolean c = btn3.isVisible();
		boolean d = btn4.isVisible();
		boolean e = btn5.isVisible();
		boolean f = btn6.isVisible();
		boolean g = btn7.isVisible();
		boolean h = btn8.isVisible();
		boolean i = btn9.isVisible();
		boolean j = btnPlayAgain.isVisible();
		
		if(a == false && b == false && c == false && d == false && e == false && f == false && g == false 
		&& h == false && i == false && j == false) {
			JOptionPane.showMessageDialog(null, "Game is DRAW!");
			btnPlayAgain.setVisible(true);
			
		}		
		
	}
	public void setVisible(boolean a) {
		frame.setVisible(a);
	}
}
