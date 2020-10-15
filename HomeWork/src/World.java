public class World {
    private String name;
    private long population;
    private int area = 1;
    private int averageGDP;
    private long density = population/area;

    public World(String name, long population, int area, int averageGDP) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.averageGDP = averageGDP;
    }

    public boolean isRich() {
        if (averageGDP > 20_000) {
            return true;
        } else {
            return false;
        }
    }

    public String isOverpopulated() {
        if (population / area > 53) {
            return "overpopulated";
        } else {
            return "not overpopulated";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverageGDP(int averageGDP) {
        this.averageGDP = averageGDP;
    }

    public int getAverageGDP() {
        return averageGDP;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

}
