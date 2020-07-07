package phoneBill;

public class PhoneBill {
    double costTotal;
    public void accept(BillAction billAction){
        costTotal = billAction.totalCost();
    }
    public double total(){
    return  Math.round(costTotal);
    }
   public static void main(String[] args){


   }
}
