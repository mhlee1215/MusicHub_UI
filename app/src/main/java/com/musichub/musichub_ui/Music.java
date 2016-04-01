package com.musichub.musichub_ui;

/**
 * Created by mhlee on 4/1/16.
 */
public class Music {
    String title;
    String singer;
    String playtime;

    public Music(String title, String singer){
        this.title = title;
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }
}
