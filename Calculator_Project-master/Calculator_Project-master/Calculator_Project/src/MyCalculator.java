import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MyCalculator extends Frame implements ActionListener
{
	double v1,v2,result;
	char op;
	TextField tf1;
	Button add,sub,mul,div,mod,EQ;
	Button one,two, three,four ,five, six,seven,eight,nine,zero,dot,clear,sqrt;
	public  MyCalculator()
	{
		tf1=new TextField();
		one=new Button("1");
		two=new Button("2");
		three=new Button("3");
		four=new Button("4");
		five=new Button("5");
		six=new Button("6");
		seven=new Button("7");
		eight=new Button("8");
		nine=new Button("9");
		zero=new Button("0");
		dot=new Button(".");
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		mod=new Button("mod");
		sqrt=new Button("sqrt");
		EQ=new Button("EQ");
		clear=new Button("clear");
		one.setBounds(50,65,50,30);
		two.setBounds(105,65,50,30);
		three.setBounds(160,65,50,30);
		four.setBounds(215,65,50,30);
		five.setBounds(50,100,50,30);
		six.setBounds(105,100,50,30);
		seven.setBounds(160,100,50,30);
		eight.setBounds(215,100,50,30);
		nine.setBounds(50,135,50,30);
		zero.setBounds(105,135,50,30);
		dot.setBounds(160,135,50,30);
		clear.setBounds(215,135,50,30);
		add.setBounds(50,170,50,30);
		sub.setBounds(105,170,50,30);
		mul.setBounds(160,170,50,30);
		div.setBounds(215,170,50,30);
		mod.setBounds(50,205,50,30);
		sqrt.setBounds(105,205,50,30);
		EQ.setBounds(160,205,105,30);
		tf1.setBounds(50,40,220,25);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(dot);
		add(clear);
		add(sub);
		add(mul);
		add(div);
		add(EQ);
		add(sqrt);
		add(add);
		add(tf1);
		add(mod);
		add(tf1);
		tf1.addActionListener(this);
         one.addActionListener(this);
         two.addActionListener(this);
         three.addActionListener(this);
         four.addActionListener(this);
         five.addActionListener(this);
         six.addActionListener(this);
         seven.addActionListener(this);
         eight.addActionListener(this);
         nine.addActionListener(this);
         zero.addActionListener(this);
         dot.addActionListener(this);
         sqrt.addActionListener(this);
         clear.addActionListener(this);
         add.addActionListener(this);
         sub.addActionListener(this);
         mul.addActionListener(this);
         div.addActionListener(this);
         mod.addActionListener(this);
         EQ.addActionListener(this);
        one.setBackground(Color.BLUE);
        two.setBackground(Color.BLUE);
        three.setBackground(Color.BLUE);
        four.setBackground(Color.BLUE);
        five.setBackground(Color.BLUE);
        six.setBackground(Color.BLUE);
        seven.setBackground(Color.BLUE);
        eight.setBackground(Color.BLUE);
        nine.setBackground(Color.BLUE);
        zero.setBackground(Color.BLUE);
        dot.setBackground(Color.BLUE);
        add.setBackground(Color.red);
        sub.setBackground(Color.red);
        mul.setBackground(Color.red);
        div.setBackground(Color.red);
        mod.setBackground(Color.red);
        sqrt.setBackground(Color.red);
        clear.setBackground(Color.DARK_GRAY);
        EQ.setBackground(Color.GREEN);
       tf1.setBackground(Color.orange);  
        tf1.setForeground(Color.WHITE);  
        
		
		
	     setBackground(Color.cyan);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
		{
			tf1.setText(tf1.getText()+str);
			
		}
		else if(str.equals("add"))
		{
			 v1=Integer.parseInt(tf1.getText());
			op='+';
			tf1.setText("");
		}
		else if(str.equals("sub"))
		{
		 v1=Integer.parseInt(tf1.getText());
			op='-';
			tf1.setText("");
		}
		else if(str.equals("mul"))
		{
			 v1=Integer.parseInt(tf1.getText());
			op='*';
			tf1.setText("");
		}
		else if(str.equals("div"))
		{
			 v1=Integer.parseInt(tf1.getText());
			op='*';
			tf1.setText("");
		}
		else if(str.equals("mod"))
		{
			 v1=Integer.parseInt(tf1.getText());
			op='%';
			tf1.setText("");
		}
		else if(str.equals("sqrt"))
		{
			 v1=Integer.parseInt(tf1.getText());
			op='^';
			result=Math.sqrt(v1);
			tf1.setText(""+result);
		}
		if(str.equals("EQ"))
		{
			
			 v2=Integer.parseInt(tf1.getText());
			if(op=='+')
				  result=v1+v2;
			else if(op=='-')
				    result=v1-v2;
			else if(op=='*')
				 result=v1*v2;
			else if(op=='/')
				   result=v1/v2;
			else if(op=='%')
				   result=v1%v2;
			tf1.setText(""+result);
			
		}
		
		if(str.equals("clear"))
		{
			tf1.setText("");
		}
		
	}
	
	public static void main(String[] args) 
	{
		new MyCalculator();
		
		
	}
	
}
 
