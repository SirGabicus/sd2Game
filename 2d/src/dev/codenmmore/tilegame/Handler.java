package dev.codenmmore.tilegame;

import dev.codenmmore.tilegame.gfx.GameCamera;
import dev.codenmmore.tilegame.input.KeyManager;
import dev.codenmmore.tilegame.input.MouseManager;
import dev.codenmmore.tilegame.worlds.World;

public class Handler {

	private Game game;
	private World world;
	
	public Handler(Game game){
			this.game = game;
		}
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getkeyManager(){
		return game.getKeyManager();
	}
	
	public MouseManager gerMouseManager(){
		return game.getMouseManger();
	}
	
	public int getWidth(){
		return game.getWidth();
		
	}
	
	public int getHeight(){
		return game.getHeight();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}
