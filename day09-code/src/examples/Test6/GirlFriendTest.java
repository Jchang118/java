package examples.Test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("Jodie", 36, "female", "skiing");
        GirlFriend gf2 = new GirlFriend("Stella", 41, "female", "badminton");
        GirlFriend gf3 = new GirlFriend("Mia", 35, "female", "singing");
        GirlFriend gf4 = new GirlFriend("Lily", 32, "female", "reading");
        girlFriends[0] = gf1;
        girlFriends[1] = gf2;
        girlFriends[2] = gf3;
        girlFriends[3] = gf4;

        int sum = 0;
        for (int i = 0; i < girlFriends.length; i++) {
            sum += girlFriends[i].getAge();
        }

        int average = sum / girlFriends.length;
        int count = 0;
        for (int i = 0; i < girlFriends.length; i++) {
            if (girlFriends[i].getAge() < average) {
                System.out.println(girlFriends[i].getName() + "," + girlFriends[i].getAge() + "," + girlFriends[i].getHobby());
                count++;
            }
        }
        System.out.println(count);
    }
}
