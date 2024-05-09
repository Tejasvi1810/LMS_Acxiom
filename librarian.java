import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;


public class librarian extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	librarian()
	{
		setSize(500,800);
		setTitle("librarian Section ");
		setLayout(null);
		
		l1 = new JLabel("Librarian Section ");
		b1 = new JButton("Add Books");
		b2 = new JButton("View Books");
		b7 = new JButton("Edit Book Detail");
		b3 = new JButton("Issue Books");
		b4 = new JButton("View Issued Books");
		b5 = new JButton("Return Book");
		b6 = new JButton("Logout");
		
		
		
		add(l1);
		add(b1);
		add(b2);
		add(b7);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		l1.setBounds(170,10,200,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		b1.setBounds(150,100,200,50);
		b2.setBounds(150,200,200,50);
		b7.setBounds(150,300,200,50);
		b3.setBounds(150,400,200,50);
		b4.setBounds(150,500,200,50);
		b5.setBounds(150,600,200,50);
		b6.setBounds(150,700,200,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String str[])
	{
		new librarian();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			new add_books();
		}
		if(e.getSource()==b6)
		{
			this.dispose();
			new Users();
		}
		if(e.getSource()==b3)
		{
			this.dispose();
			new issue_books();
		}
		
		if(e.getSource()==b2)
		{
			this.dispose();
			new view_books();
		}
		if(e.getSource()==b4)
		{
			this.dispose();
			new view_issued_books();
		}
		if(e.getSource()==b5)
		{
			this.dispose();
			new return_book();
		}
		
		if(e.getSource()==b7)
		{
			this.dispose();
			new Edit_book();
		}
	}
}
		
		
		
		