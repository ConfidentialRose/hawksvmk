// GridViewable.java by Matt Fritz
// November 10, 2009
// Interface to classify an object as a viewable grid

package interfaces;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;

import animations.Animation;

import sounds.SoundPlayable;
import tiles.Tile;
import ui.WindowLoading;

public interface GridViewable
{
	public void loadGridView();
	public void setOffscreenImage(Image offscreen);
	public void setBackgroundImage(String imagePath);
	public void setCurrentTileType(String type);
	
	public void showGrid(boolean showGrid);
	public void showWalkTiles(boolean showWalkTiles);
	public void showNogoTiles(boolean showNogoTiles);
	public void showExitTiles(boolean showExitTiles);
	public void toggleGrid();
	
	public HashMap<String,Tile> getTilesMap();
	public void setTilesMap(HashMap<String,Tile> tilesMap);
	public String getBackgroundImagePath();
	
	public void setAnimations(ArrayList<Animation> animations);
	public void setSounds(ArrayList<SoundPlayable> sounds);
	
	public void addTextBubble(String username, String text, int x);
	public void setupChatBubbles();
}