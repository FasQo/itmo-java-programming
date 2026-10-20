package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (0.2 > Math.random()) {
            defender.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Crunch";
    }
}
