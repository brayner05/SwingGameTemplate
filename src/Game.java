import entities.*;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Game extends JPanel {
    private final List<Entity> entityList = new ArrayList<>();
    private final int frameDelay = 16;

    public Game() {
        Timer timer = new Timer(frameDelay, event -> {
            updateGame();
            repaint();
        });
        timer.start();
    }

    public void start() {
        GameGraphics.init(this);
    }

    private void updateGame() {
        for (Entity entity : entityList) {
            entity.update();
        }
    }

    private void renderGame(Graphics g) {
        for (Entity entity : entityList) {
            entity.render(g);
        }
    }

    public void handleKeyDown(int keyCode) {
        for (Entity entity : entityList) {
            if (entity instanceof KeyReactor) {
                KeyReactor reactor = (KeyReactor) entity;
                reactor.onKeyDown(keyCode);
            }
        }
    }

    public void handleKeyUp(int keyCode) {
        for (Entity entity : entityList) {
            if (entity instanceof KeyReactor) {
                KeyReactor reactor = (KeyReactor) entity;
                reactor.onKeyUp(keyCode);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension size = this.getSize();
        g.clearRect(0, 0, size.width, size.height);
        renderGame(g);
    }
}
