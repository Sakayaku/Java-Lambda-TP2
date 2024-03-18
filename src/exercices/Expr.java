package exercices;

import java.util.function.Function;

public interface Expr<V> {
	int eval(Function<V,Integer> env);
	public static V  Var(V v) {
		return (var ->v);
	}
}
