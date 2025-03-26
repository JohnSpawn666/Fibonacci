package john.spawn.hellteam.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class RecursiveFibonacci implements IFibonacci{

    private final Map<Integer, BigInteger> memo = new HashMap<>();

    @Override
    public BigInteger calculate(int n) {

        if(n < 0){
            throw new IllegalArgumentException("The parameter n can't be negative");
        }

        if(n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }

        final BigInteger memorized = memo.get(n);
        if(memorized != null){
            return memorized;
        }

        final BigInteger result = calculate(n-1).add(calculate(n-2));
        memo.put(n, result);

        return result;
    }
}
