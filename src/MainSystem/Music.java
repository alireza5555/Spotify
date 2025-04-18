package MainSystem;

import java.util.ArrayList;

public class Music {

    public Music (String title , User singer){
            this.singer = singer;
            this.title = title;

    }

    private String title;
    private User singer;
    int numberOfStream = 0;

    static ArrayList<Music> allMusics = new ArrayList<>();

    public void play (){
        System.out.println("\uD83C\uDFB5 Now Playing: " + getTitle() + "   Singer: " + singer.getUsername() + "   number of stream: " + numberOfStream + "\n" +
                "[■■■■■■■■■□□□□□□]");
        numberOfStream ++ ;
    }

    public static ArrayList<Music> search (String music){
        ArrayList<Music> anotherTemp = new ArrayList<>();
        for (Music temp : allMusics){
            if(temp.getTitle().equals(music)) anotherTemp.add(temp);
        }
        if(anotherTemp.isEmpty())return null;
        return anotherTemp;

    }

    public static Music search (String music , String singer){
        for (Music temp : allMusics){
            if(temp.getTitle().equals(music) && temp.getSinger().getUsername().equals(singer)) return temp;
        }
        return null;

    }

    public String getTitle() {
        return title;
    }

    public User getSinger() {
        return singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(User singer) {
        this.singer = singer;
    }
}
