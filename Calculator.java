package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstNum;
	double secondNum; 
	double result;
	String operations; 
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 274, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(6, 6, 262, 50);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn0.setBounds(6, 352, 64, 63);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn1.setBounds(6, 279, 64, 63);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn2.setBounds(70, 279, 64, 63);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn3.setBounds(135, 279, 64, 63);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn4.setBounds(6, 206, 64, 63);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn5.setBounds(70, 206, 64, 63);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn6.setBounds(135, 206, 64, 63);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(enterNumber);
				}
			});
		btn7.setBounds(6, 133, 64, 63);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(enterNumber);
				}
			});
		btn8.setBounds(70, 133, 64, 63);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn9.setBounds(135, 133, 64, 63);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btn9);
		
		JButton btnBACKSPACE = new JButton("<");
		btnBACKSPACE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null; 
				
				if(txtDisplay.getText().length() >0 ) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() -1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBACKSPACE.setBounds(6, 60, 64, 63);
		btnBACKSPACE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnBACKSPACE);
		
		JButton btnCLEAR = new JButton("C");
		btnCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnCLEAR.setBounds(70, 60, 64, 63);
		btnCLEAR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnCLEAR);
		
		JButton btnPERCENT = new JButton("%");
		btnPERCENT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPERCENT.setBounds(135, 60, 64, 63);
		btnPERCENT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnPERCENT);
		
		JButton btnPLUS = new JButton("+");
		btnPLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPLUS.setBounds(201, 60, 64, 63);
		btnPLUS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnPLUS);
		
		JButton btnMINUS = new JButton("-");
		btnMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMINUS.setBounds(201, 133, 64, 63);
		btnMINUS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnMINUS);
		
		JButton btnMULTIPLY = new JButton("*");
		btnMULTIPLY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMULTIPLY.setBounds(201, 206, 64, 63);
		btnMULTIPLY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnMULTIPLY);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btnDot.setBounds(70, 352, 64, 63);
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops = ops * (-1);
						txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(133, 352, 64, 63);
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btnPM);
		
		JButton btnDIVIDE = new JButton("/");
		btnDIVIDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDIVIDE.setBounds(201, 279, 64, 63);
		btnDIVIDE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btnDIVIDE);
		
		JButton btnEQUALS = new JButton("=");
		btnEQUALS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") {
					result = firstNum + secondNum; 
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEQUALS.setBounds(201, 352, 64, 63);
		btnEQUALS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnEQUALS);
		
		
	}
}
