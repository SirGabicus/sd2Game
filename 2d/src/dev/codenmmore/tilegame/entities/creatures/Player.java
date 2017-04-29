package dev.codenmmore.tilegame.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.codenmmore.tilegame.Game;
import dev.codenmmore.tilegame.Handler;
import dev.codenmmore.tilegame.gfx.*;

public class Player extends Creature {

	//Animation
	private Animation animDown, animUp, animLeft, animRight, animStand;

	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 10;
		bounds.y = 10;
		bounds.width = 10;
		bounds.height = 35;
		
		//Animations
		animDown = new Animation(100, Assets.player_down);
		animUp = new Animation(100, Assets.player_up);
		animLeft = new Animation(100, Assets.player_left);
		animRight = new Animation(100, Assets.player_right);
		animStand = new Animation(100, Assets.player_stand);
		
	}

	@Override
	public void tick() {
	
		//Animation
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		//Movement
		getInput();
		move();
		handler.getGameCamera().cetnerOnEntity(this);
	}

	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getkeyManager().up)
			yMove = -speed;
		if(handler.getkeyManager().down)
			yMove = speed;
		if(handler.getkeyManager().left)
			xMove = -speed;
		if(handler.getkeyManager().right)
			xMove = speed;
	}
	
	@Override
	public void render(Graphics g) {
		
		g.drawImage(getCurrentAnimationFrame(),(int) (x - handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
/*		g.setColor(Color.red);
		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
				(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
				*/
	}
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}else if(yMove < 0){
			return animUp.getCurrentFrame();
		}else if(yMove > 0){
			return animDown.getCurrentFrame();
		}else{
			return animStand.getCurrentFrame();
		}
	}
	
	

}
