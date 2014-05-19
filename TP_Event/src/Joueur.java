import java.awt.Graphics;


public class Joueur {
	 int x,y;  // position
	    
	    public Joueur(int x,int y){ // constructeur
	        this.x = x;  // toujours initialiser tous les champs
	        this.y = y;  // dans le constructeur
	    }

	    public void paint(Graphics g) { // méthode pour dessiner un sprite
	        g.fillRect(x, y, 20, 60); // affiche un rectangle de 20 sur 20 en (x,y)
	    }

	    public void act() {
	    }

}
