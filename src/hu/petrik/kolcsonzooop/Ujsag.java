package hu.petrik.kolcsonzooop;

public class Ujsag implements Kolcsonozheto{
    private String cim;
    private int kiadasev;
    private int kiadashet;

    public String getCim() {
        return cim;
    }

    public int getKiadasev() {
        return kiadasev;
    }

    public int getKiadashet() {
        return kiadashet;
    }

    public Ujsag(String cim, int kiadasev, int kiadashet) {
        this.cim = cim;
        this.kiadasev = kiadasev;
        this.kiadashet = kiadashet;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s %d/%d.", this.cim, this.kiadasev, this.kiadashet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
