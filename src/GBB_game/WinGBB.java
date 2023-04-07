package GBB_game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class WinGBB extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfComputer;
	private JComboBox cbHuman;
	private JLabel lblHuimg;
	private JLabel lblComimg;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinGBB dialog = new WinGBB();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinGBB() {
		setTitle("가위바위보 게임");
		setBounds(100, 100, 557, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnRun = new JButton("실행");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Scanner scn = new Scanner(System.in);
//				System.out.println("가위(0)바위(1)보(2) 입력:");
//				int human = scn.nextInt();
				int human =	(int)(Math.random()*(2-0+1)+0);					
				int computer = (int)(Math.random()*(2-0+1)+0);		// (Math.random()*(최대값-최소값+1)+최소값)  공식
//					System.out.println("컴퓨터:" + computer + "인간:" + human);
				ImageIcon iconHuman = new ImageIcon(WinGBB.class.getResource("/GBB_game/images/" + human + ".PNG"));
				lblHuimg.setIcon(iconHuman);
				ImageIcon iconComputer = new ImageIcon(WinGBB.class.getResource("/GBB_game/images/" + computer + ".PNG"));
				lblComimg.setIcon(iconComputer);
				tfComputer.setText(Integer.toString(computer));
					
					if(computer ==  human)
						setTitle("비김");
					else if((computer+1)%3 == human)
						setTitle("이김");										
					else
						setTitle("짐");
					
			}
		});
		btnRun.setBounds(277, 61, 97, 23);
		contentPanel.add(btnRun);
		
		JLabel lblNewLabel = new JLabel("인간:");
		lblNewLabel.setBounds(56, 65, 57, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("컴퓨터:");
		lblNewLabel_1.setBounds(56, 138, 57, 15);
		contentPanel.add(lblNewLabel_1);
		
		tfComputer = new JTextField();
		tfComputer.setEditable(false);
		tfComputer.setHorizontalAlignment(SwingConstants.RIGHT);
		tfComputer.setColumns(10);
		tfComputer.setBounds(149, 135, 116, 21);
		contentPanel.add(tfComputer);
		
		cbHuman = new JComboBox();
		cbHuman.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2"}));
		cbHuman.setBounds(149, 61, 116, 23);
		contentPanel.add(cbHuman);
		
		lblComimg = new JLabel("");
		lblComimg.setIcon(new ImageIcon(WinGBB.class.getResource("/GBB_game/images/0.PNG")));
		lblComimg.setBounds(47, 212, 181, 171);
		contentPanel.add(lblComimg);
		
		lblHuimg = new JLabel("");
		lblHuimg.setIcon(new ImageIcon(WinGBB.class.getResource("/GBB_game/images/1.PNG")));
		lblHuimg.setBounds(301, 206, 181, 177);
		contentPanel.add(lblHuimg);
		
		btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
				
			}
		});
		btnExit.setBounds(277, 134, 97, 23);
		contentPanel.add(btnExit);
	}
}
