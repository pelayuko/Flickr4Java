package com.flickr4java.flickr.photos;

/**
 * A geographic position.
 * 
 * @author mago
 * @version $Id: GeoData.java,v 1.4 2009/07/23 20:41:03 x-mago Exp $
 */
public class GeoData {

    private double longitude;

    private double latitude;

    private int accuracy;

    public GeoData() {
        super();
    }

    public GeoData(String longitudeStr, String latitudeStr, String accuracyStr) {
        longitude = Double.parseDouble(longitudeStr);
        latitude = Double.parseDouble(latitudeStr);
        accuracy = Integer.parseInt(accuracyStr);
    }

    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Set the accuracy level.
     * <p>
     * 
     * World level is 1, Country is ~3, Region ~6, City ~11, Street ~16.
     * 
     * @param accuracy
     * @see com.flickr4java.flickr.Flickr#ACCURACY_WORLD
     * @see com.flickr4java.flickr.Flickr#ACCURACY_COUNTRY
     * @see com.flickr4java.flickr.Flickr#ACCURACY_REGION
     * @see com.flickr4java.flickr.Flickr#ACCURACY_CITY
     * @see com.flickr4java.flickr.Flickr#ACCURACY_STREET
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoData[longitude=" + longitude + " latitude=" + latitude + " accuracy=" + accuracy + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        GeoData test = (GeoData) obj;
        return longitude == test.longitude && latitude == test.latitude && accuracy == test.accuracy;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += new Double(longitude).hashCode();
        hash += new Double(latitude).hashCode();
        hash += new Integer(accuracy).hashCode();
        return hash;
    }
}
