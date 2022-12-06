import java.awt.*;

public class Cloud {

    public static void drawregularCloud(Graphics g){
        g.setColor(Color.white);
        g.fillOval(510,60,100,100);
        g.fillOval(585,30,100,100);
        g.fillOval(650,50,100,100);
        g.fillOval(530,65,200,100);


    }

    public static void drawstormyCloud(Graphics g){
        g.setColor(Color.lightGray);
        g.fillOval(410,60,100,100);
        g.fillOval(485,30,100,100);
        g.fillOval(450,50,100,100);
        g.fillOval(430,65,200,100);


    }

    public static void drawstormierCloud(Graphics g){
        g.setColor(Color.gray);
        g.fillOval(210,60,100,100);
        g.fillOval(285,30,100,100);
        g.fillOval(250,50,100,100);
        g.fillOval(230,65,200,100);


    }

    public static void drawlightingCloud(Graphics g){
        g.setColor(Color.darkGray);
        g.fillOval(110,60,100,100);
        g.fillOval(185,30,100,100);
        g.fillOval(150,50,100,100);
        g.fillOval(130,65,200,100);

        Polygon lightning = new Polygon();
        g.setColor(Color.yellow);
        lightning.addPoint(195,160);
        lightning.addPoint(210,160);
        lightning.addPoint(210,260);
        lightning.addPoint(220,260);
        lightning.addPoint(210,360);
        g.fillPolygon(lightning);


    }
}
