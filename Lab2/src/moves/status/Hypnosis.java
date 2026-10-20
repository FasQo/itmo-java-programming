package moves.status;

import ru.ifmo.se.pokemon.*;

public final class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.PSYCHIC, 0, 0.6);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (defender.getCondition() == Status.NORMAL) {
            Effect.sleep(defender);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Hypnosis";
    }
}
