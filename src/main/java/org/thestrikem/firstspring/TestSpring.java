package org.thestrikem.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thestrikem.firstspring.music.MusicPlayer;

/**
 * @author TheStrikeM
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
