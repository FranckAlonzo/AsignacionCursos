
public class CentroEducativo {
    public int Codigo;
    public String NombreCentroEducativo;
    public String Jordada;
    public String Direccion;

    public CentroEducativo(int Codigo, String NombreCentroEducativo, String Jordada, String Direccion) {
        this.Codigo = Codigo;
        this.NombreCentroEducativo = NombreCentroEducativo;
        this.Jordada = Jordada;
        this.Direccion = Direccion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreCentroEducativo() {
        return NombreCentroEducativo;
    }

    public void setNombreCentroEducativo(String NombreCentroEducativo) {
        this.NombreCentroEducativo = NombreCentroEducativo;
    }

    public String getJordada() {
        return Jordada;
    }

    public void setJordada(String Jordada) {
        this.Jordada = Jordada;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
