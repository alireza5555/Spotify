package MainSystem;

import java.util.ArrayList;

public class Music {

    public Music (String title , User singer){
        this.singer = singer;
        this.title = title;

    }

    String title;
    User singer;
    int numberOfStream = 0;

    static ArrayList<Music> allMusics = new ArrayList<>();

    public void play (){
        System.out.println("\uD83C\uDFB5 Now Playing: " + title + "   Singer: " + singer + "\n" +
                "[■■■■■■■■■□□□□□□]");
        numberOfStream ++ ;
    }

    public static ArrayList<Music> search (String music){
        ArrayList<Music> anotherTemp = new ArrayList<>();
        for (Music temp : allMusics){
            if(temp.title.equals(music)) anotherTemp.add(temp);
        }
        if(anotherTemp.isEmpty())return null;
        return anotherTemp;

    }

    public static Music search (String music , String singer){
        for (Music temp : allMusics){
            if(temp.title.equals(music) && temp.singer.getUsername().equals(singer)) return temp;
        }
        return null;

    }

}
