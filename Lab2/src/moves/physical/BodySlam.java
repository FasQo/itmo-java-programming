package moves.physical;

import ru.ifmo.se.pokemon.*;

public final class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (0.3 > Math.random() && defender.getCondition() == Status.NORMAL) {
            Effect.paralyze(defender);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Body Slam";
    }
}
