package certification.java11.enums;

import java.io.Serializable;

public enum SerializableEnum implements Serializable {
    A(1) { public int val = 1; },
    B(2);

    int c;
    SerializableEnum(int v) {
        c = v;
    }
}
