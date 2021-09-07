package org.thestrikem.firstspring.music.types;

import org.springframework.stereotype.Component;
import org.thestrikem.firstspring.music.Music;

@Component
public class RockMusic implements Music {
    private String song = "RockMusic";

    @Override
    public String getSong() {
        return song;
    }
}
