package mytest.chapter7;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import java.util.List;
import java.util.function.ToLongFunction;

import static java.util.Arrays.asList;

/**
 * Created by syq on 7/29/2017.
 */
public class Sample7 {
    public static void main(String[] args) {
        List<Album> albums = asList(SampleData.aLoveSupreme, SampleData.manyTrackAlbum, SampleData.sampleShortAlbum);
        System.out.println(countRunningTime(albums));
        System.out.println(countMusicians(albums));
        System.out.println(countTracks(albums));
    }

    public static long countRunningTime(List<Album> albums) {
        return countFeature(albums, album -> album.getTracks().mapToLong(track -> track.getLength()).sum());
    }

    public static long countMusicians(List<Album> albums) {
        return countFeature(albums, album -> album.getMusicians().count());
    }

    public static long countTracks(List<Album> albums) {
        return countFeature(albums, value -> value.getTracks().count());
    }

    public static long countFeature(List<Album> albums, ToLongFunction<Album> function) {
        return albums.stream().mapToLong(function).sum();
    }
}
