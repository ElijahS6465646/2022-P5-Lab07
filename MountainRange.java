import java.awt.*;
public class MountainRange {
    public static void drawMountainRange (Graphics g){
        g.setColor(Color.darkGray);
        Polygon mountain = new Polygon();
        mountain.addPoint(0,600);
        mountain.addPoint(100,400);
        mountain.addPoint(200,600);
        mountain.addPoint(200,600);
        mountain.addPoint(300,400);
        mountain.addPoint(400,600);
        mountain.addPoint(400,600);
        mountain.addPoint(500,400);
        mountain.addPoint(600,600);
        mountain.addPoint(600,600);
        mountain.addPoint(700,400);
        mountain.addPoint(800,600);
        mountain.addPoint(800,600);
        mountain.addPoint(900,400);
        mountain.addPoint(1000,600);
        mountain.addPoint(1000,600);


        g.fillPolygon(mountain);

    }


    public static void drawMountainSnow(Graphics g){
        g.setColor(Color.white);
        Polygon snow = new Polygon();
        snow.addPoint(50,500);
        snow.addPoint(100,400);
        snow.addPoint(150,500);
        g.fillPolygon(snow);

        Polygon snow2 = new Polygon();
        snow2.addPoint(250,500);
        snow2.addPoint(300,400);
        snow2.addPoint(350,500);
        g.fillPolygon(snow2);

        Polygon snow3 = new Polygon();
        snow3.addPoint(450,500);
        snow3.addPoint(500,400);
        snow3.addPoint(550,500);
        g.fillPolygon(snow3);

        Polygon snow4 = new Polygon();
        snow4.addPoint(650,500);
        snow4.addPoint(700,400);
        snow4.addPoint(750,500);

        Polygon snow5 = new Polygon();
        snow5.addPoint(650,500);
        snow5.addPoint(700,400);
        snow5.addPoint(750,500);
        g.fillPolygon(snow5);

        Polygon snow6 = new Polygon();
        snow6.addPoint(850,500);
        snow6.addPoint(900,400);
        snow6.addPoint(950,500);
        g.fillPolygon(snow6);
    }
}
