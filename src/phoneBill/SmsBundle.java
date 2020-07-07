package phoneBill;

public class SmsBundle implements BillAction {
     int qyt;
     double priceSms;

     public void SmsBundle(int qyt, double getSms){
         this.qyt = qyt;
         this.priceSms = getSms;
     }
    @Override
    public double totalCost() {
        return priceSms;
    }
}
