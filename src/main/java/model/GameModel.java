package model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private PlayerModel playerModel;
    private DungeonModel dungeonModel;
    private int width;
    private int height;
    private int currentMaze;
    private List<Maze> mazes = new ArrayList<>();

    public GameModel(int width, int height) {
        this.width = width;
        this.height = height;
        this.dungeonModel = new DungeonModel(390,390, mazes.get(currentMaze));
        this.playerModel = new PlayerModel(10,10);
    }

    public DungeonModel getDungeonModel() {
        return dungeonModel;
    }

    public PlayerModel getPlayerModel() { return playerModel; }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}