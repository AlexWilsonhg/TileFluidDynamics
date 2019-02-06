import java.util.*;
import java.io.*;

public class TileMapDrawerText implements TileMapDrawer
{
	public void Draw(TileMap tileMap)
	{
		String line;
		int height = tileMap.GetHeight();
		int width = tileMap.GetWidth();
		for(int row = 0; row < height; row++)
		{
			line = "";
			for(int col = 0; col < width; col++)
			{
				line = line + tileMap.GetTileValue(col, row);
			}
			System.out.println(line);
		}
	}
}