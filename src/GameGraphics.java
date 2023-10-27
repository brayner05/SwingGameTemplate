import util.GameSettings;

import javax.swing.*;

public class GameGraphics {
    public static void init(Game gameHandle) {
        JFrame mainWindow = new JFrame(GameSettings.WINDOW_TITLE);
        mainWindow.add(gameHandle);
        mainWindow.setSize(GameSettings.WINDOW_WIDTH, GameSettings.WINDOW_HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.addKeyListener(new GameControls(gameHandle));
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
