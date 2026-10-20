package moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public final class Hurricane extends SpecialMove {
    public Hurricane() {
        super(Type.FLYING, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (0.3 > Math.random()) {
            Effect.confuse(defender);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Hurricane";
    }
}
