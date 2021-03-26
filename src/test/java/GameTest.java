import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void winCase() {
        assertEquals("Player 1 win!", Game.play("scissors", "paper"));
        assertEquals("Player 1 win!", Game.play("paper", "rock"));
        assertEquals("Player 1 win!", Game.play("rock", "scissors"));
    }

    @Test
    void loseCase() {
        assertEquals("Player 2 win!", Game.play("paper", "scissors"));
        assertEquals("Player 2 win!", Game.play("rock", "paper"));
        assertEquals("Player 2 win!", Game.play("scissors", "rock"));
    }

    @Test
    void drawCase() {
        assertEquals("Draw!", Game.play("paper", "paper"));
        assertEquals("Draw!", Game.play("rock", "rock"));
        assertEquals("Draw!", Game.play("scissors", "scissors"));
    }

    @Test
    void validatedCase() {
        assertDoesNotThrow(() -> {
            Game.validation("rock");
        });
        assertDoesNotThrow(() -> {
            Game.validation("paper");
        });
        assertDoesNotThrow(() -> {
            Game.validation("scissors");
        });
    }

    @Test
    void invalidatedCase() {
        assertThrows(IllegalArgumentException.class, () -> {
            Game.validation("invalidated!");
        });
    }
}