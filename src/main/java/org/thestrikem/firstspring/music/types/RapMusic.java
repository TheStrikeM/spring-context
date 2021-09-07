package org.thestrikem.firstspring.music.types;

import org.springframework.stereotype.Component;
import org.thestrikem.firstspring.music.Music;

@Component
public class RapMusic implements Music {
    private String song = "RapMusic";

    @Override
    public String getSong() {
        return song;
    }
}
