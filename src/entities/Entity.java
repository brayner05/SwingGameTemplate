package entities;

import util.V2DF;

import java.awt.*;

/**
 * The base class for any game entity.
 */
public abstract class Entity {
    private V2DF position = new V2DF();
    private V2DF size = new V2DF();

    /**
     * Renders this entity on the window.
     * @param g The handle to the graphics context.
     */
    public abstract void render(Graphics g);

    /**
     * Used to change the entity during the game.
     */
    public abstract void update();

    public V2DF getPosition() {
        return position;
    }

    public V2DF getSize() {
        return size;
    }

    public void setPosition(V2DF position) {
        this.position = position;
    }

    public void setSize(V2DF size) {
        this.size = size;
    }
}
