import javax.swing.*;
import java.awt.*;

public class LoveHeart extends JFrame {

    public LoveHeart() {
        setTitle("Love Heart");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int size = 100;

        // 绘制爱心形状
        g2d.setColor(Color.RED);
        g2d.fillArc(x - size / 2, y - size, size, size, 0, 180);
        g2d.fillArc(x, y - size, size, size, 0, 180);
        g2d.fillRect(x - size / 2, y - size, size, size);

        // 绘制爱心上的箭头
        int[] arrowX = {x - size / 2 - 10, x - size / 2, x - size / 2 + 10};
        int[] arrowY = {y, y - 20, y};
        g2d.setColor(Color.BLACK);
        g2d.fillPolygon(arrowX, arrowY, 3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoveHeart());
    }
}

