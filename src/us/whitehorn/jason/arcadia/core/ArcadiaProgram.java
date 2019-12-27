package us.whitehorn.jason.arcadia.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArcadiaProgram {

    public void puts(String message){
        System.out.println(message);
    }
    public void puts(int message){
        System.out.println(message);
    }

    public void run(){

    }

    public Object _invoke_func(String funcName, Object[] args){
        try {
            Class cls = Class.forName("us.whitehorn.jason.arcadia.DynamicArcadiaProgram");

            Class[] paramString = new Class[1];
            paramString[0] = String.class;
            Method method = cls.getDeclaredMethod(funcName, paramString);

            method.invoke(this, args);
        } catch (ClassNotFoundException e) { } catch (NoSuchMethodException e) {
            //TODO implement method_missing
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

}
