package MainSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    public Playlist(String title , User owner){
        this.owner = owner;
        this.title = title;
    }

    String title;
    User owner;

    ArrayList<Music> playlist;

    public void editTitle(String name ,  String pass) throws InvalidOperationException {
        if(checkPass(pass))
        title = name;
        else throw new InvalidOperationException("Wrong password");
    }

    public void addMusic (Music music,String pass) throws InvalidOperationException {
        if(checkPass(pass))
            playlist.add(music);
        else throw new InvalidOperationException("Wrong password");
    }

    public void removeMusic (String title , String singer ,String pass) throws InvalidOperationException {
        if(checkPass(pass))
            for (int i = 0 ; i < playlist.size() ; i++){
                if(playlist.get(i).title.equals(title) && playlist.get(i).singer.equals(singer)) {
                    playlist.remove(i);
                    System.out.println("Deleted successfully");
                }
            }
        else throw new InvalidOperationException("Wrong password");
    }

    public boolean checkPass(String pass){
        return owner.getPassword().equals(pass);
    }

    public ArrayList<Music> search (String music){
        ArrayList<Music> anotherTemp = new ArrayList<>();
        for (Music temp : playlist){
            if(temp.title.equals(music)) anotherTemp.add(temp);
        }
        return anotherTemp;

    }

    public Music search (String music , String singer){
        for (Music temp : playlist){
            if(temp.title.equals(music) && temp.singer.getUsername().equals(singer)) return temp;
        }
        return null;

    }

    public void playPlayList(){
        for (Music temp : playlist){
            temp.play();
            System.out.println("if you want go to next music press 1 otherwise press any key to stop.");
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            if(!(str.equals(1))) {
                System.out.println("Play list has been stopped.");
                return;
            }
        }
    }



}
