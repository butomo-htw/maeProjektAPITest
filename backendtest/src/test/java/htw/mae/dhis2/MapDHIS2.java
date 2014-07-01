package htw.mae.dhis2;

/**
 * diese Klasse haben wir von DHIS2 source code genommen.
 * @author DHIS
 *
 */
public class MapDHIS2  
{
    private Double longitude = 0.0;

    private Double latitude = 0.0;

    private Integer zoom = 0;

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------
//    public Map(Double longitude, Double latitude, Integer zoom )
//    {
//        this.longitude = longitude;
//        this.latitude = latitude;
//        this.zoom = zoom;
//    }

    // -------------------------------------------------------------------------
    // Getters and setters
    // -------------------------------------------------------------------------

   public Double getLongitude()
    {
        return longitude;
    }

    public void setLongitude( Double longitude )
    {
        this.longitude = longitude;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public void setLatitude( Double latitude )
    {
        this.latitude = latitude;
    }

    public Integer getZoom()
    {
        return zoom;
    }

    public void setZoom(Integer zoom)
    {
        this.zoom = zoom;
    }
}
