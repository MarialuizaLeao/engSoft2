<<<<<<< HEAD:src/main/java/Server.java

=======
package main.java;
>>>>>>> c7f5a062d99275f7fee24ddc25519bd11cae82f4:src/Server.java
public class Server implements OperationsInterface {

    public void print(String output) {
        System.out.println(output);
    }

    public String readString() {
        try {
            return scanner.readLine();
        } catch (Exception e) {
            print("\nErro na leitura de entrada, digite novamente");
            return readString();
        }
    }

    public int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (Exception e) {
            print("\nErro na leitura de entrada, digite novamente");
            return readInt();
        }
    }
}