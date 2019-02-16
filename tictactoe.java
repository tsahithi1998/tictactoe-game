import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class tictactoe extends Applet implements ActionListener
{
Panel p1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
Label l1,l2;
TextField t1,t2,t3;
int count=0,ptr=0,n=0;
public void start()
{
setLayout(null);
p1=new Panel(new GridLayout(3,3));
l1=new Label("Enter Player1 name here");
l2=new Label("Enter Player2 name here");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b2=new Button("");
b3=new Button("");
b4=new Button("");
b5=new Button("");
b6=new Button("");
b7=new Button("");
b8=new Button("");
b9=new Button("");
b1=new Button("");
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
add(p1);
add(l1);
add(l2);
add(t1);
add(t2);
add(t3);
t3.setBounds(200,50,200,20);
t3.setEditable(false);
l1.setBounds(100,100,150,20);
t1.setBounds(260,100,100,20);
l2.setBounds(100,150,150,20);
t2.setBounds(260,150,100,20);
p1.setBounds(200,200,200,200);
b2.addActionListener(this);
b1.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b1.setBackground(Color.black);
b2.setBackground(Color.black);
b3.setBackground(Color.black);
b4.setBackground(Color.black);
b5.setBackground(Color.black);
b6.setBackground(Color.black);
b7.setBackground(Color.black);
b8.setBackground(Color.black);
b9.setBackground(Color.black);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
if(count%2==0)
b1.setLabel("X");
else
b1.setLabel("O");
count++;
b1.setEnabled(false);
n++;
String s1=b1.getLabel();
String s2=b2.getLabel();
String s3=b3.getLabel();
String s4=b4.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s1.equals("X"))&&(s2.equals("X"))&&(s3.equals("X")))||((s1.equals("X"))&&(s4.equals("X"))&&(s7.equals("X")))||((s1.equals("X"))&&(s5.equals("X"))&&(s9.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s1.equals("O"))&&(s2.equals("O"))&&(s3.equals("O")))||((s1.equals("O"))&&(s4.equals("O"))&&(s7.equals("O")))||((s1.equals("O"))&&(s5.equals("O"))&&(s9.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b2)
{
if(count%2==0)
b2.setLabel("X");
else
b2.setLabel("O");
count++;
b2.setEnabled(false);
n++;
String s1=b1.getLabel();
String s2=b2.getLabel();
String s3=b3.getLabel();
String s8=b8.getLabel();
String s5=b5.getLabel();
if(((s1.equals("X"))&&(s2.equals("X"))&&(s3.equals("X")))||((s2.equals("X"))&&(s5.equals("X"))&&(s8.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s1.equals("O"))&&(s2.equals("O"))&&(s3.equals("O")))||((s2.equals("O"))&&(s5.equals("O"))&&(s8.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b1.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}


}
if(e.getSource()==b3)
{
if(count%2==0)
b3.setLabel("X");
else
b3.setLabel("O");
count++;
b3.setEnabled(false);
n++;
String s1=b1.getLabel();
String s2=b2.getLabel();
String s3=b3.getLabel();
String s6=b6.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s1.equals("X"))&&(s2.equals("X"))&&(s3.equals("X")))||((s3.equals("X"))&&(s5.equals("X"))&&(s7.equals("X")))||((s3.equals("X"))&&(s6.equals("X"))&&(s9.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s1.equals("O"))&&(s2.equals("O"))&&(s3.equals("O")))||((s3.equals("O"))&&(s5.equals("O"))&&(s7.equals("O")))||((s3.equals("O"))&&(s6.equals("O"))&&(s9.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b1.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b4)
{
if(count%2==0)
b4.setLabel("X");
else
b4.setLabel("O");
count++;
b4.setEnabled(false);
n++;
String s1=b1.getLabel();
String s6=b6.getLabel();
String s4=b4.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
if(((s1.equals("X"))&&(s4.equals("X"))&&(s7.equals("X")))||((s4.equals("X"))&&(s5.equals("X"))&&(s6.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s1.equals("O"))&&(s4.equals("O"))&&(s7.equals("O")))||((s4.equals("O"))&&(s5.equals("O"))&&(s6.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b1.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b5)
{
if(count%2==0)
b5.setLabel("X");
else
b5.setLabel("O");
count++;
b5.setEnabled(false);
n++;
String s2=b2.getLabel();
String s6=b6.getLabel();
String s4=b4.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s8=b8.getLabel();
if(((s2.equals("X"))&&(s5.equals("X"))&&(s8.equals("X")))||((s4.equals("X"))&&(s5.equals("X"))&&(s6.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s2.equals("O"))&&(s5.equals("O"))&&(s8.equals("O")))||((s4.equals("O"))&&(s5.equals("O"))&&(s6.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b1.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b6)
{
if(count%2==0)
b6.setLabel("X");
else
b6.setLabel("O");
count++;
b6.setEnabled(false);
n++;
String s4=b4.getLabel();
String s3=b3.getLabel();
String s6=b6.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s4.equals("X"))&&(s5.equals("X"))&&(s6.equals("X")))||((s3.equals("X"))&&(s6.equals("X"))&&(s9.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s4.equals("O"))&&(s5.equals("O"))&&(s6.equals("O")))||((s3.equals("O"))&&(s6.equals("O"))&&(s9.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b1.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b7)
{
if(count%2==0)
b7.setLabel("X");
else
b7.setLabel("O");
count++;
b7.setEnabled(false);
n++;
String s1=b1.getLabel();
String s8=b8.getLabel();
String s3=b3.getLabel();
String s4=b4.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s7.equals("X"))&&(s8.equals("X"))&&(s9.equals("X")))||((s1.equals("X"))&&(s4.equals("X"))&&(s7.equals("X")))||((s3.equals("X"))&&(s5.equals("X"))&&(s7.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s7.equals("O"))&&(s8.equals("O"))&&(s9.equals("O")))||((s1.equals("O"))&&(s4.equals("O"))&&(s7.equals("O")))||((s3.equals("O"))&&(s5.equals("O"))&&(s7.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b1.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b8)
{
if(count%2==0)
b8.setLabel("X");
else
b8.setLabel("O");
count++;
b8.setEnabled(false);
n++;
String s8=b8.getLabel();
String s2=b2.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s2.equals("X"))&&(s5.equals("X"))&&(s8.equals("X")))||((s7.equals("X"))&&(s8.equals("X"))&&(s9.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s2.equals("O"))&&(s5.equals("O"))&&(s8.equals("O")))||((s7.equals("O"))&&(s8.equals("O"))&&(s9.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b1.setEnabled(false);
b9.setEnabled(false);
}
}
if(e.getSource()==b9)
{
if(count%2==0)
b9.setLabel("X");
else
b9.setLabel("O");
count++;
b9.setEnabled(false);
n++;
String s1=b1.getLabel();
String s8=b8.getLabel();
String s3=b3.getLabel();
String s6=b6.getLabel();
String s7=b7.getLabel();
String s5=b5.getLabel();
String s9=b9.getLabel();
if(((s1.equals("X"))&&(s5.equals("X"))&&(s9.equals("X")))||((s7.equals("X"))&&(s8.equals("X"))&&(s9.equals("X")))||((s3.equals("X"))&&(s6.equals("X"))&&(s9.equals("X"))))
{
t3.setText(t1.getText()+" has won");
ptr=1;
}
if(((s1.equals("O"))&&(s5.equals("O"))&&(s9.equals("O")))||((s7.equals("O"))&&(s8.equals("O"))&&(s9.equals("O")))||((s3.equals("O"))&&(s6.equals("O"))&&(s9.equals("O"))))
{
t3.setText(t2.getText()+" has won");
ptr=1;
}
if(ptr==1)
{
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b1.setEnabled(false);
}
}
if((ptr==0)&&(n==9))
{
t3.setText("Draw!!!!");
}

}
}
