package nigeriaGeopoliticalZones;

public class Nigeria {

    public static GeoPoliticalZones knowYourZone(String state){
        for(GeoPoliticalZones zone: GeoPoliticalZones.values()) {
            for(String nigerianState: zone.getStates()){
                if (state.equalsIgnoreCase(nigerianState)) {
                    return zone;
                }

            }
        }
        return null;
    }

}
