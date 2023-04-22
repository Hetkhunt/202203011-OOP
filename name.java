import java.applet.*;
import java.util.*;
import java.awt.*;
public class name extends Applet{
Scanner sc=new Scanner(System.in);
String str=sc.next();
public void paint(Graphics x)
{


Font obj=new Font("Times new roman",Font.BOLD,20);

x.setFont(obj);
x.setColor(Color.blue);
x.drawString("Hello  "+str,250,250);
}
}