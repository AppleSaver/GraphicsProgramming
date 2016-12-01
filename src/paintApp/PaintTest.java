package paintApp;

import static org.junit.Assert.*;

import javax.swing.JButton;

import org.junit.Test;

public class PaintTest {

	@Test
	public void PaintTest() {
		GraphicsProgramming1 gp1 = new GraphicsProgramming1();
		JButton jb = gp1.makeMeButtons("./src/Ellipse.png", 3);
		assertEquals(3,jb);
	}

}
