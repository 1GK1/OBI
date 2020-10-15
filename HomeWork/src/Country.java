public class Country extends Continent implements CountryDescription {

    public Country(String name, long population, int area, int averageGDP) {
        super(name, population, area, averageGDP);
    }

    @Override
    public boolean isLargeCountry() {
        if (getArea() > 1_000_000) {
            return true;
        } else {
            return false;
         }
    }
}
