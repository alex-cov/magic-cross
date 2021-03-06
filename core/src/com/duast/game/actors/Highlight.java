package com.duast.game.actors;

import com.badlogic.gdx.graphics.Color;
import com.duast.game.stages.GameStage;
import com.duast.game.utils.C;

import static com.duast.game.utils.C.COLUMN;
import static com.duast.game.utils.C.ROW;

/**
 * Created by alex on 10/21/16.
 */

public class Highlight extends MyActor {

    private GameStage game;
    private int line;

    public Highlight(GameStage game) {
        this.game = game;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setLineNumber(int line_n) {
        if(line==ROW) setPosition(C.PAD_LR-C.DIST, game.getCross().get(0, line_n).getY()-C.DIST);
        if(line==COLUMN) setPosition(game.getCross().get(line_n, 0).getX()-C.DIST, C.PAD_DOWN-C.DIST);
    }

    public void setTheme(int theme) {
        Color color;
        switch(theme) {
            case C.LIGHT: color = C.BLACK; break;
            case C.DARK: color = C.WHITE; break;
            default: color = C.BLACK; break;
        }
        setColor(color);
    }

    public void show() {
        setVisible(true);
    }

    public void hide() {
        setVisible(false);
    }
}
