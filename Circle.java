import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Circle extends  JFrame{
	public static final int CANVAS_WIDTH = 500;
	public static final int CANVAS_HEIGHT = 500;
	public Circle(){
		setTitle("Circle");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g){
		g.setColor(Color.PINK);
		g.drawOval(300, 300, 250, 250);
		g.fillOval(300, 300, 250, 250);
	}

	public static void main(String[] args) {
			Circle t = new Circle();
			t.paint(null);
	}
}