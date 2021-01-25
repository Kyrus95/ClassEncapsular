import java.util.Scanner;

/**
 * Created by KYO on 19/08/2016.
 */
public class Calculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.Calcular();
    }

    private void Calcular() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Ingrese un valor numerico: ");
        String s2 = helper.getInput("Ingrese un valor numerico: ");
        String op = helper.getInput("Seleccione una operacion (+ - * /): ");
        double resultado = 0;

        //Leer tipo de operaciones
        switch (op){
            case "+":
                resultado = Matematicas.addValues(s1, s2);
                break;
            case "-":
                resultado = Matematicas.subtractValues(s1, s2);
                break;
            case "*":
                resultado = Matematicas.multiplyValues(s1, s2);
                break;
            case "/":
                resultado = Matematicas.divideValues(s1, s2);
                break;
            default:
                System.out.println("La operacion no es reconocida por esta claculadora");
        }
        System.out.println("La respuesta es: "+resultado);
    }

    class InputHelper {
        private String getInput(String s) {
            System.out.print(s);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }
}