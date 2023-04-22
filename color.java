import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class color extends Applet implements ItemListener{

Label lb1=new Label("Select background colour :");
Choice color=new Choice();
String str="";
public void init()
{
add(lb1);
color.addItem("red");
color.addItem("blue");
color.addItem("green");
color.addItem("pink");
color.addItem("black");
add(color);
color.addItemListener(this);
}

public void itemStateChanged(ItemEvent e)
{
String c=color.getSelectedItem();
switch(c)
{
case "red"  :  setBackground(Color.red);
             break;
case "blue" :  setBackground(Color.blue);
             break;
case "green":  setBackground(Color.green);
             break;
case "pink" :  setBackground(Color.pink);
             break;
case "black":  setBackground(Color.black);
             break;
default     :  setBackground(Color.white);
             

}
}
}