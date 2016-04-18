package se.cygni.snake.player;

import se.cygni.snake.api.event.GameEndedEvent;
import se.cygni.snake.api.event.GameStartingEvent;
import se.cygni.snake.api.event.MapUpdateEvent;
import se.cygni.snake.api.event.SnakeDeadEvent;
import se.cygni.snake.api.model.PointReason;

public interface IPlayer {

    void onWorldUpdate(MapUpdateEvent mapUpdateEvent);

    void onSnakeDead(SnakeDeadEvent snakeDeadEvent);

    void onGameEnded(GameEndedEvent gameEndedEvent);

    void onGameStart(GameStartingEvent gameStartingEvent);

    void lostConnection();

    boolean isAlive();

    boolean isConnected();

    boolean isInTournament();

    void outOfTournament();

    void dead();

    void revive();

    String getName();

    String getPlayerId();

    void addPoints(PointReason reason, int points);

    void resetPoints();

    int getTotalPoints();;
}
