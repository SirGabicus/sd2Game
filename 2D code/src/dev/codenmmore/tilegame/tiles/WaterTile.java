package dev.codenmmore.tilegame.tiles;

import java.awt.image.BufferedImage;

import dev.codenmmore.tilegame.gfx.Assets;

public class WaterTile extends Tile{

	public WaterTile(int id) {
		super(Assets.water, id);
		
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
	

}
