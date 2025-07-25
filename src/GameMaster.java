import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        ArrayList<Character> party = new ArrayList<Character>();

        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 20);
        Thief thief = new Thief("盗賊", 70);

        party.add(hero);
        party.add(wizard);
        party.add(thief);

        System.out.println("---味方パーティ---");
        hero.showStatus();
        wizard.showStatus();
        thief.showStatus();


        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Matango matango = new Matango('A', 45);
        Goblin goblin = new Goblin('A', 50);
        Slime slime = new Slime('A', 40);

        monsters.add(matango);
        monsters.add(goblin);
        monsters.add(slime);

        System.out.println("---敵グループ---");
        matango.showStatus();
        goblin.showStatus();
        slime.showStatus();


        System.out.println("\n味方の総攻撃！");
        for(int i = 0; i < party.size(); i++){
            for(int j = 0; j < monsters.size(); j++){
                party.get(i).attack(monsters.get(j));
            }
        }

        System.out.println("\n敵の総攻撃！");
        for(int i = 0; i < monsters.size(); i++){
            for(int j = 0; j < party.size(); j++){
                monsters.get(i).attack(party.get(j));
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero sh = new SuperHero(hero);
        party.set(0,sh);
        for(int i = 0; i < monsters.size(); i++){
            sh.attack(monsters.get(i));
        }




        System.out.println("\n---味方パーティ最終ステータス---");
        for(int i = 0; i < party.size(); i++){
            party.get(i).showStatus();
            if(party.get(i).isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：戦闘不能");
            }
        }

        System.out.println("\n---敵グループ最終ステータス---");
        for(int i = 0; i < monsters.size(); i++){
            monsters.get(i).showStatus();
            if(monsters.get(i).isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
