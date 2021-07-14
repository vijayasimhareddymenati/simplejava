

import  java.applet.Applet;
import  java.awt.*;
public class ColorDemo extends Applet{
    
/*< applet code ="colorDemo"  width="500"  height="800">
</applet>*/
       
public void init(){
       Graphics m = new Graphics();
        Setbackground(Color.black);
       SetForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("welcome adavanced java", 50, 50);
    }
}
