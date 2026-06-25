package Games;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;

public class spaceInvaders extends JPanel implements ActionListener, KeyListener {

    class Block {

        int x;
        int y;
        int width;
        int height;
        Image img;
        boolean alive = true; // for user
        boolean used = false; // for bullets
        int healthPerShipEnemies = 5;

        Block(int x, int y, int height, int width, Image img) {

            this.x = x;
            this.y = y;
            this.height = height;
            this.width = width;
            this.img = img;

        }

    }

    class Explosion {

        int x;
        int y;
        int width;
        int height;
        ImageIcon imgExplosion;
        boolean explosionFinished = false;

        Explosion(int x, int y, int height, int width, ImageIcon imgExplosion) {

            this.x = x;
            this.y = y;
            this.height = height;
            this.width = width;
            this.imgExplosion = imgExplosion;

        }

    }

    /*
     * 
     * The suitable size according to the laptop screen that should be applied after
     * the game completion
     
     int tilesize = 32;
    int frameWidth = 16;
    int frameHeight = 16;
     
     */



    int tilesize = 32;
    int frameWidth = 43;
    int frameHeight = 22;
     

    int screenHeight = tilesize * frameHeight;
    int screenWidth = tilesize * frameWidth;

    Block Galaxy;
    Block ship;
    Block enemyShip1_1;
    Block enemyShip1_2;
    Block enemyShip2;
    Block enemyShip3;
    Block bullet;
    Block shipEnemyBullets;

    Timer gameLoop;

    ArrayList<Image> shipEnemiesImages;

    spaceInvaders() {

        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(this);

        imgShipEnemy1_1 = new ImageIcon(getClass().getResource("/Games/Images/z_enemyShip1.png")).getImage();
        imgShipEnemy1_2 = new ImageIcon(getClass().getResource("/Games/Images/z_enemyShip1.png")).getImage();
        imgShipEnemy2 = new ImageIcon(getClass().getResource("/Games/Images/z_enemyShip2.png")).getImage();
        imgShipEnemy3 = new ImageIcon(getClass().getResource("/Games/Images/z_enemyShip3.png")).getImage();
        imgShip = new ImageIcon(getClass().getResource("/Games/Images/z_imgShip.png")).getImage();
        imgGalaxy = new ImageIcon(getClass().getResource("/Games/Images/z_imgSpaceGalaxy3-ezgif.com-optimize.gif")).getImage();
        imgShipBullets = new ImageIcon(getClass().getResource("/Games/Images/z_imgShipBullets5.png")).getImage();
        imgShipEnemyBullets = new ImageIcon(getClass().getResource("/Games/Images/z_imgShipEnemyBullets.png"))
                .getImage();

        shipEnemiesImages = new ArrayList<>();

        shipEnemiesImages.add(imgShipEnemy1_1);
        shipEnemiesImages.add(imgShipEnemy2);
        shipEnemiesImages.add(imgShipEnemy3);
        shipEnemiesImages.add(imgShipEnemy1_2);

        ship = new Block(shipX, shipY, shipHeight, shipWidth, imgShip);

        Galaxy = new Block(XgalaxyWidthPos, YgalaxyHeightPos, GalaxyHeight, GalaxyWidth, imgGalaxy);

        shipEnemies1Array = new ArrayList<>();

        shipEnemies2Array = new ArrayList<>();

        shipBulletsLinkedList = new LinkedList<>();

        shipEnemy1BulletsLinkedList = new LinkedList<>();

        shipsExplosionLinkedList = new LinkedList<>();



        Random random = new Random();

        shipEnemy1Rest = random.nextInt(shipsEnemyRows);
        shipEnemy2Rest = random.nextInt(shipsEnemyRows);

        ReloadTimeShipEnemy = new Timer(5000, e -> {

            shipEnemy1Rest = random.nextInt(shipEnemies1Array.size());
            shipEnemy2Rest = random.nextInt(shipEnemies2Array.size());

        });
        ReloadTimeShipEnemy.start();
        ;

        shipEnemyShootTimeBuffer = new Timer(500, e -> shipEnemyShoot());
        shipEnemyShootTimeBuffer.start();

        gameLoop = new Timer(1000 / 60, this);
        createShipEnemies();
        gameLoop.start();

        maxHealthShipEnemies = (shipEnemies1Array.size() + shipEnemies2Array.size()) * 5 ;
        totalHealthShipEnemies = maxHealthShipEnemies;


    
    }


    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {

        g.drawImage(Galaxy.img, Galaxy.x, Galaxy.y, Galaxy.width, Galaxy.height, null);

        g.drawImage(ship.img, ship.x, ship.y, ship.width, ship.height, null);

        for (int i = 0; i < shipEnemies1Array.size(); i++) {

            Block shipEnemies = shipEnemies1Array.get(i);
            if (shipEnemies.alive) {

                g.drawImage(shipEnemies.img, shipEnemies.x, shipEnemies.y, shipEnemies.width, shipEnemies.height, null);

            }

        }

        for (int j = 0; j < shipEnemies2Array.size(); j++) {

            Block shipEnemies2 = shipEnemies2Array.get(j);

            if (shipEnemies2.alive) {

                g.drawImage(shipEnemies2.img, shipEnemies2.x, shipEnemies2.y, shipEnemies2.width, shipEnemies2.height,
                        null);

            }

        }

        // bullets
        for (int i = 0; i < shipBulletsLinkedList.size(); i++) {

            Block bulletss = shipBulletsLinkedList.get(i);
            if (!bulletss.used) {

                g.drawImage(bulletss.img, bulletss.x, bulletss.y, bulletss.width, bulletss.height, null);

            }

        }

        for (int i = 0; i < shipEnemy1BulletsLinkedList.size(); i++) {

            Block shipEnemyImageDraw = shipEnemy1BulletsLinkedList.get(i);

            if (!shipEnemyImageDraw.used) {

                g.drawImage(
                        shipEnemyImageDraw.img,
                        shipEnemyImageDraw.x,
                        shipEnemyImageDraw.y,
                        shipEnemyImageDraw.width,
                        shipEnemyImageDraw.height,
                        null);
            }

        }



        for (int i = 0; i < shipsExplosionLinkedList.size(); i++) {

            Explosion shipsExplosion = shipsExplosionLinkedList.get(i);

            if (!shipsExplosion.explosionFinished) {

                g.drawImage(
                    shipsExplosion.imgExplosion.getImage(), 
                    shipsExplosion.x, 
                    shipsExplosion.y, 
                    shipsExplosion.width,
                    shipsExplosion.height,
                    this
                    );
                
            }
            
        }

        healthBarShipsEnemies(g);


}

