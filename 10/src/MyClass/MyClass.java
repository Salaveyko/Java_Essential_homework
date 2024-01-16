package MyClass;

import java.lang.reflect.InvocationTargetException;

public class MyClass<T> {
    private MyClass() {
    }

    public static <T> T factoryMethod(Class<T> cl) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return cl.getDeclaredConstructor().newInstance();
    }
}
