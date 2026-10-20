package moves.special;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (0.1 > Math.random()) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Energy Ball";
    }
}
