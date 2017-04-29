package dev.codenmmore.tilegame.states;

import java.awt.Graphics;

import dev.codenmmore.tilegame.Game;
import dev.codenmmore.tilegame.Handler;
import dev.codenmmore.tilegame.entities.creatures.Player;
import dev.codenmmore.tilegame.entities.statics.Tree;
import dev.codenmmore.tilegame.gfx.Assets;
import dev.codenmmore.tilegame.tiles.Tile;
import dev.codenmmore.tilegame.worlds.World;

public class GameState extends State  {
	
	private World world;

	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);		
				
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}
	
	
	

}
