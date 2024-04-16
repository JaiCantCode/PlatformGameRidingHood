package entity;

import Main.GamePanel;
import Main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;
    int characterSizeScale = 4;
    int characterWidth = 50*characterSizeScale;
    int characterHeight = 36*characterSizeScale;

    public final int screenX;
    public int screenY;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();

        screenX = (gp.screenWidth/2) - (characterWidth/2);
        screenY = worldY;

        getPlayerImage();
    }

    public void setDefaultValues() {
        worldX = (gp.screenWidth/2) - (characterWidth/2);
        worldY = (gp.screenHeight/2) - (characterHeight/2);
        jumpHeight = 12;
        horizontalSpeed = 6;
        verticalSpeed = 5;
        gravity = 0.75;
        direction = "right";
        isMoving = false;
        isAttacking = false;
        dashSpeed = 5;
    }

    public void getPlayerImage() {
        try {
            //Right
            staticRight = getImage("/player/RightFacingRH/RightFacingRH00.png");
            right0 = getImage("/player/RightFacingRH/RightFacingRH01.png");
            right1 = getImage("/player/RightFacingRH/RightFacingRH02.png");
            right2 = getImage("/player/RightFacingRH/RightFacingRH03.png");
            right3 = getImage("/player/RightFacingRH/RightFacingRH04.png");
            right4 = getImage("/player/RightFacingRH/RightFacingRH05.png");
            right5 = getImage("/player/RightFacingRH/RightFacingRH06.png");
            rightPreJump0 = getImage("/player/RightFacingRH/RightFacingRH07.png");
            rightPreJump1 = getImage("/player/RightFacingRH/RightFacingRH08.png");
            rightJump0 = getImage("/player/RightFacingRH/RightFacingRH09.png");
            rightJump1 = getImage("/player/RightFacingRH/RightFacingRH10.png");
            rightJumpPeak = getImage("/player/RightFacingRH/RightFacingRH11.png");
            rightDecent0 = getImage("/player/RightFacingRH/RightFacingRH12.png");
            rightDecent1 = getImage("/player/RightFacingRH/RightFacingRH13.png");
            rightFirstAttack0 = getImage("/player/RightFacingRH/RightFacingRH18.png");
            rightFirstAttack1 = getImage("/player/RightFacingRH/RightFacingRH19.png");
            rightFirstAttack2 = getImage("/player/RightFacingRH/RightFacingRH20.png");
            rightFirstAttack3 = getImage("/player/RightFacingRH/RightFacingRH21.png");
            rightFirstAttack4 = getImage("/player/RightFacingRH/RightFacingRH22.png");
            rightFirstAttack5 = getImage("/player/RightFacingRH/RightFacingRH23.png");
            rightFirstAttack6 = getImage("/player/RightFacingRH/RightFacingRH24.png");
            rightSecondAttack0 = getImage("/player/RightFacingRH/RightFacingRH25.png");
            rightSecondAttack1 = getImage("/player/RightFacingRH/RightFacingRH26.png");
            rightSecondAttack2 = getImage("/player/RightFacingRH/RightFacingRH27.png");
            rightSecondAttack3 = getImage("/player/RightFacingRH/RightFacingRH28.png");
            rightSecondAttack4 = getImage("/player/RightFacingRH/RightFacingRH29.png");
            rightThirdAttack0 = getImage("/player/RightFacingRH/RightFacingRH30.png");
            rightThirdAttack1 = getImage("/player/RightFacingRH/RightFacingRH31.png");
            rightThirdAttack2 = getImage("/player/RightFacingRH/RightFacingRH32.png");
            rightThirdAttack3 = getImage("/player/RightFacingRH/RightFacingRH33.png");
            rightThirdAttack4 = getImage("/player/RightFacingRH/RightFacingRH34.png");
            rightThirdAttack5 = getImage("/player/RightFacingRH/RightFacingRH35.png");
            rightFirstAirAttack0 = getImage("/player/RightFacingRH/RightFacingRH40.png");
            rightFirstAirAttack1 = getImage("/player/RightFacingRH/RightFacingRH41.png");
            rightFirstAirAttack2 = getImage("/player/RightFacingRH/RightFacingRH42.png");
            rightSecondAirAttack0 = getImage("/player/RightFacingRH/RightFacingRH43.png");
            rightSecondAirAttack1 = getImage("/player/RightFacingRH/RightFacingRH44.png");
            rightSecondAirAttack2 = getImage("/player/RightFacingRH/RightFacingRH45.png");
            rightSecondAirAttack3 = getImage("/player/RightFacingRH/RightFacingRH46.png");

            //Left
            staticLeft = getImage("/player/LeftFacingRH/LeftFacingRH00.png");
            left0 = getImage("/player/LeftFacingRH/LeftFacingRH01.png");
            left1 = getImage("/player/LeftFacingRH/LeftFacingRH02.png");
            left2 = getImage("/player/LeftFacingRH/LeftFacingRH03.png");
            left3 = getImage("/player/LeftFacingRH/LeftFacingRH04.png");
            left4 = getImage("/player/LeftFacingRH/LeftFacingRH05.png");
            left5 = getImage("/player/LeftFacingRH/LeftFacingRH06.png");
            leftPreJump0 = getImage("/player/LeftFacingRH/LeftFacingRH07.png");
            leftPreJump1 = getImage("/player/LeftFacingRH/LeftFacingRH08.png");
            leftJump0 = getImage("/player/LeftFacingRH/LeftFacingRH09.png");
            leftJump1 = getImage("/player/LeftFacingRH/LeftFacingRH10.png");
            leftJumpPeak = getImage("/player/LeftFacingRH/LeftFacingRH11.png");
            leftDecent0 = getImage("/player/LeftFacingRH/LeftFacingRH12.png");
            leftDecent1 = getImage("/player/LeftFacingRH/LeftFacingRH13.png");
            leftFirstAttack0 = getImage("/player/LeftFacingRH/LeftFacingRH18.png");
            leftFirstAttack1 = getImage("/player/LeftFacingRH/LeftFacingRH19.png");
            leftFirstAttack2 = getImage("/player/LeftFacingRH/LeftFacingRH20.png");
            leftFirstAttack3 = getImage("/player/LeftFacingRH/LeftFacingRH21.png");
            leftFirstAttack4 = getImage("/player/LeftFacingRH/LeftFacingRH22.png");
            leftFirstAttack5 = getImage("/player/LeftFacingRH/LeftFacingRH23.png");
            leftFirstAttack6 = getImage("/player/LeftFacingRH/LeftFacingRH24.png");
            leftSecondAttack0 = getImage("/player/LeftFacingRH/LeftFacingRH25.png");
            leftSecondAttack1 = getImage("/player/LeftFacingRH/LeftFacingRH26.png");
            leftSecondAttack2 = getImage("/player/LeftFacingRH/LeftFacingRH27.png");
            leftSecondAttack3 = getImage("/player/LeftFacingRH/LeftFacingRH28.png");
            leftSecondAttack4 = getImage("/player/LeftFacingRH/LeftFacingRH29.png");
            leftThirdAttack0 = getImage("/player/LeftFacingRH/LeftFacingRH30.png");
            leftThirdAttack1 = getImage("/player/LeftFacingRH/LeftFacingRH31.png");
            leftThirdAttack2 = getImage("/player/LeftFacingRH/LeftFacingRH32.png");
            leftThirdAttack3 = getImage("/player/LeftFacingRH/LeftFacingRH33.png");
            leftThirdAttack4 = getImage("/player/LeftFacingRH/LeftFacingRH34.png");
            leftThirdAttack5 = getImage("/player/LeftFacingRH/LeftFacingRH35.png");
            leftFirstAirAttack0 = getImage("/player/LeftFacingRH/LeftFacingRH40.png");
            leftFirstAirAttack1 = getImage("/player/LeftFacingRH/LeftFacingRH41.png");
            leftFirstAirAttack2 = getImage("/player/LeftFacingRH/LeftFacingRH42.png");
            leftSecondAirAttack0 = getImage("/player/LeftFacingRH/LeftFacingRH43.png");
            leftSecondAirAttack1 = getImage("/player/LeftFacingRH/LeftFacingRH44.png");
            leftSecondAirAttack2 = getImage("/player/LeftFacingRH/LeftFacingRH45.png");
            leftSecondAirAttack3 = getImage("/player/LeftFacingRH/LeftFacingRH46.png");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BufferedImage getImage(String name) throws IOException { return ImageIO.read(getClass().getResourceAsStream(name));}

    public void update() {

        int originalX = worldX;
        int originalY = worldY;
        switch (keyH.leftPressed + "-" + keyH.upPressed + "-" + keyH.rightPressed) {
            case "true-false-false"-> { direction = "left"; worldX -= horizontalSpeed;}
            case "false-false-true"-> { direction = "right"; worldX += horizontalSpeed;}
            case "false-true-false", "true-true-true" -> {
                if(worldY + characterHeight >= gp.screenHeight) {
                    verticalSpeed -= jumpHeight;
                    worldY -= jumpHeight;
                }
            }
            case "true-true-false" -> {
                direction = "left";
                worldX -= horizontalSpeed*1.5;
                if(worldY + characterHeight >= gp.screenHeight) {
                    verticalSpeed -= jumpHeight;
                    worldY -= jumpHeight;
                }
            }
            case "false-true-true" -> {
                direction = "right";
                worldX += horizontalSpeed*1.5;
                if(worldY + characterHeight >= gp.screenHeight) {
                    verticalSpeed -= jumpHeight;
                    worldY -= jumpHeight;
                }
            }
        }

        //GRAVITY
        worldY += verticalSpeed;
        verticalSpeed += gravity;
        if(worldY + characterHeight >= gp.screenHeight) {
            worldY = gp.screenHeight - characterHeight;
            verticalSpeed = 0;
            isFalling = false;
            isInAir = false;
        }

        //JUMP TIMER
        //TO-DO

        //JUMP ANIMATION
        if(verticalSpeed < 0) {
            isJumping = true;
            isFalling = false;
            isInAir = true;
        } else if (verticalSpeed > 0) {
            isJumping = false;
            isFalling = true;
            isInAir = true;
        }

        //ATTACKING ANIMATION
        if(keyH.attacking) {
            if(!isInAir) {
                worldX = originalX;
                attackCounter++;
                if (attackCounter > 5) {
                    if (attackNum == 17) {
                        attackNum = 0;
                    } else {
                        attackNum++;
                    }
                    attackCounter = 0;
                }
            }else{
                airAttackCounter++;
                if (airAttackCounter > 6) {
                    if (airAttackNum == 6) {
                        airAttackNum = 0;
                    } else {
                        airAttackNum++;
                    }
                    airAttackCounter = 0;
                }
            }
            isAttacking = true;
        }else{
            airAttackNum = 0;
            attackNum = 0;
            isAttacking = false;
        }

        //MOVEMENT ANIMATION
        if(keyH.leftPressed || keyH.rightPressed || keyH.upPressed || isFalling || isJumping) {
            spriteCounter++;
            if (spriteCounter > 4) {
                if (spriteNum == 5) {
                    spriteNum = 0;
                } else {
                    spriteNum++;
                }
                spriteCounter = 0;
            }
            isMoving = true;
        }else isMoving = false;
        screenY = worldY;
    }
    public void draw(Graphics2D g2) {

        BufferedImage image = null;
        if(!isAttacking) {
            if (isMoving) {
                if (isJumping) {
                    switch (direction) {
                        case "left" -> {
                            if (spriteNum == 0) image = leftJump0;
                            else image = leftJump1;
                        }
                        case "right" -> {
                            if (spriteNum == 0) image = rightJump0;
                            else image = rightJump1;
                        }
                    }
                } else if (isFalling) {
                    switch (direction) {
                        case "left" -> {
                            if (spriteNum % 2 == 0) image = leftDecent0;
                            else image = leftDecent1;
                        }
                        case "right" -> {
                            if (spriteNum % 2 == 0) image = rightDecent0;
                            else image = rightDecent1;
                        }
                    }
                } else {
                    switch (direction) {
                        case "left" -> {
                            if (spriteNum == 0) image = left0;
                            if (spriteNum == 1) image = left1;
                            if (spriteNum == 2) image = left2;
                            if (spriteNum == 3) image = left3;
                            if (spriteNum == 4) image = left4;
                            if (spriteNum == 5) image = left5;
                        }
                        case "right" -> {
                            if (spriteNum == 0) image = right0;
                            if (spriteNum == 1) image = right1;
                            if (spriteNum == 2) image = right2;
                            if (spriteNum == 3) image = right3;
                            if (spriteNum == 4) image = right4;
                            if (spriteNum == 5) image = right5;
                        }
                    }
                }
            } else {
                switch (direction) {
                    case "left" -> image = staticLeft;
                    case "right" -> image = staticRight;
                }
            }
        }else{
            image = ifAttacking();
        }

        g2.drawImage(image,screenX,screenY,characterWidth,characterHeight,null);
    }

    public BufferedImage ifAttacking() {
        BufferedImage image = null;
        if(isAttacking) {
            switch (direction) {
                case "left" -> {
                    if(isInAir) {
                        if (airAttackNum == 0) image = leftFirstAirAttack0;
                        if (airAttackNum == 1) image = leftFirstAirAttack1;
                        if (airAttackNum == 2) image = leftFirstAirAttack2;
                        if (airAttackNum == 4) image = leftSecondAirAttack0;
                        if (airAttackNum == 5) image = leftSecondAirAttack1;
                        if (airAttackNum == 6) image = leftSecondAirAttack2;
                        if (airAttackNum == 3) image = leftSecondAirAttack3;
                    }else{
                        if (attackNum == 0) image = leftFirstAttack0;
                        if (attackNum == 1) image = leftFirstAttack1;
                        if (attackNum == 2) image = leftFirstAttack2;
                        if (attackNum == 3) { image = leftFirstAttack3; worldX -= dashSpeed; }
                        if (attackNum == 4) image = leftFirstAttack4;
                        if (attackNum == 5) image = leftFirstAttack5;
                        if (attackNum == 6) image = leftFirstAttack6;
                        if (attackNum == 7) image = leftSecondAttack0;
                        if (attackNum == 8) image = leftSecondAttack1;
                        if (attackNum == 9) { image = leftSecondAttack2; worldX -= dashSpeed; }
                        if (attackNum == 10) image = leftSecondAttack3;
                        if (attackNum == 11) image = leftSecondAttack4;
                        if (attackNum == 12) { image = leftThirdAttack0; worldX -= dashSpeed/2; }
                        if (attackNum == 13) { image = leftThirdAttack1; worldX -= dashSpeed/2; }
                        if (attackNum == 14){ image = leftThirdAttack2; worldX -= dashSpeed*2; }
                        if (attackNum == 15) image = leftThirdAttack3;
                        if (attackNum == 16) image = leftThirdAttack4;
                        if (attackNum == 17) image = leftThirdAttack5;
                    }
                }
                case "right" -> {
                    if(isInAir) {
                        if (airAttackNum == 0) image = rightFirstAirAttack0;
                        if (airAttackNum == 1) image = rightFirstAirAttack1;
                        if (airAttackNum == 2) image = rightFirstAirAttack2;
                        if (airAttackNum == 3) image = rightSecondAirAttack0;
                        if (airAttackNum == 4) image = rightSecondAirAttack1;
                        if (airAttackNum == 5) image = rightSecondAirAttack2;
                        if (airAttackNum == 6) image = rightSecondAirAttack3;
                    }else{
                        if (attackNum == 0) image = rightFirstAttack0;
                        if (attackNum == 1) image = rightFirstAttack1;
                        if (attackNum == 2) image = rightFirstAttack2;
                        if (attackNum == 3) { image = rightFirstAttack3; worldX += dashSpeed; }
                        if (attackNum == 4) image = rightFirstAttack4;
                        if (attackNum == 5) image = rightFirstAttack5;
                        if (attackNum == 6) image = rightFirstAttack6;
                        if (attackNum == 7) image = rightSecondAttack0;
                        if (attackNum == 8) image = rightSecondAttack1;
                        if (attackNum == 9) { image = rightSecondAttack2; worldX += dashSpeed; }
                        if (attackNum == 10) image = rightSecondAttack3;
                        if (attackNum == 11) image = rightSecondAttack4;
                        if (attackNum == 12) { image = rightThirdAttack0; worldX += dashSpeed/2; }
                        if (attackNum == 13) { image = rightThirdAttack1; worldX += dashSpeed/2; }
                        if (attackNum == 14) { image = rightThirdAttack2; worldX += dashSpeed*2; }
                        if (attackNum == 15) image = rightThirdAttack3;
                        if (attackNum == 16) image = rightThirdAttack4;
                        if (attackNum == 17) image = rightThirdAttack5;
                    }
                }
            }
        }
        return image;
    }
}
