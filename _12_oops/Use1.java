package _12_oops;
import java.awt.*;
import java.applet.*;

public class Use1 extends Applet {
    public void init(){
        setBackground(Color.black);
    }
    public void paint(Graphics g){
        g.drawString("SMS", 100, 100);
    }
}
