package objectcreation.staticfactorymethod;

/**
 * A class can provide its clients with static factory methods instead of, or in
 * addition to, public constructors.
 * 
 * One advantage of static factory methods is that, unlike constructors, they
 * have names.
 *
 * A second advantage of static factory methods is that, unlike constructors,
 * they are not required to create a new object each time they’re invoked.
 *
 * A third advantage of static factory methods is that, unlike constructors,
 * they can return an object of any subtype of their return type.
 *
 * A fourth advantage of static factories is that the class of the returned
 * object can vary from call to call as a function of the input parameters.
 *
 * A fifth advantage of static factories is that the class of the returned object
 * need not exist when the class containing the method is written.
 *
 * The main limitation of providing only static factory methods is that
 * classes without public or protected constructors cannot be subclassed.
 *
 * A second shortcoming of static factory methods is that they are hard for
 * programmers to find.
 */
public class Guitar {

    private final String type;

    public Guitar(String type) {
        this.type = type;
    }

    public static Guitar fender() {
        return new Guitar("fender");
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "type='" + type + '\'' +
                '}';
    }
}
