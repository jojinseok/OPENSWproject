import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TestSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // ������ ����
		JPanel panel = new JPanel(); // �г� ����
		JLabel label = new JLabel("ID : ");
		JLabel label2 = new JLabel("Password :");
		JTextField txtID = new JTextField(10);
		JPasswordField txtpass = new JPasswordField(10);
		JPanel btnPnl = new JPanel();
		JButton btn3 = new JButton("Log In");
		JTextArea txtArea = new JTextArea();
		
		frame.add(panel);
		
		
		frame.setResizable(false); // ������ ���� �Ұ�
		frame.setVisible(true);  // 
		frame.setPreferredSize(new Dimension(840 , 840/12*9));
		frame.setSize(840 , 840/12*9); // ������ 400 * 400 ������ ����
		
		frame.setLocationRelativeTo(null); // GUI�� ��� ������� ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ���� ���� �� ��� �� ����Ǵ� ��� 
		
		panel.setLayout(new BorderLayout()); // �г� , �� �� ��ġ�� �����ϴ� ��� 
		
		
		panel.add(txtArea , BorderLayout.CENTER);
		panel.add(btn3);
		panel.add(txtID);
		panel.add(txtpass);

		
	
	
	
		
		
		
		
		

	}
}
