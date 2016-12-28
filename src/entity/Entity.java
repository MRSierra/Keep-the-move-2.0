package entity;

import java.util.Random;
import general.Screen;
import level.Level;
import level.tiles.TileCoordinate;

public class Entity {
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	public TileCoordinate xy_tile;
	
	public void update(){}
	public void render(Screen screen){}
	public void remove(){
		removed = true;
	}
	public boolean isRemoved(){
		return removed;
	}
	public void init(Level level){
		this.level = level;
	}
}
