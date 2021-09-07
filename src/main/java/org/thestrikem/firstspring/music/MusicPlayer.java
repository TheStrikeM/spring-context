package org.thestrikem.firstspring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private int countOfPrint;

    private MusicPlayer() {}

    public static MusicPlayer getMusicPlayerFactory() {
        return new MusicPlayer();
    }

    private void doInit() {
        System.out.println(String.format("[%s] Doing initialization...", "MusicPlayer"));
    }
    private void doDestroy() {
        System.out.println(String.format("[%s] Doing destruction...", "MusicPlayer"));
    }

    public void playMusic() {
        for (int i = 0; i < this.getCountOfPrint(); i++)
            System.out.println("Playing: " + music.getSong());
    }

    @Autowired
    @Qualifier("rapMusic")
    public void setMusicList(Music music) {
        this.music = music;
    }

    public int getCountOfPrint() {
        return countOfPrint;
    }

    @Autowired
    public void setCountOfPrint(int countOfPrint) {
        this.countOfPrint = countOfPrint;
    }
}
