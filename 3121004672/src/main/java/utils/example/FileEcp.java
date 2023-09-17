package utils.example;


public class FileEcp extends RuntimeException{
    private String errMessage;
    public FileEcp(){
        super();
    }
    public FileEcp(String errMessage){
        super(errMessage);
        this.errMessage=errMessage;
    }
    public String getErrMessage(){
        return errMessage;
    }
    public static void handle(){
        throw new FileEcp("仅支持读取txt类型文件");
    }
}
