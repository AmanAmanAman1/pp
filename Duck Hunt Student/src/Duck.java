import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.net.URL;

public class Duck implements MouseListener{
	public static final String BufferedImage = null;
	private int x = 0,y = 180;
	private int vx, vy;
	private Image img; // image of the frog
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	
	

	public Duck() {
		img = getImage("Duck.gif"); //load the image for Tree
		init(x, y);
		vx = (int)(Math.random() *10);
		vy = (int)(Math.random() *10);
		
		//initialize the location of the image
	}
	
	public void paint(Graphics g) {
		
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		x += vx;
		y += vy;
		if(y<=-50) {
			
		}if(x<= -20 || x >= 830) {
			vx*= -1;
		}
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Duck.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	
	Music bang = new Music("bang.wav", false);
	Music haha = new Music("haha.wav", false);
	Music pew = new Music("pew.wav", false);
	Music thud = new Music("thud.wav", false);

public boolean collided(int mX, int mY) {
	
	System.out.println(mX + ";" + mY);
	
	Rectangle x3 = new Rectangle(x ,y);
	

	if(x3.contains(mX , mY)) {
		System.out.println("ouch");
		vx = 0;
		vy = 100;
		if(y>=500) {
			x = 0;
			y = 180;
			
		}
	}
	
	
	return false;
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
		System.out.println("ouch");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
