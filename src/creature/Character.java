package creature;

import weapon.Weapon;

public abstract class Character implements Creature{
    private String name;
    private int hp;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp>=0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public Character(String name, int hp, String weapon){
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setName(name);
        this.setHp(hp);
    }

    public final boolean isAlive(){
        if(getHp()>0){
            return true;
        }else{
            return false;
        }
    }

    public void die(){
        System.out.println(this.getName() + "は死んでしまった！");
    }

    public void showStatus(){
        System.out.println(this.getName() + "：HP " + this.getHp());
    }
}
