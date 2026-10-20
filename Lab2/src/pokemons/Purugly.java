package pokemons;

import moves.physical.BodySlam;

public final class Purugly extends Glameow {

    public Purugly(String name, int level) {
        super(name, level);
        setStats(71, 82, 64, 64, 59, 112);
        addMove(new BodySlam());
    }
}
