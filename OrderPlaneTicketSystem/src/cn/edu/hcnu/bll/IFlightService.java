package cn.edu.hcnu.bll;
import cn.edu.hcnu.dto.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlight();
    Flight getFlightByDepartrueTime(String departrueTime);
    Flight getFlightByDepartrueAirport(String departrueAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void  updateFlight(Flight flight);
}
