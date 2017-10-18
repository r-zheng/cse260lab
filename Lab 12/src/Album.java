import java.util.ArrayList;

public class Album
{
	ArrayList<Track> tracks = new ArrayList<Track>();
	String name;
	
	public Album(String name)
	{
		this.name = name;
	}
	
	public void addTrack(int rating, String name)
	{
		tracks.add(new Track(rating, name));
	}
}

class Track
{
	int rating;
	String name;
	
	public Track(int rating, String name)
	{
		this.rating = rating;
		this.name = name;
	}
}