
public class Semestre {
    public String nSemestre;
    public int CicloEscolar;
    public String Jornada;

    public String getnSemestre() {
        return nSemestre;
    }

    public void setnSemestre(String nSemestre) {
        this.nSemestre = nSemestre;
    }

    public int getCicloEscolar() {
        return CicloEscolar;
    }

    public void setCicloEscolar(int CicloEscolar) {
        this.CicloEscolar = CicloEscolar;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public Semestre(String nSemestre, int CicloEscolar, String Jornada) {
        this.nSemestre = nSemestre;
        this.CicloEscolar = CicloEscolar;
        this.Jornada = Jornada;
    }
    
}
