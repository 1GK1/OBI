import java.math.BigDecimal;

public class BoardGame implements Comparable<BoardGame> {
    public final String name;
    public final double rating;
    public final BigDecimal price;
    public final int minPlayers;
    public final int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ",\t rating=" + rating +
                ",\t price=" + price +
                ",\t minPlayers=" + minPlayers +
                ",\t maxPlayers=" + maxPlayers +
                '}';
    }

    @Override
    public int compareTo(BoardGame other) {
//       return Double.compare(this.rating, other.rating);
//       return Integer.compare(minPlayers, other.minPlayers);
//        return price.compareTo(other.price);
//        return other.price.compareTo(price);
       return name.toUpperCase().compareTo(other.name.toUpperCase());
    }

}
