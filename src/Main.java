public class Main {
    public static void main(String[] args) {

Invoice a=new Invoice();
a.setPret(2);
a.setCantitate(-2);
a.setModel("Pixel");
a.setDescriere("Google Pixel");
        System.out.println("Model: "+a.getModel()+"  Descriere: "+a.getDescriere()+"  Cantitate: "+a.getCantitate()+"  Suma totala achitata : "+a.getAmount());
 a.setCantitate(5);
 a.setPret(65.02);
        System.out.println("Model: "+a.getModel()+"  Descriere: "+a.getDescriere()+"  Cantitate: "+a.getCantitate()+"  Suma totala achitata : "+a.getAmount());
    }
}