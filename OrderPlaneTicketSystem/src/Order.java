public class Order {
    //    成人	退改 ¥30 起	¥300X1
//    机场税	¥50X1
//    燃油费	免费
//    	¥30 X0
//    机票退改险	¥30 X0
//            优惠券
    private float cost;//乘客消费
    private float airportTax;//机场税
    private float fuelCost;//燃料费
    private float aviationInsurance;//航空保险
    private float ticketRefundInsurance;//机票退改险
    private float coupon;//优惠券

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
