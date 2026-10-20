package moves.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class GigaDrain extends SpecialMove {
    private double actualDamage;

    public GigaDrain() {
        super(Type.GRASS, 75, 1.0);
    }

    @Override
    protected void applyOppDamage(Pokemon defender, double damage) {
        actualDamage = Math.min(defender.getHP(), damage);
        super.applyOppDamage(defender, damage);
    }

    @Override
    protected void applySelfDamage(Pokemon attacker, double damage) {
        double heal = Math.min(actualDamage / 2, attacker.getStat(Stat.HP) - attacker.getHP());
        attacker.setMod(Stat.HP, -(int) Math.round(heal));
    }

    @Override
    protected String describe() {
        return "Использует атаку Giga Drain";
    }
}
