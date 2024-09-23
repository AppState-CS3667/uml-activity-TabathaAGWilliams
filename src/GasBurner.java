public class GasBurner extends Burner{
    private String gasType;

    public GasBurner(){
        super(0, 0, 0);
    }

    public boolean spark(){
        return false;
    }

    public String getGasType(){
        return null;
    }

    public void increaseGasFlow(){

    }

    public void decreaseGasFlow(){

    }
}
