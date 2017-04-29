package dev.codenmmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64, width1 = 40, height1 = 70, width2 = 45, height2 = 70;

	public static BufferedImage car1, car2, car3, car4, dirt, grass, water, ufo, player, tree1, tree2, tree3;
	public static BufferedImage[] player_down, player_left, player_right, player_up, player_stand;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet1.png"));
		
			car1 = sheet.crop(0, 0, width, height);
			car2 = sheet.crop(width, 0, width, height);
			dirt = sheet.crop(width * 2, 0, width, height);
			car3 = sheet.crop(0, height, width, height);
			car4 = sheet.crop(width, height, width, height);
			grass = sheet.crop(width * 2, height, width, height);
			water = sheet.crop(0, height * 2, width, height);
			ufo = sheet.crop(width, height * 2, width, height);
			player = sheet.crop(width * 2, height * 2, width, height);
		
		SpriteSheet sheetp = new SpriteSheet(ImageLoader.loadImage("/textures/players/knight.png"));
		
			player_down = new BufferedImage[5];
			player_left = new BufferedImage[5];
			player_right = new BufferedImage[5];
			player_up = new BufferedImage[5];
			player_stand = new BufferedImage[5];
			
			player_down[0] = sheetp.crop(0, 0, 40, 70);
			player_down[1] = sheetp.crop(width1, 0, 40, 70);
			player_down[2] = sheetp.crop(width1 * 2, 0, 40, 70);
			player_down[3] = sheetp.crop(width1 * 3, 0, 40, 70);
			player_down[4] = sheetp.crop(width1 * 3, 0, 40, 70);
			player_up[0] = sheetp.crop(0, height1, 40, 70);
			player_up[1] = sheetp.crop(width1, height1, 40, 70);
			player_up[2] = sheetp.crop(width1 * 2, height1, 40, 70);
			player_up[3] = sheetp.crop(width1 * 3, height1, 40, 70);
			player_up[4] = sheetp.crop(width1 * 3, height1, 40, 70);
			player_right[0] = sheetp.crop(0, height1 * 2, 45, 70);
			player_right[1] = sheetp.crop(width2, height1 * 2, 45, 70);
			player_right[2] = sheetp.crop(width2 * 2, height1 * 2, 45, 70);
			player_right[3] = sheetp.crop(width2 * 3, height1 * 2, 45, 70);
			player_right[4] = sheetp.crop(width2 * 3, height1 * 2, 45, 70);
			player_left[0] = sheetp.crop(0, height1 * 3, 45, 70);
			player_left[1] = sheetp.crop(width2, height1 * 3, 45, 70);
			player_left[2] = sheetp.crop(width2 * 2, height1 * 3, 45, 70);
			player_left[3] = sheetp.crop(width2 * 3, height1 * 3, 45, 70);
			player_left[4] = sheetp.crop(width2 * 3, height1 * 3, 45, 70);
			player_stand[0] = sheetp.crop(0, 0, 40, 70);
			player_stand[1] = sheetp.crop(0, 0, 40, 70);
			player_stand[2] = sheetp.crop(0, 0, 40, 70);
			player_stand[3] = sheetp.crop(0, 0, 40, 70);
			player_stand[4] = sheetp.crop(0, 0, 40, 70);
		
		SpriteSheet sheett = new SpriteSheet(ImageLoader.loadImage("/textures/trees.png"));
		
			tree1 = sheett.crop(0, 0, width, height);
			tree2 = sheett.crop(width, 0, width, height);
			tree3 = sheett.crop(width * 1, 0, width, height);
	}
	
}
