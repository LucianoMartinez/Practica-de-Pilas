/**
 * Created by luciano on 07/11/2017.
 */
public class pilas {

    public int size = 0;
    
    private nodo top;

    public pilas(){
        top = null;
    }

    public boolean vacia(){
        return (top==null);
    }
    //Metodo insertar datos
    public void push(int valor){
        nodo nuevoNodo;
        if( vacia() )
            top = new nodo(valor);
        else{
            nuevoNodo = new nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;

        }
	 size++;
    }

    //Metodo mostrar datos
    public void peek(){
        nodo temp = top;
        if(temp !=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();

            }
        }
        else
           System.out.println("PILA VACIA");
    }
    //Metodo buscar datos
    public void cima(){
        if( !vacia() ){
            System.out.println("Cima: "+top.getValor());
        }
        else
            System.out.println("La pila esta vacia");

    }
    // Metodo eliminar datos
    public void pop(){
        if( !vacia() ){
            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
	 size--;
    }
	public void getSize(){
        System.out.println("Tamaño: "+ size);
    }

}
