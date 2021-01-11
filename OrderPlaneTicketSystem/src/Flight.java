public class Flight {
    private String id;//没有业务意义
    private String planeType;//飞机类型
    private String departrueAirport;//出发的机场
    private String destinationAirport;//到达的机场
    private String DepartrueTime;//航班时长

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartrueAirport() {
        return departrueAirport;
    }

    public void setDepartrueAirport(String departrueAirport) {
        this.departrueAirport = departrueAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartrueTime() {
        return DepartrueTime;
    }

    public void setDepartrueTime(String departrueTime) {
        DepartrueTime = departrueTime;
    }
}
