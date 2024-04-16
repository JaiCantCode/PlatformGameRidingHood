package Main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.security.Key;

public class BackGround {

    GamePanel gp;
    KeyHandler keyH;
    public BufferedImage backGround;
    public int x = 0,y = 0;
    public int backGroundWidth = 576;
    public int backGroundHeight = 324;
    public int scale;
    public int scaledBackGroundWidth;
    public int scaledBackGroundHeight;
    public int timesDraw = 2;

    public BackGround(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        scale = gp.screenHeight/backGroundHeight;
        scaledBackGroundHeight = gp.screenHeight;
        scaledBackGroundWidth = backGroundWidth*scale;

        getBackgroundImage();
    }

    public BufferedImage getImage(String name) throws IOException { return ImageIO.read(getClass().getResourceAsStream(name));}
    public void getBackgroundImage() {
        try {
            backGround = getImage("/background/Background.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update() {

    }

    public void draw(Graphics2D g2) {
        for(int i = 0; i < timesDraw; i++) {
            g2.drawImage(backGround,x + (scaledBackGroundWidth*i),y,scaledBackGroundWidth,scaledBackGroundHeight,null);
        }
    }


}
