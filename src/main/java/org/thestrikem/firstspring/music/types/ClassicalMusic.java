package org.thestrikem.firstspring.music.types;

import org.springframework.stereotype.Component;
import org.thestrikem.firstspring.music.Music;

@Component
public class ClassicalMusic implements Music {
    private String song = "ClassicalMusic";

    @Override
    public String getSong() {
        return song;
    }
}
