package view;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import model.Wall;
import model.DungeonModel;

public class DungeonView {
    public void draw(TerminalScreen screen,DungeonModel model){
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#4d4d4d"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(model.getWidth(),model.getHeight()), ' ');
        graphics.setForegroundColor(TextColor.Factory.fromString("#D9D9D9"));
        graphics.putString(new TerminalPosition(72,1), "TIME PLAYED", SGR.BOLD,SGR.UNDERLINE);
        graphics.disableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(76,3), "seconds");
        if(model.getKey() == null)
            model.getLadder().draw(graphics);
        for(Wall wall : model.getWalls())
            wall.draw(graphics);
        if(model.getKey()!= null)
            model.getKey().draw(graphics);
    }
}