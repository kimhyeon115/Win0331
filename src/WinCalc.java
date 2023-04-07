import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class WinCalc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField lblDisp;
	private String sNum1 = new String("");
	private String sNum2 = new String("");
	private String sOp = new String("");
	private boolean bStart = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinCalc dialog = new WinCalc();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinCalc() {
		setTitle("계산기");
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblDisp = new JTextField();
			lblDisp.setBackground(new Color(255, 255, 255));
			lblDisp.setOpaque(false);
			lblDisp.setFont(new Font("굴림", Font.BOLD, 20));
			lblDisp.setBounds(12, 26, 410, 50);
			contentPanel.add(lblDisp);
			lblDisp.setColumns(10);
		}
		{
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "7");
					}else {						
						lblDisp.setText(lblDisp.getText() + "7");
					}
				}
			});
			btn7.setFont(new Font("굴림", Font.BOLD, 24));
			btn7.setBounds(12, 86, 80, 50);
			contentPanel.add(btn7);
		}
		{
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "4");
					}else {						
						lblDisp.setText(lblDisp.getText() + "4");
					}
				}
			});
			btn4.setFont(new Font("굴림", Font.BOLD, 24));
			btn4.setBounds(12, 146, 80, 50);
			contentPanel.add(btn4);
		}
		{
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "1");
					}else {						
						lblDisp.setText(lblDisp.getText() + "1");
					}
				}
			});
			btn1.setFont(new Font("굴림", Font.BOLD, 24));
			btn1.setBounds(12, 206, 80, 50);
			contentPanel.add(btn1);
		}
		{
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "8");
					}else {						
						lblDisp.setText(lblDisp.getText() + "8");
					}
				}
			});
			btn8.setFont(new Font("굴림", Font.BOLD, 24));
			btn8.setBounds(104, 86, 80, 50);
			contentPanel.add(btn8);
		}
		{
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "9");
					}else {						
						lblDisp.setText(lblDisp.getText() + "9");
					}
				}
			});
			btn9.setFont(new Font("굴림", Font.BOLD, 24));
			btn9.setBounds(196, 86, 80, 50);
			contentPanel.add(btn9);
		}
		{
			JButton btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNum1 = lblDisp.getText();
					lblDisp.setText("");
					sOp = "/";
				}
			});
			btnDiv.setFont(new Font("굴림", Font.BOLD, 24));
			btnDiv.setBounds(288, 86, 134, 50);
			contentPanel.add(btnDiv);
		}
		{
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "5");
					}else {						
						lblDisp.setText(lblDisp.getText() + "5");
					}
				}
			});
			btn5.setFont(new Font("굴림", Font.BOLD, 24));
			btn5.setBounds(104, 146, 80, 50);
			contentPanel.add(btn5);
		}
		{
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "6");
					}else {						
						lblDisp.setText(lblDisp.getText() + "6");
					}
				}
			});
			btn6.setFont(new Font("굴림", Font.BOLD, 24));
			btn6.setBounds(196, 146, 80, 50);
			contentPanel.add(btn6);
		}
		{
			JButton btnMul = new JButton("*");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNum1 = lblDisp.getText();
					lblDisp.setText("");
					sOp = "*";
				}
			});
			btnMul.setFont(new Font("굴림", Font.BOLD, 24));
			btnMul.setBounds(288, 146, 134, 50);
			contentPanel.add(btnMul);
		}
		{
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "2");
					}else {						
						lblDisp.setText(lblDisp.getText() + "2");
					}
				}
			});
			btn2.setFont(new Font("굴림", Font.BOLD, 24));
			btn2.setBounds(104, 206, 80, 50);
			contentPanel.add(btn2);
		}
		{
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bStart) {
						lblDisp.setText("");
						bStart = false;
						lblDisp.setText(lblDisp.getText() + "3");
					}else {						
						lblDisp.setText(lblDisp.getText() + "3");
					}
				}
			});
			btn3.setFont(new Font("굴림", Font.BOLD, 24));
			btn3.setBounds(196, 206, 80, 50);
			contentPanel.add(btn3);
		}
		{
			JButton btnSubs = new JButton("-");
			btnSubs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNum1 = lblDisp.getText();
					lblDisp.setText("");
					sOp = "-";
				}
			});
			btnSubs.setFont(new Font("굴림", Font.BOLD, 24));
			btnSubs.setBounds(288, 206, 134, 50);
			contentPanel.add(btnSubs);
		}
		{
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!lblDisp.getText().equals(""))
						if(bStart) {
							lblDisp.setText("");
							bStart = false;
							lblDisp.setText(lblDisp.getText() + "0");
						}else {						
							lblDisp.setText(lblDisp.getText() + "0");
						}
				}
			});
			btn0.setFont(new Font("굴림", Font.BOLD, 24));
			btn0.setBounds(12, 266, 80, 50);
			contentPanel.add(btn0);
		}
		{
			JButton btnInfo = new JButton("=");
			btnInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNum2 = lblDisp.getText();
					double result = 0;
					switch(sOp) {
					case "+": 
						result = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
						break;
					case "-":
						result = Integer.parseInt(sNum1) - Integer.parseInt(sNum2);
						break;
					case "*":
						result = Integer.parseInt(sNum1) * Integer.parseInt(sNum2);
						break;
					case "/":
						result = (double)Integer.parseInt(sNum1) / Integer.parseInt(sNum2);
						break;
					}
					lblDisp.setText(Double.toString(result));
					bStart = true;
				}
			});
			btnInfo.setFont(new Font("굴림", Font.BOLD, 24));
			btnInfo.setBounds(196, 266, 80, 50);
			contentPanel.add(btnInfo);
		}
		{
			JButton btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNum1 = lblDisp.getText();
					lblDisp.setText("");
					sOp = "+";
				}
			});
			btnAdd.setFont(new Font("굴림", Font.BOLD, 24));
			btnAdd.setBounds(288, 266, 134, 50);
			contentPanel.add(btnAdd);
		}
		{
			JButton btnClear = new JButton("C");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblDisp.setText("");
				}
			});
			btnClear.setFont(new Font("굴림", Font.BOLD, 24));
			btnClear.setBounds(104, 266, 80, 50);
			contentPanel.add(btnClear);
		}
	}

}
