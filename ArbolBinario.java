public class ArbolBinario {
    NodoArbol raiz;
    //este constructo se encarga de iniciar la raiz en nulo, para saber cuando la raiz cambie a un dato diferente de nulo
    public ArbolBinario (){
        raiz=null;
    }
    //metodo para insertar un Nodo en el arbol
    public void agregarNodo(int d){
        NodoArbol nuevo= new NodoArbol (d);
        if(raiz== null){
            raiz=nuevo;
        }
        else {
            NodoArbol auxiliar= raiz;
            NodoArbol padre;
            while(true){
                padre=auxiliar;
                if(d< auxiliar.dato){
                    auxiliar= auxiliar.hijoIzquierdo;
                    if(auxiliar== null){
                        padre.hijoIzquierdo= nuevo;
                        return;
                    }
                }
                else {
                    auxiliar=auxiliar.hijoDerecho;
                    if (auxiliar== null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio (){
        return raiz==null;
    }
    //metodo para recorrer el Arbol inOrden
    public void inOrden(NodoArbol r){
        if (r!= null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + " | ");
            inOrden(r.hijoDerecho); 
            System.out.print("");
        }
        
    }
    //Metodo para recorrer el Arbol en preorden
    public void preOrden(NodoArbol r){
        if (r!= null){
            System.out.print(r.dato + " | ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho); 
            System.out.print("");
        }
        
    }
    //metodo para recorrer el Arbol postOrden
     public void postOrden(NodoArbol r){
        if (r!= null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho); 
            System.out.print(r.dato + " | ");
            System.out.print("");
        }
        
     }
    //Metodo para buscar un Nodo en el Arbol
     public NodoArbol buscarNodo(int d){
         NodoArbol aux=raiz;
         while(aux.dato!= d){
             if (d< aux.dato){
                 aux=aux.hijoIzquierdo;
             }
             else {
                 aux=aux.hijoDerecho;
             }
             if(aux==null){
                 return null;
             }
         }
         return aux;
     }
     
    
     public NodoArbol espejo(NodoArbol d){
         NodoArbol aux=raiz;
        aux.dato= espejo(aux.dato);
        return aux;
     }
     public NodoArbol espejo(int d){
         NodoArbol aux=raiz;
         if(d==null){
             return null;
         }
         aux=aux.hijoIzquierdo;
        return null;
     }

    private int espejo(int dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  

}
