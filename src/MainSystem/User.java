package MainSystem;

import java.util.ArrayList;
public class User {
    private String username;
    private String password;

    private ArrayList<User> followerList;
    private ArrayList<User> followingList;
    ArrayList<Playlist> playlists = new ArrayList<>();
    static ArrayList<User> allUsers = new ArrayList<>();

    UserBehavior behavior = new RegularBehavior();

    void follow (User user){
        followingList.add(user);
    }

    void createPlaylist (String title, User owner){
        this.behavior.createPlaylist(title, owner);
    }

    void playMusic (Music music){
        this.behavior.playMusic(music);
    }

    void buyPremium (User owner , int month){
        this.behavior.buyPremium(owner , month);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<User> getFollowerList() {
        return followerList;
    }

    public ArrayList<User> getFollowingList() {
        return followingList;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFollowerList(ArrayList<User> followerList) {
        this.followerList = followerList;
    }

    public void setFollowingList(ArrayList<User> followingList) {
        this.followingList = followingList;
    }
}
