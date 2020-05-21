package cafeteria;

public class Cafe extends Bebida {
String[] tc = {"Cafe Expresso","Cafe Ristretto"," Cafe Normal"};
//private int precio;
    
    public Cafe(int azucar, int leche) {
      this.azucar = azucar;
      this.leche = leche;
    }

    @Override
    public void agregarLeche() {
      
        System.out.println( "Cantidad leche: " + this.leche );
    }
    @Override
    public void endulzar() {
            System.out.println( "Cantidad azucar: " + this.azucar );
        }

    @Override
    public void tipobebida() {
        for(int i = 0;i < tc.length; i++){
        System.out.println((i+1) + "-" + tc[i]);
    }
    }
    

    @Override
    public void selecbebida(int bb) {
        System.out.println(tc[bb]);
     //String pos = tc [bb];
     
    }
    
    
    }
    

    
    
    
    

