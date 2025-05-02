package Week1.Day5;

public enum Dia {
    LUNES(true),MARTES(true),MIERCOLES(true),JUEVES(true),VIERNES(true),SABADO(false),DOMINGO(false);

    private boolean laborable;

    Dia(boolean laborable){
        this.laborable = laborable;
    }

    public boolean esDiaLaborable(){
        return laborable;
    }
}
