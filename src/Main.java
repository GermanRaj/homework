public class Main {
    public static void main(String...args){

        int x = 10;
        int y = 20;
        // 20+10
        x = x+y; // novij X budet raven 30 (summa 2 chisel, iz nego potom mozhno dostatj ostalnije dannije)
        //  30-20
        y = x-y; // novij Y budet raven 10 ( Summa 2 chisel - starij Y dast nam novij Y)
        //  30 -10
        x = x-y; // novij X budet raven 20 (Novij X - Novij Y dast nam znachneije starogo Y)

        System.out.println(x);
        System.out.println(y);


    }




}
