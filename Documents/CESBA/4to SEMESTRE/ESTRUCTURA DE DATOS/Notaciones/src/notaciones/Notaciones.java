/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaciones;

import java.util.Stack;

/**
 *
 * @author j_star
 */
public class Notaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*datos de entrada*/
        //Scanner sc = new Scanner(System.in);
        String infix = "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3";

        /*impresion de las notaciones*/
        System.out.printf("notación infija:  %s%n", infix);
        System.out.printf("notación postfija: %s%n", infixToPostfix(infix));
    }

    public static String infixToPostfix(String infix) {
        /* To find out the precedence, we take the index of the
    token in the ops string and divide by 2 (rounding down).
    This will give us: 0, 0, 1, 1, 2 */

        final String ops = "-+/*^";

        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        for (String token : infix.split("\\s")) {
            if (token.isEmpty()) {
                continue;
            }
            char c = token.charAt(0);
            int idx = ops.indexOf(c);

            //validar operador
            if (idx != -1) {
                if (s.isEmpty()) {
                    s.push(idx);
                } else {
                    while (!s.isEmpty()) {
                        int prec2 = s.peek() / 2;
                        int prec1 = idx / 2;
                        if (prec2 > prec1 || (prec2 == prec1 && c != '^')) {
                            sb.append(ops.charAt(s.pop())).append(' ');
                        } else {
                            break;
                        }
                    }
                    s.push(idx);
                }
            } else if (c == '(') {
                s.push(-2); // -2 stands for '('
            } else if (c == ')') {

                // until '(' on stack, pop operators.
                while (s.peek() != -2) {
                    sb.append(ops.charAt(s.pop())).append(' ');
                }
                s.pop();
            } else {
                sb.append(token).append(' ');
            }
        }
        while (!s.isEmpty()) {
            sb.append(ops.charAt(s.pop())).append(' ');
        }
        return sb.toString();
    }
}
