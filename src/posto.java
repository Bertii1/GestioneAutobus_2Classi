public class posto {
    private int numero;
    private boolean occupato;
    private boolean prenotato;

    public posto(int numero, boolean occupato, boolean prenotato) {
        this.numero = numero;
        this.occupato = occupato;
        this.prenotato = prenotato;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    public boolean isPrenotato() {
        return prenotato;
    }

    public void setPrenotato(boolean prenotato) {
        this.prenotato = prenotato;
    }
}
