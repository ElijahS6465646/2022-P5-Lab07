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
        mountain.addPoint(1100,400);
        mountain.addPoint(1200,600);
        mountain.addPoint(600,600);

        g.fillPolygon(mountain);

    }


    public static void drawMountainSnow(Graphics g){


    }
}
