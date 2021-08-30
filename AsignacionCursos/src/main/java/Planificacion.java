
public class Planificacion {
    public boolean NoAsignado;
    public boolean Asignado;

    public Planificacion(boolean NoAsignado, boolean Asignado) {
        this.NoAsignado = NoAsignado;
        this.Asignado = Asignado;
    }

    public boolean isNoAsignado() {
        return NoAsignado;
    }

    public void setNoAsignado(boolean NoAsignado) {
        this.NoAsignado = NoAsignado;
    }

    public boolean isAsignado() {
        return Asignado;
    }

    public void setAsignado(boolean Asignado) {
        this.Asignado = Asignado;
    }
}
