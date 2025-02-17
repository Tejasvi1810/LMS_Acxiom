import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
public class Edit_book extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf2,tf3,tf4,tf5,tf6;
	JButton b1,b2,b3;
	JComboBox cb1;
	Connection con;
	Statement stmt;
	
	Edit_book()
	{
		setSize(700,700);
		setTitle("Updating Books ");
		setLayout(null);
		
		l1 = new JLabel("Update Books ");
		l2 = new JLabel("Book No: ");
		l3 = new JLabel("Name: ");
		l4 = new JLabel("Author: ");
		l5 = new JLabel("Publisher: ");
		l6 = new JLabel("Quantity: ");
		l7 = new JLabel("Price: ");
		
		cb1 = new JComboBox();
		
		
		tf2 = new JTextField(30);
		tf3 = new JTextField(30);
		tf4 = new JTextField(30);
		tf5 = new JTextField(30);
		tf6 = new JTextField(30);
		
		b1 = new JButton("Update Book");
		b2 = new JButton("Back ");
		b3 = new JButton("Clear ");
		
		add(l1);add(l2); add(cb1);add(l3);add(tf2);add(l4);add(tf3);
		add(l5);add(tf4);add(l6);add(tf5);add(l7);add(tf6);add(b1);add(b2);add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setBounds(190,10,300,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		
		l2.setBounds(100,100,100,50);
		l2.setFont(new Font("Serif",Font.BOLD,15));
		cb1.setBounds(300,115,120,20);
		
		l3.setBounds(100,150,150,50);
		l3.setFont(new Font("Serif",Font.BOLD,15));
		tf2.setBounds(300,170,120,20); 	
		
		l4.setBounds(100,200,150,50);
		l4.setFont(new Font("Serif",Font.BOLD,15));
		tf3.setBounds(300,220,120,20);
		
		l5.setBounds(100,250,150,50);
		l5.setFont(new Font("Serif",Font.BOLD,15));
		tf4.setBounds(300,270,120,20); 	
		
		l6.setBounds(100,300,150,50);
		l6.setFont(new Font("Serif",Font.BOLD,15));
		tf5.setBounds(300,320,120,20); 	
		
		l7.setBounds(100,350,150,50);
		l7.setFont(new Font("Serif",Font.BOLD,15));
		tf6.setBounds(300,370,120,20); 
		
		b1.setBounds(150,450,130,50);
		b2.setBounds(320,450,130,50);
		b3.setBounds(490,450,130,50);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/lib","root","");
			stmt=con.createStatement();
			
				String q1 = "select * from add_books";
				ResultSet rs = stmt.executeQuery(q1);
				
				while(rs.next())
					{
						cb1.addItem(rs.getString(1));
						
					}
			System.out.println("Connected");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		

		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);

	
		
	}
	
	public static void main(String str[])
	{
		new Edit_book();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		try
		{
			
			if(e.getSource()==b1)
				{
					
					String str2="update add_books set Quantity='"+tf5.getText()+"' where Quantity ='"+tf5.getText()+"'"; 
					stmt.executeUpdate(str2);
					
					ResultSet rs1 = stmt.executeQuery(str2);
					if(rs1.next())
					{
						
						tf2.setText(rs1.getString(1));
						tf3.setText(rs1.getString(2));
						tf4.setText(rs1.getString(3));
						tf5.setText(rs1.getString(4));
						tf6.setText(rs1.getString(5));
						
					}
					System.out.println("Updated");
				}
					
					
					
		if(e.getSource()==b2)
		{
			this.dispose();
			new librarian();
		}
		
		if(e.getSource()==b3)
		{
			
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			
			
			b1.setEnabled(true);
		}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
			
}
		
		