public class ExamenUnidad4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);    
    
        boolean x= true;
        int opc=0, elemento;
        String nombre;
        ArbolBinario arbolito =new ArbolBinario();
     
       while (x){
           System.out.println("-----MENU-----");
           System.out.println("Eliga una opcion:");
           System.out.println("1. Agregar nodo al Arbol Binario");
           System.out.println("2. InOrden");
           System.out.println("3. PreOrden");
           System.out.println("4. PostOrden");
           System.out.println("5. Salir");
           opc = leer.nextInt();
        
        
        switch (opc) {
            case 1:
                 System.out.println("ingresa el numero del nodo");
                 elemento=leer.nextInt();
                  
                  arbolito.agregarNodo(elemento);
                break;
                
            case 2:
                if(!arbolito.estaVacio()){
                    
                    arbolito.inOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
                break;
                
            case 3:
                if(!arbolito.estaVacio()){
                  
                    arbolito.preOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
                break;
            case 4:
               if(!arbolito.estaVacio()){
               
                    arbolito.postOrden(arbolito.raiz);
                }
                else {
                    System.out.println("El Arbol esta vacio");
                }
                break;

           case 5:
                x= false;
                break;
            default:
                 System.out.println("opcion incorrecta");
                 
       }
    }
    
    }
    }
