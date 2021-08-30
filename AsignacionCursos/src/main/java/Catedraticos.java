
public class Catedraticos extends Empleado {
    public String Seccion;
    public String nCursos;
    public String Jornada;

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getnCursos() {
        return nCursos;
    }

    public void setnCursos(String nCursos) {
        this.nCursos = nCursos;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public Catedraticos(String Seccion, String nCursos, String Jornada, int Codigo, String Nombre, String Curso, String Direccion, String CodCentroEducativo) {
        super(Codigo, Nombre, Curso, Direccion, CodCentroEducativo);
        this.Seccion = Seccion;
        this.nCursos = nCursos;
        this.Jornada = Jornada;
    }
    public Catedraticos(int Codigo, String Nombre, String Curso, String Direccion, String CodCentroEducativo) {
        super(Codigo, Nombre, Curso, Direccion, CodCentroEducativo);
    }
    
}
