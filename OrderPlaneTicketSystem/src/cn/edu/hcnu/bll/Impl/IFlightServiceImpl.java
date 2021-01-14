package cn.edu.hcnu.bll.Impl;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlight;
import cn.edu.hcnu.dto.Flight;
import cn.edu.hcnu.dao.Impl.FlightImpl;


import java.sql.SQLException;
import java.util.Set;

public class IFlightServiceImpl implements IFlightService {


    @Override
    public void insertFlight(Flight flight) throws SQLException {
         IFlight iFlight =new FlightImpl();
        iFlight.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {
        IFlight iFlight =new FlightImpl();
        return  iFlight.getAllFlight();
    }

    @Override
    public Flight getFlightByDepartrueTime(String departrueTime) throws SQLException {
        IFlight iFlight =new FlightImpl();
        return  iFlight.getFlightByDepartrueTime(departrueTime);
    }

    @Override
    public Flight getFlightByDepartrueAirport(String departrueAirport) throws SQLException {
      IFlight iFlight =new FlightImpl();
        return iFlight.getFlightByDepartrueAirport(departrueAirport);
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
