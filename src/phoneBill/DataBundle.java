package phoneBill;

public class DataBundle implements BillAction{

    double priceData;

    public  DataBundle(double MBytes){
        if (MBytes < 500){
            priceData = 0.75 * MBytes;
        }
        else if(MBytes > 500){
            priceData =0.55 * MBytes;
        }
        else if(MBytes > 1000){
            priceData = 0.35 * MBytes;
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
