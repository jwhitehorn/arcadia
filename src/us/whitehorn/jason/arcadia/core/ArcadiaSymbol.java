package us.whitehorn.jason.arcadia.core;

import java.lang.reflect.Type;

public class ArcadiaSymbol {
    private String symbolName;
    private String type;
    private int symbolId;

    public ArcadiaSymbol(String symbolName, String type, int symbolId){
        this.symbolName = symbolName;
        this.type = type;
        this.symbolId = symbolId;
    }

    public String getSymbolName(){
        return symbolName;
    }

    public void setSymbolName(String symbolName){
        this.symbolName = symbolName;
    }

    public String getVMType(){
        return type;
    }

    public void setVMType(String type){
        this.type = type;
    }

    public int getSymbolId(){
        return symbolId;
    }

    public void setSymbolId(int symbolId){
        this.symbolId = symbolId;
    }
}
