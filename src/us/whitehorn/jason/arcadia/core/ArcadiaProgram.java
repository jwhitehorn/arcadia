package us.whitehorn.jason.arcadia.core;

import java.io.IOException;
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
    public void exec(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        try{
            main();
        }catch(Exception ex){
            System.out.println("Unhandled exception! ".concat(ex.getMessage()));
        }
    }

    public void main(){

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
    public void _debug(Object[] var){ _debugOutput = var; }

    public Object _box(int var) { return Integer.valueOf(var); }

}
