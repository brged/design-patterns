package observer.loginevent;

import java.awt.*;

import javax.swing.*;

public class LoginValidateB extends JFrame implements LoginEventListener {
	
	private JPanel p;
	private LoginBean lb;
	private JLabel lblLogo;
	
	public LoginValidateB() {
		super("Bank of China");
		p=new JPanel();
		this.getContentPane().add(p);
		lb=new LoginBean();
		lb.addLoginEventListener(this);
		
		Font f=new Font("Time New Roman", Font.BOLD, 30);
		lblLogo=new JLabel("Bank of China");
		lblLogo.setFont(f);
		lblLogo.setForeground(Color.RED);
		
		p.setLayout(new GridLayout(2,1));
		p.add(lblLogo);
		p.add(lb);
		p.setBackground(Color.PINK);
		this.setSize(600,200);
		this.setVisible(true);
	}
	

	//实现在抽象观察者中声明的响应方法
	@Override
	public void validateLogin(LoginEvent event) {
		String userName=event.getUserName();
		String password=event.getPassword();
		
		if(userName.equals(password)){
			JOptionPane.showMessageDialog(this, new String("UserName must be different from Password!"), 
					"alert", JOptionPane.ERROR_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(this, new String("Right details!"), "alert", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		new LoginValidateB();
	}

}
