package dev.codenmmore.tilegame.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import dev.codenmmore.tilegame.Handler;
import dev.codenmmore.tilegame.gfx.Assets;
import dev.codenmmore.tilegame.tiles.Tile;

public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 28;
		bounds.y = 40;
		bounds.width = 10;
		bounds.height = 20;

	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.tree1,(int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset() ), width, height, null);
	
	//	g.setColor(Color.RED);
	//	g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()), 
	//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
