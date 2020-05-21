package cafeteria;
import java.util.ArrayList;
import java.util.Scanner;

public class Compra {
     Scanner in = new Scanner(System.in);
     boolean repetidor = true;
     int tipo;
     int cantb;
     int ppagar;
     int adicional;
     ArrayList<String> bebidas = new ArrayList<>();
     ArrayList<Integer> pagos = new ArrayList<>();
      public void elegirBebida(){
          
          do{
              
       System.out.println("Bienvenido");
       System.out.println("Sleccione tipo de bebida");
       System.out.println("'1': Cafe\n'2': Te");
        tipo = in.nextInt();
        System.out.println("Sleccione cant azucar" + " ( 5 $ cada nivel)");
        System.out.println("'0','1','2','3'" );
        int azucar = in.nextInt();
        System.out.println("Sleccione cant leche" + " ( 5 $ cada nivel)");
        System.out.println("'0','1','2','3'");
         int leche = in.nextInt();
         adicional += (azucar+leche) * 5;
         cantb += 1;
             
              switch (tipo) {
                  case 1:
                      {
                          System.out.println("Sleccione tipo de cafe");
                          Cafe cc = new Cafe(azucar, leche);
                          cc.tipobebida();
                          int tipoc = in.nextInt()-1;
                          System.out.println("**************************");
                          System.out.println("Seleccionó: ");
                         cc.selecbebida(tipoc);
                          cc.agregarLeche();
                          cc.endulzar();
                          bebidas.add(cc.tc[tipoc]);
                          cc.setPrecio(tipoc);
                          pagos.add(cc.getPrecio());
                          //System.out.println(cantb + " cafe");
                          break;
                         
                      }
                  case 2:
                      {
                          System.out.println("Seleccione tipo de te");
                          Te cc = new Te (azucar, leche);
                          cc.tipobebida();
                          int tipoc = in.nextInt()-1;
                          System.out.println("***************************");
                          System.out.println("Seleccionó: ");
                         cc.selecbebida(tipoc);
                          cc.agregarLeche();
                          cc.endulzar();
                          bebidas.add(cc.tt[tipoc]);
                          cc.setPrecio((tipoc + 10) );
                          pagos.add(cc.getPrecio());
                          break;
                      }
                  default:
                      repetidor = false;
                      break;
              }
              System.out.println("*******************************");
              System.out.println("*******************************");
                 System.out.println("Cantidad de bebidas: " + cantb);
          for(int i = 0; i < bebidas.size(); i++){
            
          System.out.println("*" + bebidas.get(i) + ": " + pagos.get(i) + " $ ");
              
      }
           System.out.println("adiccionales de leche y azucar = " + adicional + " $");
            System.out.println("¿desea agregar otra bebida?");
            System.out.println(" '1'- Yes or '2'- No");
            int repetidorn= in.nextInt();
            if(repetidorn != 1){
                repetidor = false;
            }
            
            
          } while (repetidor == true);
          

      }
      
      public void mCompra(){
          System.out.println("*********************");
          System.out.println("gracias por su compra!");
          System.out.println("Cantidad de bebidas: " + cantb);
          for(int i = 0; i < bebidas.size(); i++){
              ppagar += pagos.get(i);
          System.out.println("*" + bebidas.get(i) + ": " + pagos.get(i) + " $");
              
      }
          int iva;
          System.out.println("Total de acicionales = " + adicional + " $");
       System.out.println("Subtotal = " +( ppagar + adicional )+ "$");
       iva = (( ppagar + adicional )*21 /100);
          System.out.println("Iva 21% = " + iva );
             System.out.println("Total a pagar = " +(( ppagar + adicional )+ iva ) + "$");
      }

}