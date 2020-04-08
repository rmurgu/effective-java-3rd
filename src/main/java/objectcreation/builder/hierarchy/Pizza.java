package objectcreation.builder.hierarchy;

import java.util.EnumSet;
import java.util.Set;

/**
 * The Builder pattern is well suited to class hierarchies. Use a parallel hierarchy
 * of builders, each nested in the corresponding class. Abstract classes have
 * abstract builders; concrete classes have concrete builders.
 *
 * Note that Pizza.Builder is a generic type with a recursive type parameter.
 * This, along with the abstract self method, allows method chaining to
 * work properly in subclasses, without the need for casts. This workaround for the
 * fact that Java lacks a self type is known as the simulated self-type idiom.
 */
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    abstract static class Builder<T extends Builder<T>> {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }
}
