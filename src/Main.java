import javax.swing.*;

public class Main extends JFrame {

    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = WINDOW_WIDTH;

    public static void main(String[] args) {
        new Main();
    }

    public Main () {
        GameBoard gameBoard = new GameBoard(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameBoard);
        this.setResizable(false);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