    public void movements() {

        // ---- ENEMY 1 ----
        boolean hitBorder = false;

        for (int i = 0; i < shipEnemies1Array.size(); i++) {
            Block shipEnemy1Move = shipEnemies1Array.get(i);

            if (shipEnemy1Move.alive) {
                if (shipEnemy1Move.x + shipEnemy1Move.width >= screenWidth
                        || shipEnemy1Move.x <= 0) {
                    hitBorder = true;
                    break;
                }
            }
        }

        if (hitBorder) {
            shipEnemy1VelocityX *= -1;
        }

        for (int i = 0; i < shipEnemies1Array.size(); i++) {
            Block shipEnemy1Move = shipEnemies1Array.get(i);
            if (shipEnemy1Move.alive) {
                shipEnemy1Move.x += shipEnemy1VelocityX;
            }
        }

        // ---- ENEMY 2 ----
        hitBorder = false;

        for (int i = 0; i < shipEnemies2Array.size(); i++) {
            Block shipEnemy2Move = shipEnemies2Array.get(i);

            if (shipEnemy2Move.alive) {
                if (shipEnemy2Move.x + shipEnemy2Move.width >= screenWidth
                        || shipEnemy2Move.x <= 0) {
                    hitBorder = true;
                    break;
                }
            }
        }

        if (hitBorder) {
            shipEnemy2VelocityX *= -1;
        }

        for (int i = 0; i < shipEnemies2Array.size(); i++) {
            Block shipEnemy2Move = shipEnemies2Array.get(i);
            if (shipEnemy2Move.alive) {
                shipEnemy2Move.x += shipEnemy2VelocityX;

            }
        }

        // bullets

        for (int i = 0; i < shipBulletsLinkedList.size(); i++) {

            Block b = shipBulletsLinkedList.get(i);
            b.y += shipBulletsVelocityY;

            if (b.y > screenHeight || b.used ) {
                shipBulletsLinkedList.remove(i);
                i--;
            }
        }

        // enemyBullets

        for (int i = 0; i < shipEnemy1BulletsLinkedList.size(); i++) {

            Block shipEnemyBulletMove = shipEnemy1BulletsLinkedList.get(i);
            shipEnemyBulletMove.y -= shipBulletsVelocityY;

            if (shipEnemyBulletMove.y > screenHeight || shipEnemyBulletMove.used) {

                shipEnemy1BulletsLinkedList.remove(i);
                i--;
            }

        }

        // collision movement

        for (int j = 0; j < shipBulletsLinkedList.size(); j++) {

            Block bulletCollision = shipBulletsLinkedList.get(j);

            if (bulletCollision.used) {

                continue;

            }

            for (int i = 0; i < shipEnemies1Array.size(); i++) {

                Block BulletAndShipEnemyCollision = shipEnemies1Array.get(i);

                if (BulletAndShipEnemyCollision.alive
                        && collisionDetection(bulletCollision, BulletAndShipEnemyCollision)) {

                    bulletCollision.used = true;


                    BulletAndShipEnemyCollision.healthPerShipEnemies --;
                    totalHealthShipEnemies --;
                    spawnShipExplosion(BulletAndShipEnemyCollision);

                    if (BulletAndShipEnemyCollision.healthPerShipEnemies <= 0) {
                        
                    BulletAndShipEnemyCollision.alive = false;
                    spawnShipExplosion(BulletAndShipEnemyCollision);
                    shipEnemyCount--;                        

                    }

                    break;
                }

            }

        }

        for (int j = 0; j < shipBulletsLinkedList.size(); j++) {

            Block bulletCollision2 = shipBulletsLinkedList.get(j);

            if (bulletCollision2.used) {

                continue;

            }

            for (int i = 0; i < shipEnemies2Array.size(); i++) {

                Block BulletAndShipEnemyCollision2 = shipEnemies2Array.get(i);

                if (BulletAndShipEnemyCollision2.alive
                        && collisionDetection(bulletCollision2, BulletAndShipEnemyCollision2)) {

                    bulletCollision2.used = true;

                    
                    BulletAndShipEnemyCollision2.healthPerShipEnemies --;
                    totalHealthShipEnemies --;
                    spawnShipExplosion(BulletAndShipEnemyCollision2);

                    if (BulletAndShipEnemyCollision2.healthPerShipEnemies <= 0) {
                        
                    BulletAndShipEnemyCollision2.alive = false;
                    spawnShipExplosion(BulletAndShipEnemyCollision2);
                    shipEnemyCount2--;                        

                    }

                    break;
                }

            }

        }

    }

