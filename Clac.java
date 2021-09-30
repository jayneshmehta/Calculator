import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Clac extends Frame implements ActionListener {

     int x=0,y=0,result=0;
     char op;
     TextField tf = new TextField();
     
     public void Clac() {
    	 
    	 setTitle("Calculator");
    	 
    	 tf.setBounds(10, 40, 270, 50);
    	 Button b1 = new Button("1");
    	 Button b2 = new Button("2");
    	 Button b3 = new Button("3");
    	 Button b4 = new Button("4");
    	 Button b5 = new Button("5");
    	 Button b6 = new Button("6");
    	 Button b7 = new Button("7");
    	 Button b8 = new Button("8");
    	 Button b9 = new Button("9");
    	 Button b10 = new Button("0");
    	 Button c = new Button("C");
    	 Button p = new Button(".");
    	 Button pl = new Button("+");
    	 Button po = new Button("^");
    	 Button mi = new Button("-");
    	 Button mu = new Button("*");
    	 Button di = new Button("/");
    	 Button pe = new Button("%");
    	 Button eq = new Button("=");
    	 
    	 b7.setBounds(10, 110, 50, 50);
    	 b4.setBounds(10, 165, 50, 50);
    	 b1.setBounds(10, 220, 50, 50);
    	 b10.setBounds(10, 275, 50, 50);
    	 
    	 b8.setBounds(65, 110, 50, 50);
    	 b5.setBounds(65, 165, 50, 50);
    	 b2.setBounds(65, 220, 50, 50);
    	 p.setBounds(65, 275, 50, 50);
    	 
    	 b9.setBounds(120, 110, 50, 50);
    	 b6.setBounds(120, 165, 50, 50);
    	 b3.setBounds(120, 220, 50, 50);
    	 eq.setBounds(120, 275, 105, 50);
    	 
    	 po.setBounds(175,110, 50, 50);
    	 di.setBounds(175,165, 50, 50);
    	 mi.setBounds(175,220, 50, 50);
    	 
    	 pe.setBounds(230,165,50,50);
    	 c.setBounds(230, 110, 50, 50);
    	 mu.setBounds(230, 220, 50, 50);
    	 pl.setBounds(230,275, 50, 50);
    	 
    	  	b1.addActionListener(this);
    	  	b2.addActionListener(this);
    	  	b3.addActionListener(this);
    	  	b4.addActionListener(this);
    	  	b5.addActionListener(this);
    	  	b6.addActionListener(this);
    	  	b7.addActionListener(this);
    	  	b8.addActionListener(this);
    	  	b9.addActionListener(this);
    	  	b10.addActionListener(this);
    	  	c.addActionListener(this);
    	  	pl.addActionListener(this);
    	  	mi.addActionListener(this);
    	  	mu.addActionListener(this);
    	  	di.addActionListener(this);
    	  	pe.addActionListener(this);
    	  	po.addActionListener(this);
    	  	eq.addActionListener(this);
    	  	p.addActionListener(this);
    	  	
    	 add(pe);
       	 add(eq);
       	 add(c);
       	 add(di);
       	 add(pl);
       	 add(po);
       	 add(mi);
       	 add(mu);
       	 add(b1);
       	 add(b4);
       	 add(b7);
       	 add(b10);
       	 add(tf);
       	 add(b2);
       	 add(b5);
       	 add(b8);
       	 add(b3);
       	 add(b6);
       	 add(b9);
       	 add(p);
       	 tf.setBackground(Color.gray);
       	 Font f = new Font("Serif",Font.BOLD,22);
       	 tf.setFont(f);
       	 c.setBackground(Color.RED);
       	 eq.setBackground(Color.GREEN);
       	 setBackground(Color.orange);
       	 setSize(290,370);
   	     setLayout(null);
            setVisible(true);

            addWindowListener(new WindowAdapter() {
       		 public void windowClosing(WindowEvent e) {
       			dispose(); 
       		 }
       	 });
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    		String s = e.getActionCommand();
    		if(s.equals("+")) {
    			x = Integer.parseInt(tf.getText());
    			op = '+';
    			tf.setText("");
    		}
    		else if(s.equals("-")) {
    			x = Integer.parseInt(tf.getText());
    			op = '-';
    			tf.setText("");
    		}else if(s.equals("/")) {
    			x = Integer.parseInt(tf.getText());
    			op = '/';
    			tf.setText("");
    		}else if(s.equals("*")) {
    			x = Integer.parseInt(tf.getText());
    			op = '*';
    			tf.setText("");
    		}else if(s.equals("^")) {
    			x = Integer.parseInt(tf.getText());
    			op = '^';
    			tf.setText("");
    		}else if(s.equals("=")) {
    			y = Integer.parseInt(tf.getText());
    			tf.setText("");   		
    	      
    		switch(op) {
    		case '+' : result = x + y;
    		break;
    		case '-' : result = x - y;
    		break;
    		case '*' : result = x * y;
    		break;
    		case '/' : result = x / y;
    		break;
    		case '^' :  
    			result =(int) Math.pow(x, y); 
    		break;
    		}
    		tf.setText(result+"");
    		result =0;
    		}else if(s.equals("C")) {
    		x=0;
    		y=0;
    		result=0;	
    		tf.setText("");
    		}
    		else {
    			tf.setText( tf.getText()+ s);
    		}
    }
	  public static void main(String[] args) {
	Clac c = new Clac();
     c.Clac();	
}
}