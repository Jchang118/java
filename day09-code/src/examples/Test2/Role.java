package examples.Test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

//    attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

//    injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (this.gender == '男') {
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        } else if (this.gender == '女') {
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        } else {
            this.face = "面目狰狞";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void attach(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String Kungfu = attacks_desc[index];
        System.out.printf(Kungfu, this.getName(), role.getName());
        System.out.println();

        int hurt = r.nextInt(20) + 1;
        int remainingBlood = role.getBlood() - hurt;
        remainingBlood = remainingBlood < 0 ? 0 : remainingBlood;
        role.setBlood(remainingBlood);

        int injureIndex;
        if (role.getBlood() > 90) injureIndex = 0;
        else if (role.getBlood() > 80) injureIndex = 1;
        else if (role.getBlood() > 70) injureIndex = 2;
        else if (role.getBlood() > 60) injureIndex = 3;
        else if (role.getBlood() > 40) injureIndex = 4;
        else if (role.getBlood() > 20) injureIndex = 5;
        else if (role.getBlood() > 10) injureIndex = 6;
        else injureIndex = 7;
        String injure = injureds_desc[injureIndex];
        System.out.printf(injure, role.getName());
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为: " + this.getName() + "\n血量为: " + this.getBlood() + "\n性别为: " + this.getGender() + "\n长相为: " + this.getFace());
    }
}
