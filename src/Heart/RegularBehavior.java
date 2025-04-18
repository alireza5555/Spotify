package Heart;

public class RegularBehavior implements UserBehavior {
    int playingLimit = 5;

    @Override
    public void createPlaylist(String Title, User Owner) {
        throw new InvalidOperationException("Regular users can't create playlist.")
    }

    @Override
    public void playMusic(Music music) {

        if(playingLimit == 0) throw new InvalidOperationException("You have reached your playing limit.")
        else playingLimit --;
    }

    @Override
    public void buyPremium(User owner, int month) {

    }
}
