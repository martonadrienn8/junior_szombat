package marton_adrienn.pizza;

public class Pizza {

  public final String datum;
  public final String futar;
  public final String cim;
  public final String idopont;


  public Pizza(String datum, String futar, String cim, String idopont) {
    this.datum = datum;
    this.futar = futar;
    this.cim = cim;
    this.idopont = idopont;
  }

  @Override
  public String toString() {
    return datum + " - " + futar + " - " + cim + " - " + idopont;
  }
}
