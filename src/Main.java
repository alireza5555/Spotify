import MainSystem.*;

public class Main {
    public static void main(String[] args) {

        // user tests:

        User alireza = null;
        User sara = null;
        try {
            alireza = new User("alireza", "10291029");
        } catch (Exception e) {
            System.out.println("❌ ");
        }

        try {
            sara = new User("sara", "1111");
            System.out.println(" ❌ ");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "✅");
        }

        try {
            sara = new User("alireza", "1111111111");
            System.out.println("❌ ");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "✅");
        }
        sara = new User("sara","12345678");

            //Music tests:

        try {
            Music killShot = new Music("KillShot", alireza);
            System.out.println("✅");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " ❌ ");

        }

        Music another = new Music ("Faint", alireza);
        Music faint = new Music("Faint", sara);

        //follower tests:

        sara.follow(alireza);
        alireza.follow(sara);
        for(User temp : alireza.getFollowerList()) {
            System.out.println(temp.getUsername());
        }

        for(User temp : alireza.getFollowingList()) {
            System.out.println(temp.getUsername());
        }

        //play music tests:

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

        //playlist tests

        alireza.createPlayList("rap");
        Playlist playlist = alireza.getPlayList("rap");
        playlist.addMusic(faint,"10291029");
        playlist.addMusic(another,"10291029");

        try{
            playlist.addMusic(faint,"10291029");
            System.out.println("❌ ");
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " ✅");
        }

        try{
            playlist.addMusic(faint,"1112222");
            System.out.println("❌ ");
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " ✅");
        }

        for(Music temp : playlist.searchInPlaylist("Faint")){
            temp.play();
        }

        playlist.removeMusic("Faint","sara","10291029");
        playlist.editTitle("wtf","10291029");

        playlist.playPlayList();


    }
}