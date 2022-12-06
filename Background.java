import java.awt.*;


public class Background {
    public static void drawSun(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(795,10,200,200);

    }

    public static void drawGround(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0,600,2000,900);

    }

    public static void drawSky(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,0,2000,600);


    }


}
