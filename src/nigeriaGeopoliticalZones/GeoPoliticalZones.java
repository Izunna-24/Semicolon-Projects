package nigeriaGeopoliticalZones;

public enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nassarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Oyo", "Ogun", "Ondo"),
    SOUTH_EAST("Enugu", "Anambra", "Imo", "Ebonyi", "Abia"),
    SOUTH_SOUTH("Rivers", "Akwa-Ibom", "Cross-River", "Edo", "Delta");

    private final String [] states;

    GeoPoliticalZones(String... states){
        this.states = states;
    }
     public String[] getStates(){
        return states;

     }

}
