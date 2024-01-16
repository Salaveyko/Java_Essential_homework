package MyDictionary;

public class NoSuchKeyException extends RuntimeException {
    public NoSuchKeyException(String msg) {
        super(msg);
    }
}
