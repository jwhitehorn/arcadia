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
    public void puts(float message){
        System.out.println(message);
    }

    public void run(){

    }

    public Object _debugOutput;
    public void _debug(int var){
        _debugOutput = var;
    }
    public void _debug(String var){
        _debugOutput = var;
    }
    public void _debug(float var){
        _debugOutput = var;
    }

}
