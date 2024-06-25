import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dungeon dungeon = new Dungeon(2, "Floresta Maldita", CharacterEnemyAndDungeonBootLoader.mau);
        Journey.Jornar(dungeon, CharacterEnemyAndDungeonBootLoader.bem);
        //CreateKillOrder(CharacterEnemyAndDungeonBootLoader.bem, CharacterEnemyAndDungeonBootLoader.mau.get(0));
        //createGUI();

    }

    private static void createGUI(){
        JFrame frame = new JFrame("Out Of Game");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.BLACK);
        JButton button = new JButton("Click Me");
        button.setPreferredSize(new Dimension(100, 50));
        frame.add(button);
        frame.setVisible(true);
    }
}