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

}