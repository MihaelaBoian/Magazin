public class Invoice {
    private String model;
    private String descriere;
    private int cantitate;
    private double pret;
   // public double amount;

//    public Invoice(String m,String d, int c, double p)
//    {   model=m;
//        descriere=d;
//        cantitate=c;
//        pret=p;
//    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getDescriere(){
        return descriere;
    }
    public void setDescriere(String descriere){
        this.descriere=descriere;
    }
    public int getCantitate(){
        return cantitate;
    }
    public void setCantitate(int cantitate) {
        if (cantitate < 0) {
            this.cantitate = 0;
            System.out.println("Cantitate neidentificata");
        } else {
            this.cantitate = cantitate;
        }
    }
        public double getPret(){
            return pret;


    }
    public void setPret(double pret) {
        if (pret < 0) {
            this.pret = 0.0;
            System.out.println("Pret inexistent");
        } else {
             this.pret = pret;
        }
    }
    public double getAmount(){
        double s_factura;
                     s_factura=cantitate*pret;
        return s_factura;

    }
}
