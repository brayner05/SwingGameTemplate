import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameControls implements KeyListener {
    private final Game gameHandle;

    public GameControls(Game gameHandle) {
        this.gameHandle = gameHandle;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        gameHandle.handleKeyDown(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        gameHandle.handleKeyUp(e.getKeyCode());
    }
}
