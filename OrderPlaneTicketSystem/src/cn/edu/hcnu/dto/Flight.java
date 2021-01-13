package cn.edu.hcnu.dto;

public class Flight {
    private String id;//没有业务意义
    private String frightId;//航班ID
    private int currentSeats;//航班座位数
    private String planeType;//飞机类型
    private String departrueAirport;//出发的机场
    private String destinationAirport;//到达的机场
    private String  departrueTime;//出发时间

    public Flight(String frightId, int currentSeats, String planeType, String departrueAirport, String destinationAirport, String departrueTime) {
        this.frightId = frightId;
        this.currentSeats = currentSeats;
        this.planeType = planeType;
        this.departrueAirport = departrueAirport;
        this.destinationAirport = destinationAirport;
        this.departrueTime = departrueTime;
    }

    public String getDepartrueTime() {
        return departrueTime;
    }

    public void setDepartrueTime(String departrueTime) {
        this.departrueTime = departrueTime;
    }

    public String getFrightId() {
        return frightId;
    }

    public void setFrightId(String frightId) {
        this.frightId = frightId;
    }

    public int getCurrentSeats() {
        return currentSeats;
    }

    public void setCurrentSeats(int currentSeats) {
        this.currentSeats = currentSeats;
    }

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


    @Override
    public String toString() {
        return "Flight{" +
                "frightId='" + frightId + '\'' +
                ", currentSeats=" + currentSeats +
                ", planeType='" + planeType + '\'' +
                ", departrueAirport='" + departrueAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departrueTime='" + departrueTime + '\'' +
                '}';
    }
}
