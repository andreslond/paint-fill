import java.awt.Color;
import java.util.stream.IntStream;

public class PrintUtils {

    public static void printHexCodeScreen(Color[][] screen_colors) {
        int n = screen_colors.length;
        int m = screen_colors[0].length;

        for (Color[] screen_color : screen_colors)
            IntStream.range(0, m).forEach(j -> {
                hexcode(screen_color[j].getRGB());
                if (j == m - 1) {
                    System.out.println();
                }
            });
    }

    public static void hexcode(int RGB) {
        System.out.print(String.format("#%06x", RGB & 0x00FFFFFF) + "  ");
    }
}
