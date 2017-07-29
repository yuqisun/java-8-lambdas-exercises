package mytest.chapter7;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.examples.chapter1.Track;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by syq on 7/29/2017.
 */
public class Sample6 {
    public static void main(String[] args) {
        List<Album> albums = asList(SampleData.aLoveSupreme, SampleData.manyTrackAlbum, SampleData.sampleShortAlbum);
        System.out.println(countRunningTime(albums));
        System.out.println(countMusicians(albums));
        System.out.println(countTracks(albums));
    }

    public static long countRunningTime(List<Album> albums) {
        return albums.stream().mapToLong(album -> album.getTracks().mapToLong(track -> track.getLength()).sum()).sum();
    }

    public static long countMusicians(List<Album> albums) {
        return albums.stream().mapToLong(album -> album.getMusicians().count()).sum();
    }

    public static long countTracks(List<Album> albums) {
        return albums.stream().mapToLong(value -> value.getTracks().count()).sum();
    }
}