    public void createShipEnemies() {

        Random random = new Random();

        for (int r = 0; r < shipsEnemyRows; r++) {

            int randomIndex1ImgArray = random.nextInt(shipEnemiesImages.size());

            Block shipEnemies1 = new Block(
                    XshipEnemy1WidthPos + r * shipEnemyWidth,
                    YshipEnemyHeightPos,
                    shipEnemyHeight,
                    shipEnemyWidth,
                    shipEnemiesImages.get(randomIndex1ImgArray));

            shipEnemies1Array.add(shipEnemies1);

        }

        for (int rr = 0; rr < shipsEnemyRows; rr++) {

            int randomIndex2ImgArray = random.nextInt(shipEnemiesImages.size());

            Block shipEnemy2 = new Block(
                    XshipEnemy2WidthPos - rr * shipEnemyWidth,
                    YshipEnemy2HeightPos,
                    shipEnemyHeight,
                    shipEnemyWidth,
                    shipEnemiesImages.get(randomIndex2ImgArray));

            shipEnemies2Array.add(shipEnemy2);

        }

        shipEnemyCount = shipEnemies1Array.size();
        shipEnemyCount2 = shipEnemies2Array.size();

    }


    public void healthBarShipsEnemies( Graphics g ){

        int healthBarHeight = 18;
        int healthBarWidth = 400;

        int healthBarX = screenWidth / 2 - healthBarWidth / 2;
        int healthBarY = 12;


        g.setColor(new Color(60,0,0));
        g.fill3DRect(healthBarX, healthBarY, healthBarWidth, healthBarHeight, getFocusTraversalKeysEnabled());

        int filledHealthWidth = (int)((double) totalHealthShipEnemies / maxHealthShipEnemies * healthBarWidth );

        double healthPercentShipEnemies = (double) totalHealthShipEnemies / maxHealthShipEnemies; 

        if (healthPercentShipEnemies > 0.6) {
            
            g.setColor(new Color(220,0,0)); // red

        } else if (healthPercentShipEnemies > 0.3) {
            
            g.setColor(new Color(255,180,0)); // orange

        }else{

            g.setColor(new Color(0,220,0)); // green

        }


        g.fill3DRect(healthBarX, healthBarY, filledHealthWidth, healthBarHeight, getFocusTraversalKeysEnabled());

        g.setColor(Color.WHITE);
        g.setFont(new Font( "Arial", Font.BOLD, 12 ));
        String label = "ENEMY HEALTH | " + totalHealthShipEnemies + " / " + maxHealthShipEnemies;

        FontMetrics fm = g.getFontMetrics();
        int textX = screenWidth / 2 - fm.stringWidth(label) / 2;
        g.drawString(label, textX, healthBarHeight + 7);
        

    }



