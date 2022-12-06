import java.applet.Applet;
import java.awt.*;

public class NatureScene extends Applet {
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);
        Background.drawSun(g);

        MountainRange.drawMountainRange(g);
        MountainRange.drawMountainSnow(g);

        Cloud.drawregularCloud(g);
        Cloud.drawstormyCloud(g);
        Cloud.drawstormierCloud(g);
        Cloud.drawlightingCloud(g);



    }
}
