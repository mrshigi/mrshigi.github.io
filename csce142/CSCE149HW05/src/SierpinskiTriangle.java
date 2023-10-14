import javax.swing.*;
import java.awt.*;

public class SierpinskiTriangle extends JPanel {
    private int level;

    public SierpinskiTriangle(int level) {
        this.level = level;
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSierpinskiTriangle(g, level, getWidth() / 2, 0, getWidth());
    }

    private void drawSierpinskiTriangle(Graphics g, int level, int x1, int y1, int sideLength) {
        if (level == 0) {
            int[] xPoints = {x1, x1 + sideLength / 2, x1 - sideLength / 2};
            int[] yPoints = {y1, y1 + sideLength, y1 + sideLength};
            g.drawPolygon(xPoints, yPoints, 3);
        } else {
            int newSideLength = sideLength / 2;
            drawSierpinskiTriangle(g, level - 1, x1, y1, newSideLength);
            drawSierpinskiTriangle(g, level - 1, x1 + newSideLength / 2, y1 + newSideLength, newSideLength);
            drawSierpinskiTriangle(g, level - 1, x1 - newSideLength / 2, y1 + newSideLength, newSideLength);
        }
    }

    public static void main(String[] args) {
        int level = 4;
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sierpinski's Triangle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new SierpinskiTriangle(level));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
