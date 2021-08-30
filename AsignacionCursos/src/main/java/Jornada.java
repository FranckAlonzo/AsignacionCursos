
public class Jornada {
  public String Matutino;
  public String Vespertino;
  public String Sabado;
  public String Dominical;

    public Jornada(String Matutino, String Vespertino, String Sabado, String Dominical) {
        this.Matutino = Matutino;
        this.Vespertino = Vespertino;
        this.Sabado = Sabado;
        this.Dominical = Dominical;
    }

    public String getMatutino() {
        return Matutino;
    }

    public void setMatutino(String Matutino) {
        this.Matutino = Matutino;
    }

    public String getVespertino() {
        return Vespertino;
    }

    public void setVespertino(String Vespertino) {
        this.Vespertino = Vespertino;
    }

    public String getSabado() {
        return Sabado;
    }

    public void setSabado(String Sabado) {
        this.Sabado = Sabado;
    }

    public String getDominical() {
        return Dominical;
    }

    public void setDominical(String Dominical) {
        this.Dominical = Dominical;
    }
  
}
