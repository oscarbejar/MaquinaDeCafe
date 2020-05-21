package cafeteria;

public class Te extends Bebida {
    String[] tt = {"Te Negro", "Te Rojo", "Te Verde"};
    
    public Te(int azucar, int leche) {
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
              for(int i = 0;i < tt.length; i++){
        System.out.println((i+1) + "-"+ tt[i]);
    }
    }

    @Override
    public void selecbebida(int bb) {
        System.out.println(tt[bb]);
     this.tt[bb] = tt [bb];
    }
    
         


    
    
}
