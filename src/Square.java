import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
    private Color color;
    private int player;

    public Square (Color color, int player) {
        this.color = color;
        this.player = player;
    }

    public void setPlayer (int player) {
        this.player = player;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillRect(0, 0,
                 this.getWidth(), this.getHeight());
        switch (this.player) {
            case GameBoard.PLAYER_NONE:
                //do nothing
                break;
            case GameBoard.PLAYER_RED:
                g.setColor(Color.RED);
                g.fillOval(5, 5, this.getWidth() - 10, this.getHeight() - 10);
                break;
            case GameBoard.PLAYER_BLUE:
                g.setColor(Color.BLUE);
                g.fillOval(5, 5, this.getWidth() - 10, this.getHeight() - 10);
                break;

        }
    }

    public boolean isBluePlayer () {
        return this.player == GameBoard.PLAYER_BLUE;
    }
}
