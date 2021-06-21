package Letter.School;

import java.util.Scanner;

/**
 * @author Liu
 * 动物父类
 */
public abstract class Animal {
    /**
     * 姓名、性别、健康值、亲密度
     */
    private String name;
    private String sex;
    private int heath;
    private int close;
    private String species;

    public Animal() {
    }

    public Animal(String name, String sex, int heath, int close, String species) {
        this.name = name;
        this.sex = sex;
        this.heath = heath;
        this.close = close;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        if (heath < 0 || heath > 100) {
            this.heath = 60;
            System.out.println("健康度输入有误！");
            return;
        }
        this.heath = heath;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        if (close < 0 || close > 100) {
            this.close = 60;
            System.out.println("亲密度输入有误！");
            return;
        }
        this.close = close;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void showInfo() {
        System.out.println(species + "的自白：");
        System.out.println("我的名字叫" + name + ",健康值为" + heath + "，和主人的亲密度是"
                + close + ",我的性别是" + sex);
    }


}
