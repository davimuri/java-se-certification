package certification.java11.interfaces;

import java.nio.file.Path;
import java.util.Collection;

interface A {
    Iterable a();
}
interface B extends A {
    Collection a();
}
interface C extends A {
    Path a();
}
/* Compilation error
interface D extends B, C {
}
*/

public class Overriding {
}
