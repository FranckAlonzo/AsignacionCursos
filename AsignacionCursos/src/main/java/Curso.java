
public class Curso {
    public int nSemestre;
    public int nAlumnos;
    public String Seccion;
    public String CentroEducativo;

    public Curso(int nSemestre, int nAlumnos, String Seccion, String CentroEducativo) {
        this.nSemestre = nSemestre;
        this.nAlumnos = nAlumnos;
        this.Seccion = Seccion;
        this.CentroEducativo = CentroEducativo;
    }

    public int getnSemestre() {
        return nSemestre;
    }

    public void setnSemestre(int nSemestre) {
        this.nSemestre = nSemestre;
    }

    public int getnAlumnos() {
        return nAlumnos;
    }

    public void setnAlumnos(int nAlumnos) {
        this.nAlumnos = nAlumnos;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getCentroEducativo() {
        return CentroEducativo;
    }

    public void setCentroEducativo(String CentroEducativo) {
        this.CentroEducativo = CentroEducativo;
    }
    
}
