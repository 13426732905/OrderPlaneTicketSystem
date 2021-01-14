package cn.edu.hcnu.bll;
import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlight() throws SQLException;
    Flight getFlightByDepartrueTime(String departrueTime) throws SQLException;
    Flight getFlightByDepartrueAirport(String departrueAirport) throws SQLException;
    Flight getFlightByDestinationAirport(String destinationAirport);
    void  updateFlight(Flight flight);
}
