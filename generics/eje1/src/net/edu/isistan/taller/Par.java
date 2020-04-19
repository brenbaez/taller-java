package net.edu.isistan.taller;

public class Par <L,F>{
    private L l;
    private F f;

    public Par(L l, F f) {
        this.l = l;
        this.f = f;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }
}
