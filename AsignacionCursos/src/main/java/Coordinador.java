
public class Coordinador extends Empleado {
    public boolean Confirmar;
    public int nMaxEstudiantes;
    public String AsignarCatedratico;
    public String AsignarSecciones;

    public Coordinador(boolean Confirmar, int nMaxEstudiantes, String AsignarCatedratico, String AsignarSecciones, int Codigo, String Nombre, String Curso, String Direccion, String CodCentroEducativo) {
        super(Codigo, Nombre, Curso, Direccion, CodCentroEducativo);
        this.Confirmar = Confirmar;
        this.nMaxEstudiantes = nMaxEstudiantes;
        this.AsignarCatedratico = AsignarCatedratico;
        this.AsignarSecciones = AsignarSecciones;
    }

    public boolean isConfirmar() {
        return Confirmar;
    }

    public void setConfirmar(boolean Confirmar) {
        this.Confirmar = Confirmar;
    }

    public int getnMaxEstudiantes() {
        return nMaxEstudiantes;
    }

    public void setnMaxEstudiantes(int nMaxEstudiantes) {
        this.nMaxEstudiantes = nMaxEstudiantes;
    }

    public String getAsignarCatedratico() {
        return AsignarCatedratico;
    }

    public void setAsignarCatedratico(String AsignarCatedratico) {
        this.AsignarCatedratico = AsignarCatedratico;
    }

    public String getAsignarSecciones() {
        return AsignarSecciones;
    }

    public void setAsignarSecciones(String AsignarSecciones) {
        this.AsignarSecciones = AsignarSecciones;
    }
    public Coordinador(int Codigo, String Nombre, String Curso, String Direccion, String CodCentroEducativo) {
        super(Codigo, Nombre, Curso, Direccion, CodCentroEducativo);
    }
    
}
