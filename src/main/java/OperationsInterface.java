<<<<<<< HEAD:src/main/java/OperationsInterface.java

=======
package main.java;
>>>>>>> c7f5a062d99275f7fee24ddc25519bd11cae82f4:src/OperationsInterface.java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface OperationsInterface {
    void print(String output);
    String readString();
    int readInt();
    public final BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
}