public class SingeltonClass {
    int num =1 ;

    SingeltonClass() {
            num += 1;
    }
    private static SingeltonClass obj;
    public static SingeltonClass getInstance(){
        if(obj == null) {
            obj = new SingeltonClass();
        }
        return obj;

    }





}

