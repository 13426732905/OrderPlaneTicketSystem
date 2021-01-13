package cn.edu.hcnu.dto;
import java.util.Set;

public class Order {
    private float cost;//机票价格
    private float airportTax;//机场税
    private float fuelCost;//燃料费
    private float aviationInsurance;//航空保险
    private float ticketRefundInsurance;//机票退改险
    private float coupon;//优惠券
    private float TotalPriceTax;//含税总价
    private Set<Customer> customers;
    private Flight flight;

    public float getTotalPriceTax() {
        return TotalPriceTax;
    }

    public void setTotalPriceTax(float totalPriceTax) {
        TotalPriceTax = totalPriceTax;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }

    public float getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(float fuelCost) {
        this.fuelCost = fuelCost;
    }

    public float getAviationInsurance() {
        return aviationInsurance;
    }

    public void setAviationInsurance(float aviationInsurance) {
        this.aviationInsurance = aviationInsurance;
    }

    public float getTicketRefundInsurance() {
        return ticketRefundInsurance;
    }

    public void setTicketRefundInsurance(float ticketRefundInsurance) {
        this.ticketRefundInsurance = ticketRefundInsurance;
    }

    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }
}
