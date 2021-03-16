import java.awt.Color;

public class ScreenBuilder {
    private Color[][] screen_colors;

    public Color[][] getBigScreen() {
        Color[] row0 = new Color[]{Color.RED, Color.RED, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK};
        Color[] row1 = new Color[]{Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK};
        Color[] row2 = new Color[]{Color.WHITE, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK};
        Color[] row3 = new Color[]{Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK};
        Color[] row4 = new Color[]{Color.BLACK, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK};
        Color[] row5 = new Color[]{Color.RED, Color.RED, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK};
        Color[] row6 = new Color[]{Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.RED, Color.BLACK, Color.BLACK};
        Color[] row7 = new Color[]{Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK};
        Color[] row8 = new Color[]{Color.RED, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK};
        Color[] row9 = new Color[]{Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK};

        screen_colors = new Color[10][10];
        screen_colors[0] = row0;
        screen_colors[1] = row1;
        screen_colors[2] = row2;
        screen_colors[3] = row3;
        screen_colors[4] = row4;
        screen_colors[5] = row5;
        screen_colors[6] = row6;
        screen_colors[7] = row7;
        screen_colors[8] = row8;
        screen_colors[9] = row9;

        return screen_colors;
    }

    public Color[][] getSmallScreen() {
        Color[] row0 = new Color[]{Color.RED, Color.RED, Color.RED, Color.WHITE, Color.RED};
        Color[] row1 = new Color[]{Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK,};
        Color[] row2 = new Color[]{Color.WHITE, Color.RED, Color.BLACK, Color.RED, Color.BLACK,};
        Color[] row3 = new Color[]{Color.RED, Color.RED, Color.BLACK, Color.BLACK, Color.BLACK,};
        Color[] row4 = new Color[]{Color.BLACK, Color.RED, Color.RED, Color.RED, Color.RED,};

        screen_colors = new Color[5][5];
        screen_colors[0] = row0;
        screen_colors[1] = row1;
        screen_colors[2] = row2;
        screen_colors[3] = row3;
        screen_colors[4] = row4;

        return screen_colors;
    }
}