    public void shipEnemyShoot() {

        for (int i = 0; i < shipEnemies1Array.size(); i++) {

            Block shipEnemyBulletsBlock = shipEnemies1Array.get(i);

            if (shipEnemyBulletsBlock.alive && i != shipEnemy1Rest) {

                Block shipEnemyBullets = new Block(
                        shipEnemyBulletsBlock.x + shipEnemyBulletsBlock.width / 2 - shipEnemy1BulletsWidth / 2,
                        shipEnemyBulletsBlock.y + shipEnemyBulletsBlock.height,
                        shipEnemy1BulletsHeight,
                        shipEnemy1BulletsWidth,
                        imgShipEnemyBullets);

                shipEnemy1BulletsLinkedList.add(shipEnemyBullets);

            }

        }

        for (int i = 0; i < shipEnemies2Array.size(); i++) {

            Block shipEnemyBullets2Block = shipEnemies2Array.get(i);

            if (shipEnemyBullets2Block.alive && i != shipEnemy2Rest) {

                Block shipEnemy2Bullets = new Block(
                        shipEnemyBullets2Block.x + shipEnemyBullets2Block.width / 2 - shipEnemy1BulletsWidth / 2,
                        shipEnemyBullets2Block.y + shipEnemyBullets2Block.height,
                        shipEnemy1BulletsHeight,
                        shipEnemy1BulletsWidth,
                        imgShipEnemyBullets);

                shipEnemy1BulletsLinkedList.add(shipEnemy2Bullets);

            }

        }

    }

    public boolean collisionDetection(Block a, Block b) {

        int paddingA = 10;
        int paddingB = b.width / 4;

        return (a.x + paddingA) < (b.x + b.width - paddingB) &&
                (a.x + a.width - paddingA) > (b.x + paddingB) &&
                (a.y + paddingA) < (b.y + b.height - paddingB) &&
                (a.y + a.height - paddingA) > (b.y + paddingB);

    }



    public void spawnShipExplosion(Block shipsExplosion){


        ImageIcon ExplosionShipsGif = new ImageIcon(getClass().getResource(explosionGifPath));

        Explosion ExplosionShips = new Explosion(
            shipsExplosion.x, 
            shipsExplosion.y, 
            shipsExplosion.height, 
            shipsExplosion.width, 
            ExplosionShipsGif
            );

        shipsExplosionLinkedList.add(ExplosionShips);

            Timer removeTimerShipsExplosion = new Timer(explosionDuration, e -> {
        ExplosionShips.explosionFinished = true;
        shipsExplosionLinkedList.remove(ExplosionShips);
    });

        removeTimerShipsExplosion.setRepeats(false); // only fires once
        removeTimerShipsExplosion.start();


    }


