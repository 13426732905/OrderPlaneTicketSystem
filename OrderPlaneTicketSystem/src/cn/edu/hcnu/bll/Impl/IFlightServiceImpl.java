package cn.edu.hcnu.bll.Impl;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlight;
import cn.edu.hcnu.dto.Flight;
import cn.edu.hcnu.dao.Impl.FlightImpl;


import java.sql.SQLException;
import java.util.Set;

public class IFlightServiceImpl implements IFlightService {


    @Override
    public void insertFlight(Flight flight) {
        IFlight iFlight=new FlightImpl();
        try {
            iFlight.insertFlight(flight);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set<Flight> getAllFlight() {
        return null;
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
