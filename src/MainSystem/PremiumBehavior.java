package MainSystem;

public class PremiumBehavior implements UserBehavior{

    public PremiumBehavior (int month){
        this.month = month;
    }

    int month;

    @Override
    public void createPlaylist(String title, User owner) {
        Playlist temp = new Playlist(title , owner);
        owner.playlists.add(temp);

    }

    @Override
    public void playMusic(Music music) {
        music.play();
    }

    @Override
    public void buyPremium(User owner, int month) {
        this.month += month;
    }
}
