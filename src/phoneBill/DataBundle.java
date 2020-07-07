package phoneBill;

public class DataBundle implements BillAction{

    double priceData;

    public  DataBundle(double MBytes){
        if (MBytes < 500){
            priceData = 0.75 * 500;
        }
        else if(MBytes > 500){
            priceData =0.55 * 500;
        }
        else if(MBytes > 1000){
            priceData = 0.35 * 1000;
        }
        else {
            priceData = 0;
        }
    }
    @Override
    public double totalCost() {
        return priceData ;
    }
}
