public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;

    public abstract double opseg();
    public abstract double povrsina();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    @Override
    public String toString() {
        return "Naziv: " + naziv + " Površina: " + povrsina() + " Opseg: " + opseg();
    }
    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(o.povrsina()));
    }
}
