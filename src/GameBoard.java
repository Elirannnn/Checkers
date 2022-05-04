import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JPanel {

    public static final int BOARD_LENGTH = 8;

    private ArrayList<ArrayList<Square>> boardData;
    public static final int PLAYER_NONE = 0;
    public static final int PLAYER_BLUE = 1;
    public static final int PLAYER_RED = 2;

    public GameBoard (int x, int y, int width, int height) {
//        this.setBounds(x, y, width, height);
        this.setBackground(Color.BLUE);
        GridLayout gridLayout = new GridLayout(BOARD_LENGTH, BOARD_LENGTH);
        this.setLayout(gridLayout);
        this.boardData = new ArrayList<>();

        boolean black = true;
        boolean setPlayer = true;
        for (int row = 0; row < BOARD_LENGTH; row++) {
            ArrayList<Square> currentRow = new ArrayList<>();
            for (int column = 0; column < BOARD_LENGTH; column++) {
                int player = PLAYER_NONE;
                if (setPlayer) {
                    if (row < 3) {
                        player = PLAYER_RED;
                    } else if (row >= 5) {
                        player = PLAYER_BLUE;
                    }
                }
                Square square = null;
                if (black) {
                    square = new Square(Color.BLACK, player);
                } else {
                    square = new Square(Color.WHITE, player);
                }
                int finalRow = row;
                int finalColumn = column;
                square.addActionListener((event) -> {
                });
                this.add(square);
                currentRow.add(square);
                black = !black;
                setPlayer = !setPlayer;
            }
            this.boardData.add(currentRow);
            black = !black;
            setPlayer = !setPlayer;
        }

    }
}
