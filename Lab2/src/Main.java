import pokemons.*;
import ru.ifmo.se.pokemon.*;

final class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Budew budew = new Budew("Budew", 1);
        Glameow glameow = new Glameow("Glameow", 1);
        Purugly purugly = new Purugly("Purugly", 45);
        Roselia roselia = new Roselia("Roselia", 1);
        Roserade roserade = new Roserade("Roserade", 1);
        Tornadus tornadus = new Tornadus("Tornadus", 1);

        battle.addAlly(budew);
        battle.addAlly(glameow);
        battle.addAlly(purugly);

        battle.addFoe(roselia);
        battle.addFoe(roserade);
        battle.addFoe(tornadus);

        battle.go();
    }
}