
import java.util.*;

/**
 * 
 */
public abstract class CommercialBuilding extends Building {

    /**
     * Default constructor
     */
    public CommercialBuilding() {
    }

    /**
     * 
     */
    private String license_ID;

    /**
     * 
     */
    private static int MAX_NUMBER_OF_FLOORS;

    /**
     * 
     */
    protected int numberOfFloors;

    /**
     * @return
     */
    public int calculateTotalFloors() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getLicense() {
        // TODO implement here
        return "";
    }

}