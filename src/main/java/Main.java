public class Main {

    public static void main(String[] args) {

        int x = 3;

        // Pas deze assignement aan zodat variable `four` de waarde `4` toegewezen krijgt.
        int four = x;
        // Pas deze assignement aan zodat variable `one` de waarde `1` toegewezen krijgt.
        int one = x;
        // Pas deze assignement aan zodat variable `three_point_5` de float(!) waarde `3.5` toegewezen krijgt.
        float three_point_5 = x;
        // Pas deze assignement aan zodat variable `one_point_5` de waarde `1.5` toegewezen krijgt.
        double one_point_5 = x;
        // Pas deze assignement aan zodat variable `zero` de waarde `0` toegewezen krijgt. Je mag geen +, -, * of / gebruiken.
        int zero = x;

        // Wat kunnen we op de lege regel hieronder schrijven zodat de System.out.println daaronder klopt?

        System.out.println(x); // six
        // Pas onderstaand statement aan zodat dat statement en het statement daarna kloppen
        System.out.println(x); // six
        System.out.println(x); // seven
        // Pas onderstaan statement aan zodat het statement klopt.
        System.out.println(x); // six

        int left = 5;
        int right = 0;
        boolean bool = false;
        // voeg een assignment toe voor de variabele `right` zodat boolean `a1` true is.

        boolean a1 = left < right;
        // voeg een assignment toe voor de variabele `right` zodat boolean `a2` true is.

        boolean a2 = left > right;
        // voeg een assignment toe voor de variabele `right` zodat boolean `a3` true is.

        boolean a3 = left == right;
        // voeg een assignment toe voor de variabele `bool` zodat boolean `a4` true is.

        boolean a4 = left <= 3 || bool;
        // voeg een assignment toe voor de variabele `bool` zodat boolean `a5` true is.

        boolean a5 = left > 4 && !bool;


        // Pas geen code onder deze regel aan

        System.out.println(four);
        System.out.println(one);
        System.out.println(three_point_5);
        System.out.println(one_point_5);
        System.out.println(zero);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
