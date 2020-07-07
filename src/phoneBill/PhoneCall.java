package phoneBill;

public class  PhoneCall implements BillAction {

    double priceCall;

    public void PhoneCall(double getCall){
        this.priceCall = getCall;
    }

    @Override
    public double totalCost() {
        return priceCall;
    }
}
