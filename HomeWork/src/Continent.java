import org.w3c.dom.ls.LSOutput;


public class Continent extends World {

    public Continent(String name, long population, int area, int averageGDP) {
        super(name, population, area, averageGDP);
    }

    public int getPopulationDensity(){
        return (int) (getPopulation()/getArea());
    }

}
