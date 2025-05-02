package Week1.ProyectoFinal;

public enum DiaSemana {
    MONDAY(true),TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);

    private boolean laborable;

    DiaSemana(boolean laborable){
        this.laborable = laborable;
    }

    public boolean isLaborable(){
        return laborable;
    }
}
