package OOP;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.desc = desc;
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId() {
    return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int newqty){
        this.qty = newqty;
    }
    public double getUnitPrice(){
        return getUnitPrice();
    }
    public void setUnitPrice(double newunitprice){
        this.unitPrice = newunitprice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    @Override
    public String toString(){
        return "InvoiceItem[id= " + ", desc=" + desc + ",qty= " + qty +
                ", unitPrice= " + unitPrice + "]";
    }

}
