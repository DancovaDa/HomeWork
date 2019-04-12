package ru.TaraskovaDarya;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void playMusic(){
        for(Music song: musicList)
        System.out.println("Playing: " + song.getSong());

    }
}
