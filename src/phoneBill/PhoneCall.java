package phoneBill;

public class  PhoneCall implements BillAction {

    double priceCall;

    public PhoneCall(double getCall){
        this.priceCall = getCall;
    }

    @Override
    public double totalCost() {
        return priceCall;
    }
}
