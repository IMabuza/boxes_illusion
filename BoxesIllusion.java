/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class BoxesIllusion extends GraphicsProgram {
	/* The number of rows and columns in the grid, respectively. */
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 6;
	
	/* The width and height of each box. */
	private static final double BOX_SIZE = 40;
	
	/* The horizontal and vertical spacing between the boxes. */
	private static final double BOX_SPACING = 10;
	
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight().
	 */
	public static final int APPLICATION_WIDTH = 350;
	public static final int APPLICATION_HEIGHT = 300;

	public void run() {

		drawBoxes();
		
	}

	public void drawBoxes(){

		double xStart = (getWidth() - 240) / 2;
		double yStart = (getHeight() -  240) / 2;
		
		for(int i = 0; i < 6; i++){
			xStart += BOX_SPACING + 40;
			yStart = (getHeight() -  240) / 2;
			for(int j = 0; j < 5; j++){
			GRect box = new GRect(xStart, yStart, 40, 40);
			box.setFilled(true);
			box.setFillColor(Color.black);
			add(box);

			yStart += BOX_SPACING +  40;
			}
			
		}
		
		
	}
}
