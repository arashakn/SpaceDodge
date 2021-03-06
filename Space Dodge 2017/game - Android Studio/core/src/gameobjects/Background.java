package gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import configuration.Configuration;
import gameworld.GameWorld;
import helpers.ColorManager;

/**
 * Created by ManuGil on 10/03/15.
 */
public class Background extends GameObject {
    private ColorManager colorManager;

    public Background(GameWorld world, float x, float y, float width, float height,
                      TextureRegion texture) {
        super(world, x, y, width, height, texture,
                world.parseColor(Configuration.COLOR_BACKGROUND_COLOR, 1f), Shape.RECTANGLE);

    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }

    @Override
    public void render(SpriteBatch batch, ShapeRenderer shapeRenderer) {
        super.render(batch, shapeRenderer);
    }
}
