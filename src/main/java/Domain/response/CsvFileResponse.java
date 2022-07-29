package Domain.response;

public class CsvFileResponse {

  private String storeId;
  private double price;
  private double comissao;

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {

    this.comissao = comissao * 0.1;
  }

  @Override
  public String toString() {
    return "CsvFileResponse{" +
        "storeId='" + storeId + '\'' +
        ", price=" + price +
        ", comissao=" + comissao +
        '}';
  }
}
