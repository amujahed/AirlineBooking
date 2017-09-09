package airline.model;

public class Airplane {

    private int airplaneId;
    private String modelNo;

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }


    public Airplane(String modelNo)
    {
        this.modelNo=modelNo;
    }

}
