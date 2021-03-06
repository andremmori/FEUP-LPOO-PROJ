package com.g38.view;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.g38.model.GameModel;
import com.g38.model.PlayerModel;

public class PlayerView {
    public void draw(Screen screen, GameModel model){
        PlayerModel player = model.getPlayerModel();
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setForegroundColor(TextColor.Factory.fromString(player.getColor()));
        graphics.putString(player.getPosition().getX(), player.getPosition().getY(), Character.toString(player.getCharacter()), SGR.BOLD);

    }
}
