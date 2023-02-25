public abstract class Enemy {
    protected String name;

    public Enemy(String name) {
        this.name = name;
    }

    public abstract void attack();
}

public class Goblin extends Enemy {
    public Goblin(String name) {
        super(name);
    }

    public void attack() {
        System.out.println(name + " attacks with a club!");
    }
}

public class Orc extends Enemy {
    public Orc(String name) {
        super(name);
    }

    public void attack() {
        System.out.println(name + " attacks with an axe!");
    }
}

// Without using the Factory Pattern, we would need to manually create each enemy
Goblin goblin1 = new Goblin("Bob");
goblin1.attack(); // prints "Bob attacks with a club!"

Goblin goblin2 = new Goblin("John");
goblin2.attack(); // prints "John attacks with a club!"

Orc orc1 = new Orc("Samantha");
orc1.attack(); // prints "Samantha attacks with an axe!"

Orc orc2 = new Orc("Carl");
orc2.attack(); // prints "Carl attacks with an axe!"

