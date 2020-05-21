package cafeteria;


public abstract class Bebida {
   
    private int precio;
    public int tipo;
    public int azucar;
    public int leche;
    
   
    public abstract void agregarLeche();
    public abstract void endulzar();
    public abstract void tipobebida();
    public abstract void selecbebida(int bb);
    
    
    public int getPrecio() {
       int precioc = precio;
        return precioc;
    }

    public void setPrecio(int num) {
        if(num == 0){
            this.precio = 100;
        }else if (num == 1){
            this.precio = 110;
        }else if(num == 2){
            this.precio = 90;
        }else if(num == 10  || num == 11){
            this.precio = 70;
        }else if(num == 12){
            this.precio = 75;
        }
        
        
    }
    
    
    
    
}
