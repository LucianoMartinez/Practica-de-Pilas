import java.util.Scanner;
/**
 * Created by Luciano on 07/11/2017.
 * Update by Antonio on 10/11/2017
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        pilas p = new pilas();
        boolean repetir = true;
        while (repetir){
            System.out.println("Escoge una opcion a realizar" +
                    "\n1.-Insetar en la pila" +
                    "\n2.-Mostrar pila" +
                    "\n3.-Borrar el primero" +
                    "\n4.-Obtener Altura" +
                    "\n5.-Mostrar el número Mayor " +
                    "\n6.-Mostrar el número menor " +
                    "\nSalir");
            String respuelta = sc.next();
            switch (respuelta){
                case "1":
                    System.out.println("Ingresa el número a ingresar");
                    p.push(sc.nextInt());
                break;
                case "2":
                    p.peek();
                break;
                case "3":
                    p.pop();
                break;
                case "4":
                    p.getSize();
                break;
                case "5":
                    p.max();
                break;
                case "6":
                    p.min();
                break;
                case "Salir":
                    repetir = false;
                break;
                default:
                    System.out.println("Bueno, esto es embarazoso" +
                            "\npor favor elija una de las opciones marcadas como validas");
            }
        }
    }
}
