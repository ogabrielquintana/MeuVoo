public class Geo {
    private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

    public static double distancia(Geo um, Geo dois){ //exercicio 2.a
        double d = 0;
        int r = 6371;
        double lat1 = Math.toRadians(um.latitude);
        double lat2 = Math.toRadians(dois.latitude);
        double longe1 = Math.toRadians(um.longitude);
        double longe2 = Math.toRadians(dois.longitude);
        d = 2*r * Math.asin(Math.sqrt(Math.pow(Math.sin((lat1 - lat2)/2), 2) + Math.pow(Math.sin((longe1 - longe2)/2), 2) * Math.cos(lat1) * Math.cos(lat2)));
        return d;
    }

    public double distancia(Geo um){ //exercicio 2.b
        double d = 0;
        int r = 6371;
        double lat1 = Math.toRadians(um.latitude);
        double lat2 = Math.toRadians(this.latitude);
        double longe1 = Math.toRadians(um.longitude);
        double longe2 = Math.toRadians(this.longitude);
        d = 2*r * Math.asin(Math.sqrt(Math.pow(Math.sin((lat1 - lat2)/2), 2) + Math.pow(Math.sin((longe1 - longe2)/2), 2) * Math.cos(lat1) * Math.cos(lat2)));
        return d;
    }
}