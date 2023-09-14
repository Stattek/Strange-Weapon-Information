public class StrangeWeapon {

    /*
     * Instance variables
     */
    private StrangePart[] strangeParts;
    private int kills;
    private String name;

    /*
     * Constructors
     */
    public StrangeWeapon(String name, String[] partNames, int[] counts, int kills) {
        this.name = name;
        if (partNames == null) {
            this.strangeParts = null;
        } else {
            this.strangeParts = new StrangePart[3];

            for (int i = 0; (i < 3) && (partNames[i] != null && !partNames[i].isBlank()); i++) {
                this.strangeParts[i] = new StrangePart(partNames[i], counts[i]);
            }
        }

        if (kills < 0) {
            this.kills = 0;
        } else {
            this.kills = kills;
        }
    }

    public StrangePart[] getStrangeParts() {
        return strangeParts;
    }

    public int getKills() {
        return kills;
    }

    /**
     * Find the strange part count divided by the kills
     * 
     * @param index - index of the strange part
     * @return strange part count/kills
     */
    public double getCountPerKills(int index) {
        return (double) strangeParts[index].getCount() / kills;
    }

    @Override
    public String toString() {

        String result = name + "\n\t" + "Kills: " + kills;
        if (strangeParts == null) {
            return result;
        } else {
            for (int i = 0; i < strangeParts.length && strangeParts[i] != null; i++) {
                StrangePart part = strangeParts[i];
                result += "\n\t" + part.getName() + "\n\t\t" + part.getCount();
            }

            result += "\n\n****STATS:***\n";

            for (int i = 0; i < strangeParts.length && strangeParts[i] != null; i++) {
                StrangePart part = strangeParts[i];
                result += "\n\t" + part.getName() + " PER KILL" + "\n\t\t" + getCountPerKills(i);
            }

            return result;
        }

    }

}
