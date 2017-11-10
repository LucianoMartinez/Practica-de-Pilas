/**
 * Created by Luciano on 07/11/2017.
 */
public class Main {
    public static void main(String[]args){
        pilas p = new pilas();
        p.push(2);
        p.push(0);
        p.push(1);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();
    }
}
