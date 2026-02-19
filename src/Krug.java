public class Krug {

    private String naziv;
    private double radius;

    public Krug(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius;
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double opsegKruga(){
        return 2*radius*Math.PI;
    }
    public double povrsinaKruga(){
        return Math.pow(radius,2)*Math.PI;
    }

}
