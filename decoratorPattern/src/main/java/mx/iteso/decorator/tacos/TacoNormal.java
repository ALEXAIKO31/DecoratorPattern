package mx.iteso.decorator.tacos;

        import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.description = "taco normal";
        if(size.equals(MINI))
            this.size= MINI;
        else if(size.equals(MEGA))
            this.size= MEGA;
        else
            this.size=REGULAR;
    }

    @Override
    public double cost() {
        if(size.equals(MINI))
            return 6.00;
        else if(size.equals(MEGA))
            return 10.00;
        else
            return 8.00;
    }
}
