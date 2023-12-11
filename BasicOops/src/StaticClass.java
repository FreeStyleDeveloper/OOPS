

public class StaticClass {

    static class Test{

        static Integer num;

        public Test(Integer num)
        {
            Test.num =  num;
        }


    }


    public static void main(String[] args) {


        SingeltonClass obje = SingeltonClass.getInstance();
        SingeltonClass obje1 = SingeltonClass.getInstance();
        SingeltonClass obje2 = SingeltonClass.getInstance();


        System.out.println(obje2);

        Test obj = new Test(12);
        Test obj2 = new Test(14);

        System.out.println(Test.num);
        System.out.println(Test.num);
    }
}
