package pokemons;

import moves.physical.Crunch;
import moves.special.Hurricane;
import moves.status.Agility;
import moves.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Tornadus extends Pokemon {

    public Tornadus(String name, int level) {
        super(name, level);
        setType(Type.FLYING);
        setStats(79, 115, 70, 125, 80, 111);
        setMove(new Crunch(), new Agility(), new Hurricane(), new DoubleTeam());
    }
}
