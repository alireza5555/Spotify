package MainSystem;

import java.util.ArrayList;
public class User {

    public User (String username , String password ){
        setUsername(username);
        setPassword(password);
        behavior = new RegularBehavior();
        allUsers.add(this);
    }

    private String username;
    private String password;

    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    ArrayList<Playlist> playlists = new ArrayList<>();
    static ArrayList<User> allUsers = new ArrayList<>();

    UserBehavior behavior ;

    void follow (User user){
        followingList.add(user);
    }

    void createPlaylist (String title){
        this.behavior.createPlaylist(title, this);
    }

    void playMusic (Music music){
        this.behavior.playMusic(music);
    }

    void buyPremium (int month){
        this.behavior = new PremiumBehavior(month);
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
        for (User temp : User.allUsers){
            if(temp.username.equals(username)){
                throw new InvalidOperationException("this username already exist.");
            }
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if(password.length() < 8){
            throw new InvalidOperationException("password length must be at least 8 or more");
        }
        this.password = password;
    }

    public void setFollowerList(ArrayList<User> followerList) {
        this.followerList = followerList;
    }

    public void setFollowingList(ArrayList<User> followingList) {
        this.followingList = followingList;
    }
}
