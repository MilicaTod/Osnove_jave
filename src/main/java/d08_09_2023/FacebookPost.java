package d08_09_2023;

public class FacebookPost {


    public String userSender;
    public String userProfile;
    public String text;
    public int likes;
    public int shares;

    public void like() {
        if (this.likes == 0) {
            this.likes = 0;
        }
        this.likes = this.likes + 1;
    }

    public void dislike() {
        if (this.likes < 0) {
            this.likes = 0;
        }
        this.likes = this.likes - 1;
    }

    public void share() {
        if (this.shares == 0) {
            this.shares = 0;
        }
        this.shares = this.shares + 1;

    }

    public void print() {
        System.out.println(this.userSender + " >>> " + this.userProfile);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | Shares " + this.shares);
    }

}
