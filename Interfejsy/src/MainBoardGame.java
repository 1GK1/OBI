import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainBoardGame {
    public static void main(String[] args) {
        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames of Jup", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico v. 2", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Tierra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe and Him", 8.31, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid Mark", 7.92, new BigDecimal("145.00"), 2, 6),
                new BoardGame("7 Wonders of...", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dome: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork Moon", 7.77, new BigDecimal("75.00"), 2, 2),
                new BoardGame("Castles of Burg", 8.12, new BigDecimal("129.95"), 2, 4)
        );


// sorting using Comparator interface - by rating
        SortByRating byRating = new SortByRating();
        Collections.sort(games, byRating);

// sorting using Comparator interface - by maximum number of players
//        SortByMaxPlayers byMaxPlayers = new SortByMaxPlayers();
//        Collections.sort(games, byMaxPlayers);

        // sorting using Comparable interface
//        Collections.sort(games);

        for (BoardGame game : games)
            System.out.println(game.toString());
    }
}
