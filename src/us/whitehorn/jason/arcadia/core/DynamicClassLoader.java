package us.whitehorn.jason.arcadia.core;

//https://dzone.com/articles/fully-dynamic-classes-with-asm
public class DynamicClassLoader extends ClassLoader {
    public Class<?> defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}