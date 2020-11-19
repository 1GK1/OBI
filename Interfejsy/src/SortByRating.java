import java.util.Comparator;

public class SortByRating implements Comparator<BoardGame> {

    @Override
    public int compare(BoardGame o1, BoardGame o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}

