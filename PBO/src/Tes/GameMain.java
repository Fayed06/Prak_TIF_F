package Tes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        boolean GameOver = false;
        int turn = 1;
        Character Enemy = new Titan();
        Character Champ;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Game");
        System.out.print("Insert Your Name : ");
        String nama = input.nextLine();
        Character champ = Choose();

        while (!GameOver) {
            System.out.println("======== Turn " + turn + " Begin ========");
            champ.attacking(Enemy);
            //check Game Over dan printout Health tiap Turn
            if (champ.getHP() <= 0 || Enemy.getHP() <= 0) {
                GameOver = true;
                break;
            }
            Enemy.attacking(champ);
            System.out.println(champ.getClass().getSimpleName() + " Health\t: " + champ.getHP());
            System.out.println("Titan Health\t: " + Enemy.getHP() + "\n");
            turn++;
        }

        //Output GameOver
        if (Enemy.getHP() <= 0) {
            System.out.println("\n====================================================");
            System.out.println("The Titan has been slaughtered☠ by " + nama + " The " + champ.getClass().getSimpleName());
            System.out.println("====================================================");
        } else {
            System.out.println("\n====================================================");
            System.out.println(nama + " The " + champ.getClass().getSimpleName() + " has been slained☠ by the titan");
            System.out.println("====================================================");
        }
        System.out.println("");
        champ.info();
        Enemy.info();

    }

    public static Character Choose() {
        Scanner input = new Scanner(System.in);
        Character Champ = null;
        System.out.println("Choose Your Champion");
        System.out.println("1. Magician " + "💫" + "\n2. Healer " + "\uD83D\uDE07" + "\n3. Warrior " + "\u2694");
        int choose = 0;
        try {
            choose = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\nTolong Masukkan Pilihan Berupa Angka 1 Hingga 3!");
            Champ = Choose();
            return Champ;
        }
        switch (choose) {
            case 1: {
                Champ = new Magician();
                return Champ;
            }
            case 2: {
                Champ = new Healer();
                return Champ;
            }
            case 3: {
                Champ = new Warrior();
                return Champ;
            }
            default: {
                System.out.println("\nPilihan Hanya 1 hingga 3, tidak ada pilihan " + choose);
                Champ = Choose();
                return Champ;
            }
        }
    }

}

abstract class Character {

    public static int turn = 1;

    public Character(int defense, int attack, int HP) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    private int defense, attack, HP;

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        setHP(HP - (damage - defense));
    }

    public abstract void info();

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        if (HP < 0) {
            this.HP = 0;
            return;
        }
        this.HP = HP;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public void attacking(Character Enemy) {
        if (this instanceof Titan) {
            if (Enemy.attack()) {
                Enemy.receiveDamage(Enemy.getAttack());
                System.out.println("The titan attacked the " + Enemy.getClass().getSimpleName() + " with " + this.getAttack() + " damage successfully.");
            } else {
                System.out.println(Enemy.getClass().getSimpleName() + " evade the titan attack");
            }
        } else {
            if (this instanceof Healer) {
                if (turn % 2 == 0) {
                    ((Healer) this).heal();
                    System.out.println("Healer Use Heal, HP increase by 25 point");
                } else {
                    if (this.attack()) {
                        Enemy.receiveDamage(this.getAttack());
                        System.out.println(this.getClass().getSimpleName() + " attacked the Titan with " + this.getAttack() + " damage successfully.");
                    } else {
                        System.out.println("The titan has evade the attack");
                    }
                }
            } else {
                if (this.attack()) {
                    Enemy.receiveDamage(this.getAttack());
                    System.out.println(this.getClass().getSimpleName() + " attacked the Titan with " + this.getAttack() + " damage successfully.");
                } else {
                    System.out.println("The titan has evade " + this.getClass().getSimpleName() + " the attack");
                }
            }
            turn++;
        }
    }

}

class Magician extends Character {

    public Magician() {
        super(10, 60, 100);
    }

    @Override
    public boolean attack() {
        double change = (int) ((Math.random() * 100) + 1);
        if (change > 35) {
            return false;
        }
        return true;
    }

    @Override
    public void info() {
        System.out.println("======== YOUR CHAMPION ========\n"
                + "Role\t\t\t: " + getClass().getSimpleName() + "\n"
                + "Remaining Health\t: " + super.getHP() + "\n"
                + "Attack Power\t\t: " + super.getAttack() + "\n"
                + "Defense Power\t\t: " + super.getDefense() + "\n");
    }

}

class Healer extends Character {

    public Healer() {
        super(10, 10, 70);
    }

    @Override
    public boolean attack() {
        double change = (int) ((Math.random() * 100) + 1);
        if (change > 85) {
            return false;
        }
        return true;
    }

    @Override
    public void info() {
        System.out.println("======== YOUR CHAMPION ========\n"
                + "Role\t\t\t: " + getClass().getSimpleName() + "\n"
                + "Remaining Health\t: " + super.getHP() + "\n"
                + "Attack Power\t\t: " + super.getAttack() + "\n"
                + "Defense Power\t\t: " + super.getDefense() + "\n");
    }

    public void heal() {
        this.setHP(getHP() + 25);
    }

}

class Warrior extends Character {

    public Warrior() {
        super(30, 25, 80);
    }

    @Override
    public boolean attack() {
        double change = (int) ((Math.random() * 100) + 1);
        if (change > 60) {
            return false;
        }
        return true;
    }

    @Override
    public void info() {
        System.out.println("======== YOUR CHAMPION ========\n"
                + "Role\t\t\t: " + getClass().getSimpleName() + "\n"
                + "Remaining Health\t: " + super.getHP() + "\n"
                + "Attack Power\t\t: " + super.getAttack() + "\n"
                + "Defense Power\t\t: " + super.getDefense() + "\n");
    }
}

class Titan extends Character {

    public Titan() {
        super(0, 45, 200);
    }

    @Override
    public boolean attack() {
        double change = (int) (Math.random() * 100) + 1;
        if (change > 40) {
            return false;
        }
        return true;
    }

    @Override
    public void info() {
        System.out.println("======== ENEMY ========\n"
                + "Role\t\t\t: " + getClass().getSimpleName() + "\n"
                + "Remaining Health\t: " + super.getHP() + "\n"
                + "Attack Power\t\t: " + super.getAttack() + "\n"
                + "Defense Power\t\t: " + super.getDefense() + "\n");
    }

}
