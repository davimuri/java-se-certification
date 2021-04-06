package certification.java11.exceptions;

import java.io.IOException;

public class TryWithResources {

    private static class Resource implements AutoCloseable {
        public String read(boolean throwExc) throws IOException {
            if (throwExc) {
                throw new IOException("Error reading from resource");
            }
            return "Content";
        }
        @Override
        public void close() throws Exception {
            throw new IOException("Error closing resource");
        }
    }

    /**
     * Output:
     * Error reading from resource
     * Suppressed exception: Error closing resource
     * @param args
     */
    public static void main(String[] args) {
        try (Resource res = new Resource()) {
            res.read(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.printf("Suppressed exception: %s", e.getSuppressed()[0].getMessage());
        }
    }
}
