package smb;

import jig.engine.physics.vpe.VanillaAARectangle;
import jig.engine.util.Vector2D;

public class flagPole extends VanillaAARectangle {
	flagPole(int x, int y) {
		super(smb.SPRITE_SHEET + "#questionBlock", 6);
		position = new Vector2D(x * smb.TILE_SIZE, y * smb.TILE_SIZE);
	}

	@Override
	public void update(long deltaMs) {
		return;
	}
}