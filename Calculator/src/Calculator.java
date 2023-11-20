import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{ //key Action
	boolean isOperatorClicked=false;
	int res=0;
	String oldValue;
	JFrame jf;
	float result;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton sixbutton;
	JButton fivebutton;
	JButton fourbutton;
	JButton zerobutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton clearbutton;
	JButton dotbutton;
	JButton divbutton;
	JButton mulbutton;
	JButton plusbutton;
	JButton minusbutton;
	JButton equalbutton;
	public Calculator() {
		jf=new JFrame(" */$  CALCULATOR  $/* ");// frame design
		jf.setLayout(null);
		jf.setSize(450, 670);
		jf.setLocation(200,100);
		jf.getContentPane().setBackground(Color.BLACK);
		
		displaylabel=new JLabel();  //label cannot edited / text edited
		displaylabel.setBounds(30,50,380,50); // x , y , width,height
		displaylabel.setBackground(Color.white); 
		displaylabel.setOpaque(true); //background support element
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT); //right align
		displaylabel.setForeground(Color.BLUE);
		displaylabel.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
		jf.add(displaylabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30,130,80,80); //x,y,height,width
		sevenbutton.setFont(new Font("Arial", Font.PLAIN,30));
		sevenbutton.setForeground(Color.white);
		sevenbutton.setBackground(Color.darkGray);
		sevenbutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		sevenbutton.addActionListener(this);
     	jf.add(sevenbutton);
			
		eightbutton=new JButton("8");
		eightbutton.setBounds(130,130,80,80);
		eightbutton.setFont(new Font("Arial", Font.PLAIN,30));
		eightbutton.setForeground(Color.white);
		eightbutton.setBackground(Color.darkGray);
		eightbutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230,130,80,80);
		ninebutton.setFont(new Font("Arial", Font.PLAIN,30));
		ninebutton.setForeground(Color.white);
		ninebutton.setBackground(Color.darkGray);
		ninebutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30,230,80,80);
		fourbutton.setFont(new Font("Arial", Font.PLAIN,30));
		fourbutton.setForeground(Color.white);
		fourbutton.setBackground(Color.darkGray);
		fourbutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
	    fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130,230,80,80);
		fivebutton.setFont(new Font("Arial", Font.PLAIN,30));
		fivebutton.setForeground(Color.white);
		fivebutton.setBackground(Color.darkGray);
		fivebutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230,230,80,80);
		sixbutton.setFont(new Font("Arial", Font.PLAIN,30));
		sixbutton.setForeground(Color.white);
		sixbutton.setBackground(Color.darkGray);
		sixbutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(30,330,80,80);
		onebutton.setFont(new Font("Arial", Font.PLAIN,30));
		onebutton.setForeground(Color.white);
		onebutton.setBackground(Color.darkGray);
		onebutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130,330,80,80);
		twobutton.setFont(new Font("Arial", Font.PLAIN,30));
		twobutton.setForeground(Color.white);
		twobutton.setBackground(Color.darkGray);
		twobutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230,330,80,80);
		threebutton.setFont(new Font("Arial", Font.PLAIN,30));
		threebutton.setForeground(Color.white);
		threebutton.setBackground(Color.darkGray);
		threebutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30,430,80,80);
		dotbutton.setFont(new Font("Arial", Font.PLAIN,30));
		dotbutton.setForeground(Color.white);
		dotbutton.setBackground(Color.darkGray);
		dotbutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		dotbutton.addActionListener(this);	
		jf.add(dotbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130,430,80,80);
		zerobutton.setFont(new Font("Arial", Font.PLAIN,30));
		zerobutton.setForeground(Color.white);
		zerobutton.setBackground(Color.darkGray);
		zerobutton.setBorder(BorderFactory.createLineBorder(Color.green,2));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(230,430,80,80);
		clearbutton.setFont(new Font("Arial", Font.PLAIN,30));
		clearbutton.setBackground(Color.red);
		clearbutton.setBorder(BorderFactory.createLineBorder(Color.white,3));
		clearbutton.addActionListener(this);	
		jf.add(clearbutton);
		
		divbutton=new JButton("/");
		divbutton.setBounds(330,130,80,80);
		divbutton.setFont(new Font("Arial", Font.PLAIN,30));
		divbutton.setForeground(Color.white);
		divbutton.setBackground(Color.orange);
		divbutton.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		divbutton.addActionListener(this);
		jf.add(divbutton);
		 
		mulbutton=new JButton("x");
		mulbutton.setBounds(330,230,80,80);
		mulbutton.setFont(new Font("Arial", Font.PLAIN,30));
		mulbutton.setForeground(Color.white);
		mulbutton.setBackground(Color.orange);
		mulbutton.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		mulbutton.addActionListener(this);		
		jf.add(mulbutton);
		 
		minusbutton=new JButton("-");
		minusbutton.setBounds(330,330,80,80);
		minusbutton.setFont(new Font("Arial", Font.PLAIN,30));
		minusbutton.setForeground(Color.white);
		minusbutton.setBackground(Color.orange);
		minusbutton.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		minusbutton.addActionListener(this);
		jf.add(minusbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(330,430,80,80);
		plusbutton.setFont(new Font("Arial", Font.PLAIN,30));
		plusbutton.setForeground(Color.white);
		plusbutton.setBackground(Color.orange);
		plusbutton.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		plusbutton.addActionListener(this);	
		jf.add(plusbutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(60,530,310,80);
		equalbutton.setFont(new Font("Arial", Font.PLAIN,30));
		equalbutton.setBackground(Color.pink);
		equalbutton.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		equalbutton.setForeground(Color.green);
		equalbutton.addActionListener(this);	
		jf.add(equalbutton);
			
		jf.setVisible(true);  //frame visible key
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when close time exit the program
	}
	public static void main(String[]args) {
		new Calculator();
    }
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource() == sevenbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
			
		}else if(e.getSource() == eightbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"8");
			}			
		}else if(e.getSource() == ninebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("9");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"9");
			}
				
		}else if(e.getSource() == fourbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("4");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"4");
			}	
		}else if(e.getSource() == fivebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("5");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"5");
			}	
		}else if(e.getSource() == sixbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("6");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"6");
			}	
		}else if(e.getSource() == onebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("1");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"1");
			}
		}else if(e.getSource() == twobutton) {
			if(isOperatorClicked) {
				displaylabel.setText("2");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"2");
			};
		}else if(e.getSource() == threebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("3");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"3");
			}
		}else if(e.getSource() == zerobutton) {
			if(isOperatorClicked) {
				displaylabel.setText("0");
				isOperatorClicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"0");
			}		
		}else if(e.getSource() == dotbutton) {
			if(isOperatorClicked) {
				displaylabel.setText(".");
				isOperatorClicked=false;
				
		    }else {
			displaylabel.setText(displaylabel.getText()+".");
			}
			
		}else if(e.getSource() == clearbutton) {
			displaylabel.setText("");
		
	    }else if(e.getSource() == plusbutton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText(" ");
			res=1;
			
	    }else if(e.getSource() == minusbutton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText(" ");
			res=2;
					
		}else if(e.getSource() ==mulbutton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText(" ");
			res=3;
						
		}else if(e.getSource() == divbutton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			displaylabel.setText(" ");
			res=4;
					
		}else if(e.getSource() == equalbutton) {
			String newValue =displaylabel.getText();
			float oldValueF=Float.parseFloat(oldValue);  //String to float 
			float newValueF=Float.parseFloat(newValue);
		
				if(res==1) {
					result= oldValueF+newValueF;
					isOperatorClicked=true;
				}else if(res==2) {
					result= oldValueF-newValueF;
					isOperatorClicked=true;
				}else if(res==3) {
					result= oldValueF*newValueF;
					isOperatorClicked=true;
				}else if(res==4) {
					result= oldValueF/newValueF;
					isOperatorClicked=true;
				}		
			displaylabel.setText(result+" ");
		}
	}
}
