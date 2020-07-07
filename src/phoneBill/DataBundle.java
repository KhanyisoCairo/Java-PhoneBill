package phoneBill;

public class DataBundle implements BillAction{

    double priceData;

    public void DataBundle(double MBytes){
        if (MBytes < 500){
            priceData = 0.75;
        }
        else if(MBytes > 500){
            priceData =0.55;
        }
        else if(MBytes >1000){
            priceData = 0.35;
        }
    }
    @Override
    public double totalCost() {
        return priceData;
    }
}
