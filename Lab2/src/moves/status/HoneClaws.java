package moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

final class HoneClaws extends StatusMove {
    public HoneClaws() {
        super(Type.DARK, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.ATTACK, 1);

        attacker.setMod(Stat.ACCURACY, 1);

    }

    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "Использует атаку Hone Claws";
    }
}
