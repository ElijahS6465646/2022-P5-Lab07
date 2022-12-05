import java.applet.Applet;
import java.awt.*;

public class NatureScene extends Applet {
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);
        Background.drawSun(g);

        MountainRange.drawMountainRange(g);
        MountainRange.drawMountainSnow(g);

        Lake.drawShallow(g);
        Lake.drawShallowRocks(g);
        Lake.drawMurkyWater(g);
        Lake.drawKelp(g);



    }
}
