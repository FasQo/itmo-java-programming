package moves.status;

import ru.ifmo.se.pokemon.*;

public final class VenomDrench extends StatusMove {
    public VenomDrench() {
        super(Type.POISON, 0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (defender.getCondition() == Status.POISON) {
            defender.setMod(Stat.ATTACK, -1);
            defender.setMod(Stat.SPECIAL_ATTACK, -1);
            defender.setMod(Stat.SPEED, -1);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Venom Drench";
    }
}
