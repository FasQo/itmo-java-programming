package pokemons;

import moves.special.EnergyBall;
import moves.special.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(40, 30, 35, 50, 70, 55);
        setMove(new SludgeBomb(), new EnergyBall());
    }
}
