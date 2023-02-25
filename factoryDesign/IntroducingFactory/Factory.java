public abstract class Enemy {
    protected String name;

    public Enemy(String name) {
        this.name = name;
    }

    public abstract void attack();
}

public class Creeper extends Enemy {
    public Creeper(String name) {
        super(name);
    }

    public void attack() {
        System.out.println(name + " attacks with a gun!");
    }
}

public class Monster extends Enemy {
    public Monster(String name) {
        super(name);
    }

    public void attack() {
        System.out.println(name + " attacks with an axe!");
    }
}

public class EnemyFactory {
    public Enemy createEnemy(String enemyType, String name) {
        if (enemyType.equalsIgnoreCase("Creeper")) {
            return new Creeper(name);
        } else if (enemyType.equalsIgnoreCase("Monster")) {
            return new Monster(name);
        } else {
            throw new IllegalArgumentException(enemyType + " is not a valid enemy type!");
        }
    }
}

//Driver Code
EnemyFactory factory = new EnemyFactory();
Enemy enemy = factory.createEnemy("Goblin", "Bob");
enemy.attack(); // prints "Bob attacks with a club!"
