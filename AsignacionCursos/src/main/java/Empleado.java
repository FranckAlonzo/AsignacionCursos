
public class Empleado {
    public int Codigo;
    public String Nombre;
    public String Curso;
    public String Direccion;
    public String CodCentroEducativo;

    public Empleado(int Codigo, String Nombre, String Curso, String Direccion, String CodCentroEducativo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Direccion = Direccion;
        this.CodCentroEducativo = CodCentroEducativo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCodCentroEducativo() {
        return CodCentroEducativo;
    }

    public void setCodCentroEducativo(String CodCentroEducativo) {
        this.CodCentroEducativo = CodCentroEducativo;
    }
    
}
