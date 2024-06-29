import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator  implements ActionListener{
	
	JTextField tf1,tf2;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5;
	Calculator(){
		JFrame f=new JFrame("Simple Calculator");
		l1=new JLabel ("Enter First Number");
		l1.setBounds(50, 30, 180, 20);
		tf1=new JTextField();
		tf1.setBounds(50,60,180,20);
		l2=new JLabel ("Enter Second Number");
		l2.setBounds(50, 90, 180, 20);
		tf2=new JTextField();
		tf2.setBounds(50,120,180,20);
		b1=new JButton("+");
		b1.setBounds(80,170,50,50);
		b2=new JButton("-");
		b2.setBounds(150,170,50,50);
		b3=new JButton("*");
		b3.setBounds(80,230,50,50);
		b4=new JButton("/");
		b4.setBounds(150,230,50,50);
		b5=new JButton("Clear");
		b5.setBounds(100,290,80,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		
		
		f.add(l1);f.add(l2);
		f.add(tf1);f.add(tf2);
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		f.setSize(300,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=tf1.getText();
		String s2=tf2.getText();
		double a=0;
		double b=0;
		try {
			
		a=Double.parseDouble(s1);
		b=Double.parseDouble(s2);
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Invalid input");
			return;
			
			
		}
		double c=0;
		String message = "";
		if(e.getSource()==b1) {
			c=a+b;
			message = "Result: " + a + " + " + b + " = " + c;
		}else if(e.getSource()==b2) {
			c=a-b;
			message = "Result: " + a + " - " + b + " = " + c;
		}else if(e.getSource()==b3) {
			c=a*b;
			message = "Result: " + a + " * " + b + " = " + c;
		}else if (e.getSource()==b4) {
            if(b==0) {
            	
            	JOptionPane.showMessageDialog(null, "Cannot divide by zero");
            return;
            
            }
            c=a/b;
            message = "Result: " + a + " / " + b + " = " + c;
		}else if(e.getSource()==b5)
		{
			tf1.setText("");
			tf2.setText("");
			
		}
		
if(!message.isEmpty()) {
		JOptionPane.showMessageDialog(null,message);
}
		
		
	}
	
	
	
public static void main (String abc []) {
	new Calculator();
	
}
}
