import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener
{
int v1,v2;

TextField t1=new TextField(5);
TextField t2=new TextField(5);
TextField t3=new TextField(5);
Label l1=new Label("value 1:");
Label l2=new Label("value 2:");
Label l3=new Label("Result");

Button b1=new Button("+");
Button b2=new Button("-");
Button b3=new Button("x");
Button b4=new Button("/");
public void init()
{
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);

l1.setBounds(100,40,100,20);
t1.setBounds(210,40,100,20);
l2.setBounds(100,80,100,20);
t2.setBounds(210,80,100,20);
l3.setBounds(100,120,100,20);
t3.setBounds(210,120,100,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
v1=Integer.parseInt(t1.getText());
v2=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
t3.setText(String.valueOf(v1+v2));
if(e.getSource()==b2)
t3.setText(String.valueOf(v1-v2));
if(e.getSource()==b3)
t3.setText(String.valueOf(v1*v2));
if(e.getSource()==b3)
t3.setText(String.valueOf(v1/v2));
repaint();
}
}
