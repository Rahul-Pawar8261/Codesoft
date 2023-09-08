import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class greadecal implements ActionListener{

	JFrame frame=new JFrame();
	JLabel head=new JLabel("Student greade Calculator ");
	JLabel subject=new JLabel("Enter Marks OF six Subject :");
	//Text feilds of six subjects
	JTextField sub1=new JTextField();
	JTextField sub2=new JTextField();
	JTextField sub3=new JTextField();
	JTextField sub4=new JTextField();
	JTextField sub5=new JTextField();
	JTextField sub6=new JTextField();
	
	JButton submit=new JButton("SUBMIT");
	JLabel grade=new JLabel("Grade of Student is :");
	JTextField gradetext=new JTextField();	//TextFeild  to display greade of student
	greadecal()
	{   	
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1800,1000);
		frame.getContentPane().setBackground(Color.BLACK);
		Font fnt=new Font("Elephant",Font.BOLD,30);
		
		
		head.setBounds(400,100,1300,90);
		head.setFont(new Font("Elephant",Font.BOLD,80));
		head.setForeground(Color.white);
		frame.add(head);

		
		subject.setBounds(200,300,600,40);
		subject.setFont(fnt);
		subject.setForeground(Color.white);
		frame.add(subject);
		
		sub1.setBounds(100,400,200,40);
		frame.add(sub1);
		sub1.setFont(fnt);
		
		sub2.setBounds(400,400,200,40);
		frame.add(sub2);
		sub2.setFont(fnt);
		
		sub3.setBounds(700,400,200,40);
		frame.add(sub3);
		sub3.setFont(fnt);
		
		sub4.setBounds(100,500,200,40);
		frame.add(sub4);
		sub4.setFont(fnt);
		
		sub5.setBounds(400,500,200,40);
		frame.add(sub5);
		sub5.setFont(fnt);
		
		sub6.setBounds(700,500,200,40);
		frame.add(sub6);
		sub6.setFont(fnt);
		
		submit.setBounds(900,650,200,60);
		submit.setFont(fnt);
		frame.add(submit);
		submit.addActionListener(this);
		
		grade.setBounds(400,800,1100,90);
		grade.setFont(new Font("Elephant",Font.BOLD,60));
		grade.setForeground(Color.white);
		frame.add(grade);
		gradetext.setBounds(1100,800,400,90);
		gradetext.setForeground(Color.black);
		gradetext.setFont(new Font("Elephant",Font.BOLD,60));
		frame.add(gradetext);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		float  num1=Float.parseFloat(sub1.getText());
		float num2=Float.parseFloat(sub2.getText());
		float num3=Float.parseFloat(sub3.getText());
		float num4=Float.parseFloat(sub4.getText());
		float num5=Float.parseFloat(sub5.getText());
		float num6=Float.parseFloat(sub6.getText());
		float totalsub_Mark=(num1+num2+num3+num4+num5+num6);
		float  per=(float)(totalsub_Mark/600)*100;
		if(per>=75)
		{
			gradetext.setText("Distinction");	
		}
		else if(per<75 && per>=60)
		{
			gradetext.setText("A");			
		}
		else if(per<60 && per>=50)
		{
			gradetext.setText("B");	
		}
		else if(per<50 && per>=35)
		{
			gradetext.setText("C");	
		}	
		else
		{
			gradetext.setText("Fail");	
		}
	}
	/**
	 * @param args
	 */
	public static void main (String[] args) 
	{
    	greadecal c=new greadecal();
    }
}