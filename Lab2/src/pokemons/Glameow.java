package pokemons;

import moves.status.HoneClaws;
import moves.status.Hypnosis;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glameow extends Pokemon {
    public Glameow(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(49, 55, 42, 42, 37, 85);
        setMove(new Swagger(), new HoneClaws(), new Hypnosis());
    }
}
