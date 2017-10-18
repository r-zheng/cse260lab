import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class part4
{
	public static void main(String[] args)
	{
		List<Album> albums = new ArrayList<Album>();
		albums.add(new Album("Amazing Hits"));
		albums.get(0).addTrack(2, "Good Song");
		albums.get(0).addTrack(2, "Not So Good Song");
		albums.add(new Album("More Amazing Hits"));
		albums.get(1).addTrack(4, "More Good Song");
		albums.get(1).addTrack(4, "Not So More Good Song");

		List<Album> favs = new ArrayList<Album>();

		albums.stream().filter(e -> (e.tracks.stream().filter(t -> t.rating >= 4).count() > 0))
		.sorted(new Comparator<Album>() {
			public int compare(Album a1, Album a2) {
				return a1.name.compareTo(a2.name);
			}
		})
		.forEach(e -> System.out.println(e.name));
	}
}
