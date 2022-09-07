package fish;

import java.awt.*;

public class Bg {
    void paintSelf(Graphics g , int fishLevel){
        g.drawImage(GameUtils.bg,0,0,null);
        switch (GameWin.state){
            case 0:
                GameUtils.drawWord(g,"鼠标点击开始游戏",Color.red,80,400,500);
                GameUtils.drawWord(g,"使用wasd进行移动",Color.red,60,500,600);
                break;
            case 1:
                GameUtils.drawWord(g,"积分"+GameUtils.count,Color.ORANGE,50,200,120);
                GameUtils.drawWord(g,"难度"+GameUtils.level,Color.ORANGE,50,600,120);
                GameUtils.drawWord(g,"等级"+fishLevel,Color.ORANGE,50,1000,120);
                break;
            case 2:
                GameUtils.drawWord(g,"积分"+GameUtils.count,Color.ORANGE,50,200,120);
                GameUtils.drawWord(g,"难度"+GameUtils.level,Color.ORANGE,50,600,120);
                GameUtils.drawWord(g,"等级"+fishLevel,Color.ORANGE,50,1000,120);
                GameUtils.drawWord(g,"失败",Color.red,80,700,500);
                break;
            case 3:
                GameUtils.drawWord(g,"积分"+GameUtils.count,Color.ORANGE,50,200,120);
                GameUtils.drawWord(g,"难度"+GameUtils.level,Color.ORANGE,50,600,120);
                GameUtils.drawWord(g,"等级"+fishLevel,Color.ORANGE,50,1000,120);
                GameUtils.drawWord(g ,"胜利",Color.red,80,700,500);
                break;
            case 4:
                GameUtils.drawWord(g,"积分"+GameUtils.count,Color.ORANGE,50,200,120);
                GameUtils.drawWord(g,"难度"+GameUtils.level,Color.ORANGE,50,600,120);
                GameUtils.drawWord(g,"等级"+fishLevel,Color.ORANGE,50,1000,120);
                default:

        }
    }
}
