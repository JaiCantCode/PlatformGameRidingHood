package entity;

import java.awt.image.BufferedImage;

public class Entity {

    public int worldX;
    public int worldY;
    public int jumpHeight;
    public int horizontalSpeed;
    public double verticalSpeed;
    public double gravity;
    public int dashSpeed;

    public BufferedImage
            staticRight, staticLeft,
            left0,left1,left2,left3,left4,left5,
            right0,right1,right2,right3,right4,right5,
            rightPreJump0, rightPreJump1, rightJump0,rightJump1,rightJumpPeak,rightDecent0,rightDecent1,
            leftPreJump0, leftPreJump1, leftJump0,leftJump1,leftJumpPeak,leftDecent0,leftDecent1,
            leftFirstAttack0,leftFirstAttack1,leftFirstAttack2,leftFirstAttack3,leftFirstAttack4,leftFirstAttack5,leftFirstAttack6,
            leftSecondAttack0,leftSecondAttack1,leftSecondAttack2,leftSecondAttack3,leftSecondAttack4,
            leftThirdAttack0,leftThirdAttack1,leftThirdAttack2,leftThirdAttack3,leftThirdAttack4,leftThirdAttack5,
            leftFirstAirAttack0,leftFirstAirAttack1,leftFirstAirAttack2,
            leftSecondAirAttack0,leftSecondAirAttack1,leftSecondAirAttack2,leftSecondAirAttack3,
            rightFirstAttack0,rightFirstAttack1,rightFirstAttack2,rightFirstAttack3,rightFirstAttack4,rightFirstAttack5,rightFirstAttack6,
            rightSecondAttack0,rightSecondAttack1,rightSecondAttack2,rightSecondAttack3,rightSecondAttack4,
            rightThirdAttack0,rightThirdAttack1,rightThirdAttack2,rightThirdAttack3,rightThirdAttack4,rightThirdAttack5,
            rightFirstAirAttack0,rightFirstAirAttack1,rightFirstAirAttack2,
            rightSecondAirAttack0,rightSecondAirAttack1,rightSecondAirAttack2,rightSecondAirAttack3;

    public int spriteCounter = 0;
    public int spriteNum = 0;
    public int attackCounter = 0;
    public int attackNum = 0;
    public int airAttackCounter = 0;
    public int airAttackNum = 0;

    public String direction;
    boolean isFalling;
    boolean isJumping;
    boolean isInAir;
    boolean isMoving;
    boolean isAttacking;
}
