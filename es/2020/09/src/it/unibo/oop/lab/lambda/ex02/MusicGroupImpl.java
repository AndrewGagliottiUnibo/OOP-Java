package it.unibo.oop.lab.lambda.ex02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public final class MusicGroupImpl implements MusicGroup {

    private final Map<String, Integer> albums = new HashMap<>();
    private final Set<Song> songs = new HashSet<>();

    @Override
    public void addAlbum(final String albumName, final int year) {
        this.albums.put(albumName, year);
    }

    @Override
    public void addSong(final String songName, final Optional<String> albumName, final double duration) {
        if (albumName.isPresent() && !this.albums.containsKey(albumName.get())) {
            throw new IllegalArgumentException("invalid album name");
        }
        this.songs.add(new MusicGroupImpl.Song(songName, albumName, duration));
    }

    @Override
    /*
     * map() e sorted() sono per la stream transformation 
     * */
    public Stream<String> orderedSongNames() {
        return this.songs.stream()
                .map(Song::getSongName)
                .sorted();
    }

    @Override
    /*
     * Stream of the keys
     * */
    public Stream<String> albumNames() {
        return this.albums.keySet().stream();
    }

    @Override
    /*
     * per ogni entry della map io ne applico il filtro e poi ne ritorno la chiave
     * */
    public Stream<String> albumInYear(final int year) {
        return this.albums.entrySet().stream()
                .filter(i -> i.getValue() == year).map(i -> i.getKey());
    }

    @Override
    /*
     * Se è presente e se è l'album cercato allora ne conto gli elementi
     * */
    public int countSongs(final String albumName) {
        return (int) this.songs.stream()
                .filter(i -> i.getAlbumName().isPresent())
                .filter(i -> i.getAlbumName().get().equals(albumName))
                .count();
    }

    @Override
    public int countSongsInNoAlbum() {
        return (int) this.songs.stream()
                .filter(i -> i.getAlbumName().isEmpty())
                .count();
    }

    @Override
    public OptionalDouble averageDurationOfSongs(final String albumName) {
        return this.songs.stream()
                .filter(i -> i.getAlbumName().isPresent() && i.getAlbumName().get().equals(albumName))
                .mapToDouble(Song::getDuration)
                .average();
    }

    @Override
    public Optional<String> longestSong() {
        return this.songs.stream()
                .reduce((i1, i2) -> {
                    if(i1.getDuration() > i2.getDuration()) {
                        return i1;
                    }
                    
                    return i2;
                })
                .map(Song::getSongName);
    }

    @Override
    /*
     * Watched in the solutions after a few tries
     * 
     * wow, i'm a bit confused but the code is clearly understandable.
     * */
    public Optional<String> longestAlbum() {
        return this.songs.stream()
                .filter(i -> i.getAlbumName().isPresent())
                .collect(Collectors.groupingBy(i -> i.getAlbumName(), Collectors.summingDouble(i -> i.getDuration())))
                .entrySet().stream()
                .reduce((i1, i2) -> {
                    if(i1.getValue() > i2.getValue()) {
                        return i1;
                    }
                    
                    return i2;
                })
                .map(i -> i.getKey())
                .get();
    }

    private static final class Song {

        private final String songName;
        private final Optional<String> albumName;
        private final double duration;
        private int hash;

        Song(final String name, final Optional<String> album, final double len) {
            super();
            this.songName = name;
            this.albumName = album;
            this.duration = len;
        }

        public String getSongName() {
            return this.songName;
        }

        public Optional<String> getAlbumName() {
            return this.albumName;
        }

        public double getDuration() {
            return this.duration;
        }

        @Override
        public int hashCode() {
            if (hash == 0) {
                hash = songName.hashCode() ^ albumName.hashCode() ^ Double.hashCode(duration);
            }
            return hash;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof Song) {
                final Song other = (Song) obj;
                return albumName.equals(other.albumName) && songName.equals(other.songName)
                        && duration == other.duration;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Song [songName=" + songName + ", albumName=" + albumName + ", duration=" + duration + "]";
        }

    }

}
