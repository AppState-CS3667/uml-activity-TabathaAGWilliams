public class ElectricBurner extends Burner{
    private double voltReq;
    private double ampReg;

    public ElectricBurner(double voltReq){
        super(voltReq, voltReq, voltReq);
    }

    public void increaseCurrent(){

    }

    public void decreaseCurrent(){

    }

    public double getVoltreq(){
        return 0.0;
    }
}
