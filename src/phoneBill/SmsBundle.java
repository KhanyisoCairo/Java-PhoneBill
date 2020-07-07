package phoneBill;

public class SmsBundle implements BillAction {
//     int qyt;
//     double priceSms;
     double getTotalPrice;

     public  SmsBundle(int qyt, double getSms){

//         this.qyt = qyt;
//         this.priceSms = getSms;
         getTotalPrice = qyt * getSms;
     }
    @Override
    public double totalCost() {
        return getTotalPrice;
    }
}
