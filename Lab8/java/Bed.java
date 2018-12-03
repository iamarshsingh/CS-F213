/**
 * A simple representation of a bed.
 *
 * @author Shreyas Bhat
 */
public class Bed {
    /**
     * The material used to build the bed.
     */
    private String material;

    /**
     * Initialize all fields of the class.
     *
     * @param material Material of the bed.
     */

    public Bed(String material) {
        this.material = material;
    }

    /**
     * Cost of the bed depends upon the material used for building it.
     * <ul>
     * <li>If the material is "WOODEN", then the cost is 200.</li>
     * <li>Else the the cost is 300.</li>
     * </ul>
     *
     * @return The cost of building the bed.
     */
    public int getCost() {
        if (material.equals("WOODEN"))
            return 200;
        else 
            return 300;
    }
}
