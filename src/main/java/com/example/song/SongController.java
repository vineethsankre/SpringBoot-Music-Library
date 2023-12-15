package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.Song;

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);

    }

    @PostMapping("/songs")
    public Song addNewSong(@RequestBody Song song) {
        return songService.addNewSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);

    }

}