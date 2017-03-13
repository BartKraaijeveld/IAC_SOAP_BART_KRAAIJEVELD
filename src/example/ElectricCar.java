package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Bart on 13-3-2017.
 */
@WebService()
public class ElectricCar {

  @WebMethod
  public String powerUse(String car) {
    String result = "1000 Kilowatt";
    if (car.equals("Tesla")){
      result = "Het verbruik van Tesla is 1200 Kilowatt";
    }
    else if(car.equals("Opel Ampera")){
      result = "Het verbruik van Opel Ampera is 1400 Kilowatt";

    }
    else if(car.equals("Nissan Leaf")){
      result = "Het verbruik van Nissan Liaf is 1500 Kilowatt";

    }
    else if(car.equals("Toyota Prius")){
      result = "Het verbruik van Toyota Prius is 1250 Kilowatt";
    }
    else if(car.equals("BMW I3")){
      result = "Het verbruik van BMW I3 is 1360 Kilowatt";
    }
    else{
      result = "Voer een geldige auto in A.U.B. ";
    }
    return result;
  }

  @WebMethod
  public String vergelijker(int a, int b){
    String uitkomst = "";
    if(a > b){
      uitkomst = "De laatst ingevoerde auto is het zuinigst!";
    }
    else if(b > a){
      uitkomst = "De eerst ingevoerde auto is het zuinigst!";
    }
    else {
      uitkomst = "Voer 2 geldige waardes in A.U.B.";
    }
    return uitkomst;
  }

  public static void main(String[] argv) {
    Object implementor = new ElectricCar();
    String address = "http://localhost:9040/ElectricCar";
    Endpoint.publish(address, implementor);
  }
}
