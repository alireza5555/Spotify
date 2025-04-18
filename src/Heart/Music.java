package Heart;

import java.util.ArrayList;

public class Music {

    String title;
    User singer;
    int numberOfStream = 0;

    static ArrayList<Music> allMusics;

    public void play (){
        System.out.println("\uD83C\uDFB5 Now Playing: " + title + "   Singer: " + singer + "\n" +
                "[■■■■■■■■■□□□□□□]");
        numberOfStream ++ ;
    }

    public ArrayList<Music> search (String music){
        ArrayList<Music> anotherTemp = new ArrayList<>();
        for (Music temp : allMusics){
            if(temp.title.equals(music)) anotherTemp.add(temp);
        }
        return anotherTemp;

    }

    public Music search (String music , String singer){
        for (Music temp : allMusics){
            if(temp.title.equals(music) && temp.singer.getUsername().equals(singer)) return temp;
        }
        return null;

    }

}
