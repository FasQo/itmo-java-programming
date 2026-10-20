package moves.special;

import ru.ifmo.se.pokemon.*;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (0.3 > Math.random() && defender.getCondition() == Status.NORMAL) {
            Effect.poison(defender);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Sludge Bomb";
    }
}
