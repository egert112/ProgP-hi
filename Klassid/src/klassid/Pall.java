package klassid;

public class Pall {
    protected double x;
    protected double y;
    protected double r;
    //lisada pallide raadius
    //lisada käsk kontrollimaks, kas kaks palli puutuvad kokku
    
    public Pall(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r; //siin anname muutujatele väärtused, enne oli tühi 
    }
    public double kaugusNullist(){
        return Math.sqrt(x*x+y*y);
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public double kaugusPallist(Pall teine) {
        double dx=getX()-teine.getX();
        double dy=getY()-teine.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    @Override
    public String toString(){
        return "Pall kohal ("+x+", "+y+"), raadius ("+r+")";
        //return "Palli raadius ("+r+")";
    }
}
