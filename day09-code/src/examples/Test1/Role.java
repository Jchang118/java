package examples.Test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {}

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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
        Random ran = new Random();
        int hurt = ran.nextInt(20) + 1;
        int remainingBlood = role.getBlood() - hurt;
        remainingBlood = remainingBlood < 0 ? 0 : remainingBlood;
        role.setBlood(remainingBlood);
        System.out.println(this.getName() + "举起拳头, 打了" + role.getName() + "一下, " +
                "造成了" + hurt + "点伤害, " + role.getName() + "还剩下了" + remainingBlood + "点血");
    }

}
