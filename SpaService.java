public class SpaService {

  // private String serviceDescription;
  // private double price;

  String serviceDescription = "XXX";
  double price = 0;

  //setters
  public void setServiceDescription(String service) {
      serviceDescription = service;
  }
  public void setPrice(double servicePrice){
    price = servicePrice;
  }

  //getters
  public String getServiceDescription(){
    return serviceDescription;
  }
  public double getPrice(){
    return price;
  }
}