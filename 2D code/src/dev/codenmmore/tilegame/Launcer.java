package dev.codenmmore.tilegame;

import dev.codenmmore.tilegame.display.Display;

public class Launcer {

		public static void main(String[] args){
			Game game = new Game("My Game", 640, 640);
			game.start();
		}
	
}
