package dev.codenmmore.tilegame.states;

import java.awt.Color;					  
import java.awt.Graphics;


import dev.codenmmore.tilegame.Handler;

public class MenuState extends State{
	
	public MenuState(Handler handler){
		 super(handler);
	}

	@Override
	public void tick() {
		System.out.println(handler.gerMouseManager().getMouseX() + " " + handler.gerMouseManager().getMouseY());
	}

	@Override
	public void render(Graphics g) {
		
	}
	

}