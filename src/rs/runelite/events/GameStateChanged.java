package rs.runelite.events;

import rs.runelite.a.c;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/GameStateChanged.class */
public class GameStateChanged {
    private c gameState;

    public c getGameState() {
        return this.gameState;
    }

    public void setGameState(c cVar) {
        this.gameState = cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameStateChanged)) {
            return false;
        }
        GameStateChanged gameStateChanged = (GameStateChanged) obj;
        if (!gameStateChanged.canEqual(this)) {
            return false;
        }
        c gameState = getGameState();
        c gameState2 = gameStateChanged.getGameState();
        if (gameState == null) {
            return gameState2 == null;
        }
        return gameState.equals(gameState2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof GameStateChanged;
    }

    public int hashCode() {
        c gameState = getGameState();
        return (1 * 59) + (gameState == null ? 43 : gameState.hashCode());
    }

    public String toString() {
        return "GameStateChanged(gameState=" + String.valueOf(getGameState()) + ")";
    }
}
