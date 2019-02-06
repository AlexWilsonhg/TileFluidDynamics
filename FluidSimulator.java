
public class FluidSimulator implements TileMapSimulator
{

	private TileMap tileMap;

	public FluidSimulator(TileMap tileMap)
	{
		this.tileMap = tileMap;
	}

	public void Step()
	{
		//Loop from bottom to top through tilemap, starting at tilemap[height-1][width-1]
		for(int row = tileMap.GetHeight()-1; row >= 0; row--)
		{
			for(int col = tileMap.GetWidth()-1; col >= 0; col--)
			{
				
			}
		}
	}

	private int SumLeftRightTiles(int tileX, int tileY)
	{
		int total = 0;
		//We're at right edge, sum this tile and tile to the left.
		if(tileX == (tileMap.GetWidth()-1))
		{
			total += tileMap.GetTileValue(tileX, tileY);
			total += tileMap.GetTileValue(tileX-1, tileY);
		}
		//We're at left edge, sum this tile and tile to the right.
		else if(tileX == 0) 
		{
			total += tileMap.GetTileValue(tileX, tileY);
			total += tileMap.GetTileValue(tileX+1, tileY);
		}
		//We're in the middle, sum this tile and both neighbor tiles.
		else 
		{
			total += tileMap.GetTileValue(tileX, tileY);
			total += tileMap.GetTileValue(tileX-1, tileY);
			total += tileMap.GetTileValue(tileX+1, tileY);
		}
		return total;
	}
}