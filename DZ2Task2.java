/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz2task2;

import java.util.Scanner;

/**
 *
 * @author леново
 */
public class DZ2Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sigars -> ");
        int sigars = in.nextInt();
        System.out.print("Weelends -> ");
        boolean weekends = in.nextBoolean();
        boolean a = SigarParty(sigars, weekends);
        System.out.println(a);
////////////////////////////////////////////////////////////

        System.out.print("peson1 -> ");
        int person1 = in.nextInt();
        System.out.print("person2 -> ");
        int person2 = in.nextInt();
        int resturant = Resturant(person1, person2);
        System.out.println(resturant);

////////////////////////////////////////////////////////////
        System.out.print("Temperature -> ");
        int temperature = in.nextInt();
        System.out.print("Is Summer -> ");
        boolean isSummer = in.nextBoolean();
        boolean answer = squirrelPlay(temperature, isSummer);
        System.out.println(answer);

        /////////////////////////////////////////////////////
        System.out.print("Speed -> ");
        int speed = in.nextInt();
        System.out.print("Birthday -> ");
        boolean birthday = in.nextBoolean();
        int gai = caughtSpeeding(speed, birthday);
        System.out.println(gai);

        //////////////////////////////////////////////////////
        System.out.print("a -> ");
        int A = in.nextInt();
        System.out.print("b -> ");
        int B = in.nextInt();
        int Summ = sortSumm(A, B);
        System.out.println(Summ);

        //////////////////////////////////////
        System.out.print("a -> ");
        int A1 = in.nextInt();
        System.out.print("b -> ");
        int B1 = in.nextInt();
        boolean six = love6(A1, B1);
        System.out.println(six);

        ///////////////////////////////////////////
        System.out.print("Number -> ");
        int numb = in.nextInt();
        System.out.print("outsideMode -> ");
        boolean outsiideMode = in.nextBoolean();
        boolean intTo10 = in1To10(numb, outsiideMode);
        System.out.println(intTo10);

        ////////////////////////////////////////////////
        System.out.print("IS Morning -> ");
        boolean ismorning = in.nextBoolean();
        System.out.print("Is Mom -> ");
        boolean isMom = in.nextBoolean();
        System.out.print("Is Sleeping -> ");
        boolean isSleeping = in.nextBoolean();
        boolean answerCell = answerCell(ismorning, isMom, isSleeping);
        System.out.println(answerCell);

        ///////////////////////////////////////////////////////
        System.out.print("a -> ");
        int teen_a = in.nextInt();
        System.out.print("b -> ");
        int teen_b = in.nextInt();
        System.out.print("c -> ");
        int teen_c = in.nextInt();
        int teenSum = TeenSum(teen_a, teen_b, teen_c);
        System.out.println(teenSum);
        
        //////////////////////////////////////////////////////////
        System.out.print("a -> ");
        int bj_a = in.nextInt();
        System.out.print("b -> ");
        int bj_b = in.nextInt();        
        int bj = blackjack(bj_a, bj_b);
        System.out.println(bj);
    }

    public static boolean SigarParty(int sigars, boolean weekends) {
        if (weekends == false) {
            if (sigars >= 40 && sigars <= 60) {
                return true;
            } else {
                return false;
            }
        }
        if (weekends == true && sigars >= 40) {
            return true;
        } else {
            return false;
        }
    }

    public static int Resturant(int person1, int person2) {
        if (person1 >= 8 || person2 >= 8) {
            return 2;
        } else if (person1 <= 2 || person2 <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean squirrelPlay(int temperature, boolean isSummer) {
        if (isSummer == false) {
            if (temperature >= 20 && temperature <= 30) {
                return true;
            } else {
                return false;
            }
        }
        if (isSummer == true && temperature >= 20 && temperature <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday == true) {
            if (speed <= 65) {
                return 0;
            } else if (speed > 65 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else if (speed <= 60) {
            return 0;
        } else if (speed > 60 && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int sortSumm(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 19) {
            return 20;
        } else {
            return (a + b);
        }
    }

    public static boolean love6(int a, int b) {
        if ((a + b) == 6 || (a - b) == 6 || a == 6 || b == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode == false) {
            if (n >= 0 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else if (n <= 0 || n >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isSleeping) {

        if (isSleeping == true) {
            return false;
        } else if (isSleeping == false && isMom == true) {
            return true;
        } else if (isMorning == true && isMom == false) {
            return false;
        } else {
            return true;
        }
    }

    public static int TeenSum(int a, int b, int c) {

        if ((a >= 13 && a <= 14) || (a >= 17 && a <= 19)) {
            a = 0;
        }
        if ((b >= 13 && b <= 14) || (b >= 17 && b <= 19)) {
            b = 0;
        }
        if ((c >= 13 && c <= 14) || (c >= 17 && c <= 19)) {
            c = 0;
        }
        return a + b + c;
    }

    public static int blackjack(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21 && b <= 21) {
            return b;
        } else if (a <= 21 && b > 21) {
            return a;
        } else if (21 - a <= 21 - b) {
            return a;
        } else {
            return b;
        }
    }
}