    Image imgShipEnemy1_1;
    Image imgShipEnemy1_2;
    Image imgShipEnemy2;
    Image imgShipEnemy3;
    Image imgShip;
    Image imgGalaxy;
    Image imgShipBullets;
    Image imgShipEnemyBullets;

    // ship

    int shipHeight = tilesize * 5;
    int shipWidth = tilesize * 3;

    int shipX = screenWidth / 2 - shipWidth / 2;
    int shipY = screenHeight - tilesize * 5;
    int shipVelocityX = tilesize;

    // shipEnemySize

    ArrayList<Block> shipEnemies1Array;
    ArrayList<Block> shipEnemies2Array;

    int shipEnemyHeight = tilesize * 2;
    int shipEnemyWidth = tilesize * 2;

    // shipEnemyPosition

    int YshipEnemyHeightPos = screenHeight / screenHeight + tilesize * 2;
    int XshipEnemy1WidthPos = screenWidth / screenWidth;

    int YshipEnemy2HeightPos = screenHeight / screenHeight + tilesize * 6;
    int XshipEnemy2WidthPos = screenWidth - tilesize * 2;

    int shipsEnemyRows = 4;

    int shipEnemyCount = 0;
    int shipEnemyCount2 = 0;

    int shipEnemy1VelocityX = 3; // speed of movement
    int shipEnemy2VelocityX = 3;

    // Galaxy

    int GalaxyHeight = screenHeight;
    int GalaxyWidth = screenWidth;

    int YgalaxyHeightPos = screenHeight / screenHeight;
    int XgalaxyWidthPos = screenWidth / screenWidth;

    // bullets for ship;

    LinkedList<Block> shipBulletsLinkedList;
    int shipBulletsWidth = tilesize;
    int shipBulletsHeight = tilesize * 3;
    int shipBulletsVelocityY = -10; // <-- speed and opposite direction travel


    //health for player ship

    int healthShipPlayer = 10;
    int maxHealthShipPlayer;
    int totalHealthShipPlayer;


    //Health bar for enemyships

    int healthShipEnemies = 5;
    int maxHealthShipEnemies;
    int totalHealthShipEnemies;


    // bullets for Enemy ships

    LinkedList<Block> shipEnemy1BulletsLinkedList;
    int shipEnemy1BulletsWidth = tilesize;
    int shipEnemy1BulletsHeight = tilesize * 3;
    int shipEnemy1VelocityY = -15; // speed and opposite direction travel

    // decides which 1 ship Enemy is on resting time while shooting

    int shipEnemy1Rest = 0;
    int shipEnemy2Rest = 0;

    Timer ReloadTimeShipEnemy;
    Timer shipEnemyShootTimeBuffer;

    // Explosion ships

    LinkedList<Explosion> shipsExplosionLinkedList;
    int explosionDuration = 1350;
    String explosionGifPath = "/Games/Images/explosionShipsVids.gif";
    int shipExplosionHeight = tilesize * 2;
    int shipExplosionWidth = tilesize * 2;




    @Override
    public void actionPerformed(ActionEvent e) {

        movements();
        repaint();

    }


    //Keys Distribution for different task to be performed by USER for PC.

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT && ship.x - shipVelocityX >= 0) {

            ship.x -= shipVelocityX;

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && ship.x + shipWidth < screenWidth) {

            ship.x += shipVelocityX;

        }

        else if (e.getKeyCode() == KeyEvent.VK_A && ship.x - shipVelocityX >= 0) {

            ship.x -= shipVelocityX;

        } else if (e.getKeyCode() == KeyEvent.VK_D && ship.x + shipWidth < screenWidth) {

            ship.x += shipVelocityX;

        }

        else if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            bullet = new Block(ship.x + shipWidth / 2 - shipBulletsWidth / 2, ship.y, shipBulletsHeight,
                    shipBulletsWidth, imgShipBullets);
            shipBulletsLinkedList.add(bullet);
        }

    }

}
