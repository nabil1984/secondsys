import java.awt.Graphics;

public class Sprite {
    
    int x,y;  // position
    
    public Sprite(){ // constructeur
        x = 200;  // toujours initialiser tous les champs
        y = 50;  // dans le constructeur
    }

    public void paint(Graphics g) { // méthode pour dessiner un sprite
        g.drawRect(x, y, 20, 20); // affiche un rectangle de 20 sur 20 en (x,y)
    }

    public void act() {
    }
}
