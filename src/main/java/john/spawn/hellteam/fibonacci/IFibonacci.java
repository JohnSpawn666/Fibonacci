package john.spawn.hellteam.fibonacci;

import java.math.BigInteger;

public interface IFibonacci {

    /**
     * Calcule la valeur du terme de la suite de Fibonacci pour le rang indiqué
     *
     * @param n Le rang
     * @return La valeur du terme pour me rang indiqué
     * @throws IllegalArgumentException Si le rang indiqué est négatif
     */
    BigInteger calculate(int n);

}
