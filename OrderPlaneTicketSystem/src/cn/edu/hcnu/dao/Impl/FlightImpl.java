package cn.edu.hcnu.dao.Impl;

import cn.edu.hcnu.dao.IFlight;
import cn.edu.hcnu.dto.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightImpl implements IFlight {


    @Override
    public void insertFlight(Flight flight) throws SQLException {
        //数据到达dao层后进行数据库连接，增加数据库驱动
       Connection con;
       PreparedStatement ps;
       String url="jdbc:oracle:thin:@localhost:1521:ORCL";
       String user="opts";
       String password="opts1234";
       String sql="insert into flight values(?,?,?,?,?,?,?)";
            con= DriverManager.getConnection(url,user,password);
            ps=con.prepareStatement(sql);
            ps.setString(1,flight.getId());
            ps.setString(2,flight.getFrightId());
            ps.setString(3,flight.getPlaneType());
            ps.setInt(4,flight.getCurrentSeats());
            ps.setString(5,flight.getDepartrueAirport());
            ps.setString(6,flight.getDestinationAirport());
            ps.setString(7,flight.getDepartrueTime());
            ps.executeUpdate();



    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        String user = "opts";
        String password = "opts1234";
        Set<Flight> allFlight = new HashSet<Flight>();
        String sql = "select * from flight";
        con = DriverManager.getConnection(url, user, password);
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            String id = rs.getString("id");
            String frightId = rs.getString("frightId");
            int currentSeats = rs.getInt("currentSeats");
            String planeType = rs.getString("planeType");
            String departrueAirport = rs.getString("departrueAirport");
            String destinationAirport = rs.getString("destinationAirport");
            String departrueTime = rs.getString("departrueTime");
            Flight flight = new Flight(frightId, currentSeats, planeType,
                    departrueAirport, destinationAirport, departrueTime);
            allFlight.add(flight);
        }
      return  allFlight;
    }

    @Override
    public Flight getFlightByDepartrueTime(String departrueTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartrueAirport(String departrueAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
