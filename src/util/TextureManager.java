package util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextureManager {
    private static final Map<String, BufferedImage> textures = new HashMap<>();

    /**
     *
     * @param id The unique identifier for the texture. This will be used to
     *           gain access to textures during rendering, etc. Identifiers should
     *           follow the form: purpose.name. For example, entities.player.
     * @param path The path from which to read the image.
     * @throws IOException Throws an exception if the image doesn't exist or cannot be read.
     */
    public static void loadTextureFromPath(String id, String path) throws IOException {
        BufferedImage texture = ImageIO.read(new File(path));
        textures.put(id, texture);
    }

    public static BufferedImage getById(String id) {
        return textures.get(id);
    }
}
