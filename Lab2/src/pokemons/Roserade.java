package pokemons;

import moves.status.VenomDrench;

public final class Roserade extends Roselia {
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60, 70, 65, 125, 105, 90);
        addMove(new VenomDrench());
    }
}
