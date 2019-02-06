import java.util.*;
import java.io.*;

public class TileMap
{
	private int[][] tiles;
	private int height;
	private int width;

	public TileMap(int width, int height)
	{
		tiles = new int[height][width];
		this.height = height;
		this.width = width;
	}

	public void SetTileValue(int x, int y, int value)
	{
		tiles[y][x] = value;
	}

	public int GetTileValue(int x, int y)
	{
		return tiles[y][x];
	}

	public int GetHeight()
	{
		return height;
	}

	public int GetWidth()
	{
		return width;
	}

}