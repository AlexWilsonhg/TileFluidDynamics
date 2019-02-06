import java.util.*;
import java.io.*;
import java.lang.Math;

public class Fluid
{
	public static void main(String[] args)
	{
		TileMap map = new TileMap(3, 3);
		TileMapDrawer mapDrawer = new TileMapDrawerText();

		TileMapSimulator fluidSimulator = new FluidSimulator(map);

		map.SetTileValue(0,0,9);
		map.SetTileValue(1,0,8);
		map.SetTileValue(2,0,7);
		map.SetTileValue(0,1,6);
		map.SetTileValue(1,1,5);
		map.SetTileValue(2,1,4);
		map.SetTileValue(0,2,3);
		map.SetTileValue(1,2,2);
		map.SetTileValue(2,2,1);

		mapDrawer.Draw(map);

	}
}