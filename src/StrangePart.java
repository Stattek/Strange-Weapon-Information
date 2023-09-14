public class StrangePart {

    /*
     * Instance variables
     */
    private String name;
    private int count;

    /*
     * Constructors
     */
    public StrangePart(String name, int count) {
        this.name = name;
        if (count < 0) {
            this.count = 0;
        } else {
            this.count = count;
        }
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

}
