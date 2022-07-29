package Domain.request;

public class CsvFileRequest {
  private String orderId;
  private String storeId;
  private double price;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public void setPrice(double orderPrice) {
    this.price = orderPrice;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Linha{" +
        "orderId='" + orderId + '\'' +
        ", storeId='" + storeId + '\'' +
        ", orderPrice=" + price +
        '}';
  }

  public double comissao(double x){
    return x + (x * 0.1);
  }
}
