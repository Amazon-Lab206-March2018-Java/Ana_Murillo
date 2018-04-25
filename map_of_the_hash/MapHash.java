import java.util.*;

public class MapHash {
    public static void main(String[] args) {
        MapHash songs = new MapHash();

        songs.MapSongs();
    }

    public void MapSongs() {
        HashMap<String, String> songMap = new HashMap<>();
        ArrayList trackList = new ArrayList();
        songMap.put("calling my name",
                "I get on with life as a pilot,I'm a funny kinda person.I like playing golf on Sundays,I like collecting");
        songMap.put("You",
                "I like to use words like 'magic,'I like to use words like 'fortified.'I like to use words about pizza.But when I st");
        songMap.put("This is madness",
                "I like to use words like 'magic,'I like to use words like 'fortified.'I like to use about.But when I st");
        songMap.put("Where have you been?",
                "I like to use words like 'magic,'I lik to use words about pizza.But when I st");
        trackList.add(songMap);

        String name = songMap.get("calling my name");
        // String both = trackList.get(namesString, lyricsString);

        System.out.println(name);
        System.out.println(trackList);
        // System.out.println(both);
    }
}