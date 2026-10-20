package moves.status;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.ATTACK, 2);
        Effect.confuse(defender);
    }

    @Override
    protected String describe() {
        return "Использует атаку Swagger";
    }
}
