import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossesUI extends JPanel {
    static JFrame frame;
    static List<JButton> fieldButtons;
    static  JLabel informLabel;
    private static String[] gameField;
    private static Scanner input;
    static String winner = null;
    private static String turn;
    static int cellValue;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CrossesUI crosses = new CrossesUI();
        frame.add(crosses);
        frame.setContentPane(crosses);
        frame.setVisible(true);
        gameField = new String[9];
        turn = "X";
        String winner = null;


        fieldButtons = new ArrayList<>();
        informLabel = new JLabel("Добро пожаловать в игру крестики-нолики!");


    }
    static void emptyField() {
        frame.setLayout(null);
        informLabel.setBounds(10, 160, 400, 400);
        frame.add(informLabel);
        int xInc = 0;
        int yInc = -100;

        for (int i = 0; i < 9; i++) gameField[i]="empty";

        for (int y = 0; y < 3; y++) {
            xInc=0;
            yInc+=100;
            for (int x = 0; x < 3; x++) {
                fieldButtons.add(new JButton(""));
                fieldButtons.get(cellValue).setBounds(xInc, yInc, 100, 100);
                frame.add(fieldButtons.get(cellValue));
                fieldButtons.get(cellValue).addActionListener(new ActionListener() {
                    int value = cellValue;
                    public void actionPerfomed(ActionEvent e) {
                        if()
                    }
                }
            }
        }
    }

}
