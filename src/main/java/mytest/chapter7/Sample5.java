package mytest.chapter7;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.examples.chapter1.Track;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by syq on 7/29/2017.
 */
public class Sample5 {
    public static void main(String[] args) {
        List<Album> albums = asList(SampleData.aLoveSupreme, SampleData.manyTrackAlbum, SampleData.sampleShortAlbum);
        System.out.println(countRunningTime(albums));
        System.out.println(countMusicians(albums));
        System.out.println(countTracks(albums));
    }

    public static long countRunningTime(List<Album> albums) {
        long count = 0;
        for(Album album : albums) {
            for(Track track : album.getTrackList()) {
                count += track.getLength();
            }
        }

        return count;
    }

    public static long countMusicians(List<Album> albums) {
        long count = 0;
        for(Album album : albums) {
            count += album.getMusicianList().size();
        }

        return count;
    }

    public static long countTracks(List<Album> albums) {
        long count = 0;
        for(Album album : albums) {
            count += album.getTrackList().size();
        }

        return count;
    }
}
