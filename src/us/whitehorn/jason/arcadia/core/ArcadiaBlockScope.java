package us.whitehorn.jason.arcadia.core;
import org.objectweb.asm.Label;

public class ArcadiaBlockScope {
    private Label blockStart;
    private Label blockEnd;

    public ArcadiaBlockScope(){
        this.blockStart = new Label();
        this.blockEnd = new Label();
    }

    public Label getBlockStart(){
        return blockStart;
    }

    public Label getBlockEnd(){
        return blockEnd;
    }
}
