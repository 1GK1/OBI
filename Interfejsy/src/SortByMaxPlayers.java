import java.util.Comparator;

public class SortByMaxPlayers implements Comparator<BoardGame> {

        public int compare(BoardGame o1, BoardGame o2) {
        return Integer.compare(o1.maxPlayers, o2.maxPlayers);
    }
}