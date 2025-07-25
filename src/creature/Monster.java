package creature;

public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

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

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public Monster(String name, char suffix, int hp){
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setName(name);
        this.setSuffix(suffix);
        this.setHp(hp);
    }

    public final boolean isAlive(){
        if(getHp()>0){
            return true;
        }else{
            return false;
        }
    }

    public void showStatus(){
        System.out.println(this.name + "：HP " + this.hp);
    }
}
