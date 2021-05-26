import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TestSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 프레임 설정
		JPanel panel = new JPanel(); // 패널 설정
		JLabel label = new JLabel("ID : ");
		JLabel label2 = new JLabel("Password :");
		JTextField txtID = new JTextField(10);
		JPasswordField txtpass = new JPasswordField(10);
		JPanel btnPnl = new JPanel();
		JButton btn3 = new JButton("Log In");
		JTextArea txtArea = new JTextArea();
		
		frame.add(panel);
		
		
		frame.setResizable(false); // 사이즈 수정 불가
		frame.setVisible(true);  // 
		frame.setPreferredSize(new Dimension(840 , 840/12*9));
		frame.setSize(840 , 840/12*9); // 프레임 400 * 400 비율로 설정
		
		frame.setLocationRelativeTo(null); // GUI를 가운데 기능으로 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 했을 때 모든 게 종료되는 기능 
		
		panel.setLayout(new BorderLayout()); // 패널 , 라벨 등 위치를 조절하는 기능 
		
		
		panel.add(txtArea , BorderLayout.CENTER);
		panel.add(btn3);
		panel.add(txtID);
		panel.add(txtpass);

		
	
	
	
		
		
		
		
		

	}
}
