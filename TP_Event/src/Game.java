 import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Game extends JComponent implements KeyListener,MouseListener {
    
    Sprite sprite;
    Joueur j1;

    public Game(Dimension d){

        setPreferredSize(d);
        setSize(d);
        
        sprite = new Sprite();
        j1=new Joueur(400,200);
        
        this.addKeyListener((KeyListener) this);
        this.setFocusable(true);
        
        this.addMouseListener((MouseListener) this);
        
    }


    public void play(){
        while (true){
            sprite.act();
            
            repaint();
            try {
                Thread.sleep(40); // fait une pause (en ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void paint(Graphics g){
        sprite.paint(g);
        j1.paint(g);
    }
    
    public static void main(String[] args) {

        // Crée une fenêtre.
        JFrame application = new JFrame("Jeu");

        // Crée le jeu et le place dans la fenêtre.
        Game game = new Game(new Dimension(800,600));
        application.getContentPane().add(game,BorderLayout.CENTER);

        // Prépare l'affichage de la fenêtre.
        application.pack();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);

        // Commence le jeu.
        game.play();

    }


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode()==39)
			j1.x++;
		if(arg0.getKeyCode()==37)
			j1.x--;
		
		System.out.println(arg0.getKeyCode());
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
