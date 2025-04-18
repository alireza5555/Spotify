import MainSystem.*;

public class Main {
    public static void main(String[] args) {
        //tests:

        User alireza = null;
        User sara = null;
        try {
            alireza = new User("alireza", "10291029");
        } catch (Exception e) {
            System.out.println("Wrong");
        }

        try {
            sara = new User("sara", "1111");
            System.out.println(" Wrong");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "true");
        }

        try {
            sara = new User("alireza", "1111111111");
            System.out.println("Wrong");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "true");
        }
        sara = new User("sara","12345678");


        try {
            Music killShot = new Music("KillShot", alireza);
            System.out.println("true");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " wrong");

        }

        Music another = new Music ("Faint", alireza);
        Music faint = new Music("Faint", sara);

        sara.follow(alireza);
        alireza.follow(sara);
        for(User temp : alireza.getFollowerList()) {
            System.out.println(temp.getUsername());
        }

        for(User temp : alireza.getFollowingList()) {
            System.out.println(temp.getUsername());
        }

        Playlist playlist = new Playlist("rap",alireza);
        playlist.addMusic(faint,"10291029");
        playlist.addMusic(another,"10291029");

        try{
            playlist.addMusic(faint,"10291029");
            System.out.println("Wrong");
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " true");
        }

        try{
            playlist.addMusic(faint,"1112222");
            System.out.println("wrong");
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " True");
        }

        for(Music temp : playlist.searchInPlaylist("Faint")){
            temp.play();
        }

        playlist.removeMusic("Faint","sara","10291029");
        playlist.editTitle("wtf","10291029");

        playlist.playPlayList();

        alireza.playMusic(faint);
        alireza.playMusic(faint);
        alireza.playMusic(faint);

        try {
            alireza.playMusic(faint);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        alireza.buyPremium(2);
        alireza.playMusic(faint);

    }
}