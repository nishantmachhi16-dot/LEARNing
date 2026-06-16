package Games;
import javax.swing.JFrame;

public class Frames{
 
public static void main(String args[]){


    
int tilesize  = 32;
int width = 16;
int height  = 16;


int screenHeight = tilesize * height;
int screenWidth = tilesize * width;
    
    JFrame newgame = new JFrame("Space invaders");

    newgame.setAlwaysOnTop(false);

    newgame.setSize(screenHeight, screenWidth);
    
    newgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    spaceInvaders frame1 = new spaceInvaders();
    
    newgame.add(frame1);
    frame1.requestFocus();
    newgame.pack();

    newgame.setLocationRelativeTo(null);

    newgame.setVisible(true);

}

}