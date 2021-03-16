import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PaintFillTest {

    @Test
    void paintOfAValidPoint() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getBigScreen();
        Point punto = new Point(5, 9);
        Color newColor = Color.GREEN;
        //Act
        PaintFill.paint(screen_colors, punto, newColor);
        //Assert                 Se invierten los indices al acceder al arreglo.
        assertEquals(screen_colors[9][5], newColor);
    }

    @Test
    void paintOfAnInvalidPoint() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getBigScreen();
        Point punto = new Point(-5, 9);
        Color newColor = Color.GREEN;
        //Act
        try {
            PaintFill.paint(screen_colors, punto, newColor);
            fail();
        } catch (Exception e) {
            //Assert
            assertNotNull(e.getStackTrace());
        }
    }

    @Test
    void getColorOfAValidPoint() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Point punto = new Point(1, 1);
        //Act
        Color result = PaintFill.getColor(screen_colors, punto);
        //Assert
        assertNotNull(result);
    }

    @Test
    void getColorOfAnInvalidPoint() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Point punto = new Point(-1, 1);
        //Act
        Color result = PaintFill.getColor(screen_colors, punto);
        //Assert
        assertNull(result);
    }

    /*
    Inputs
        ScreenBuilder().getSmallScreen()
        Point(3, 1);
        Color.GREEN
    Output:

        Original Screen colors
        #ff0000  #ff0000  #ff0000  #000000  #ff0000
        #ff0000  #000000  #000000 *#ff0000* #000000
        #ff0000  #ff0000  #000000  #ff0000  #000000
        #ff0000  #ff0000  #000000  #000000  #000000
        #000000  #ff0000  #ff0000  #ff0000  #ff0000

        After paintFill process
        #ff0000  #ff0000  #ff0000  #ffffff  #ff0000
        #ff0000  #000000  #000000 *#00ff00* #000000
        #ffffff  #ff0000  #000000 *#00ff00* #000000
        #ff0000  #ff0000  #000000  #000000  #000000
        #000000  #ff0000  #ff0000  #ff0000  #ff0000
     */
    @Test
    void initPaintFillAnInvalidPosition() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Point punto = new Point(-3, 1);
        Color newColor = Color.GREEN;
        //Act
        Color[][] screenResult = PaintFill.initPaintFill(screen_colors, punto, newColor);
        //Assert
        assertArrayEquals(screen_colors, screenResult);
    }

    @Test
    void initPaintFillAValidPosition() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Point punto = new Point(3, 1);
        Color newColor = Color.GREEN;
        //Act
        Color[][] screenResult = PaintFill.initPaintFill(screen_colors, punto, newColor);
        //Assert            The access to arrays needs the inverse coordinates y, x)
        assertEquals(screenResult[1][3], Color.GREEN);
        assertEquals(screenResult[2][3], Color.GREEN);
    }

    @Test
    void initPaintFillStartsInACorner() {
        //Arrange
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Point punto = new Point(4, 0);
        Color newColor = Color.GREEN;
        //Act
        Color[][] screenResult = PaintFill.initPaintFill(screen_colors, punto, newColor);
        //Assert            The access to arrays needs the inverse coordinates y, x)
        assertEquals(screenResult[0][4],Color.GREEN);
    }
}