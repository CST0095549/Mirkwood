package script;

import com.googlecode.lanterna.TerminalPosition;

import gui.Map;

public class Characters {

    Hero hero;
    Foe foe;

    public Characters() {
        super();

        hero = new Hero("Sir Guinetti", new TerminalPosition(2, Map.LINES - 2));
        foe = new Foe("Sauron", new TerminalPosition(Map.COLUMNS - 48, 2));     // Posição do FOE atual!!!
        
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Foe getFoe() {
        return foe;
    }

    public void setFoe(Foe foe) {
        this.foe = foe;
    }

}
