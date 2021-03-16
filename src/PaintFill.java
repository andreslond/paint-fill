import java.awt.Color;
import java.awt.Point;

public class PaintFill {

    public static Color[][] initPaintFill(Color[][] screen_colors, Point point, Color newColor) {
        Color originColor = getColor(screen_colors, point);

        paintFillProcess(screen_colors, point, newColor, originColor);

        return screen_colors;
    }

    public static void paintFillProcess(Color[][] screen_colors, Point point, Color newColor, Color originColor) {
        //Get the current color
        Color currColor = getColor(screen_colors, point);
        //Base cases
        //1. Invalid screen point
        if (currColor == null)
            return;
        //2. Different origin color
        if (!currColor.equals(originColor))
            return;
        paint(screen_colors, point, newColor);

        //Paint surrounding points
        paintFillProcess(screen_colors, new Point(point.x + 1, point.y), newColor, originColor);
        paintFillProcess(screen_colors, new Point(point.x, point.y + 1), newColor, originColor);
        paintFillProcess(screen_colors, new Point(point.x - 1, point.y), newColor, originColor);
        paintFillProcess(screen_colors, new Point(point.x, point.y - 1), newColor, originColor);

    }

    public static void paint(Color[][] screen_colors, Point point, Color newColor) {
        screen_colors[point.y][point.x] = newColor;
    }

    public static Color getColor(Color[][] screen_colors, Point point) {
        try {
            return screen_colors[point.y][point.x];
        } catch (Exception ex) {
            return null;
        }
    }

    public static void main(String args[]) {
        Color[][] screen_colors = new ScreenBuilder().getSmallScreen();
        Color newColor = Color.GREEN;
        Point selectedPoint = new Point(0,0);

        System.out.println("Original Screen colors");
        PrintUtils.printHexCodeScreen(screen_colors);
        System.out.println();
        System.out.println("After paintFill process");
        Color[][] screen_colorsModified = initPaintFill(screen_colors, selectedPoint, newColor);
        PrintUtils.printHexCodeScreen(screen_colorsModified);
    }
}
