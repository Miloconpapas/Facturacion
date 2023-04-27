public class Calculo {  //Esta clase es de calculos , utiliza y funciona en
                        // los otros forms, por eso no tiene uno propio.
    static String p;
    static String c;
    static String d;
    static double tot;
    static double total;
    static double DC;
    static double Descu;
    static double Prodparse;
    static double CantParse;
    static double st;


    public static void Ina(String AA){
        p = AA;
    }
    public static void Inb(String BB){
        c = BB;
    }
    public static void InDesc(String CC){d = CC;}

    public static double Calcular() {  //precio por cantidad
    Prodparse=Double.parseDouble(p);
    CantParse=Double.parseDouble(c);
    st=Prodparse*CantParse;
    String.valueOf(st);
    return st;

    }

    public static double Descuento(){  //Descuento
        Descu=Double.parseDouble(d);
        Descu=(st*Descu) /100; //Subtotal por descuento dividido 100.
        DC=Descu;
        String.valueOf(DC);
        return DC;
    }
    public static double Total(){
        tot=st-Descu;
        total=tot;
        String.valueOf(total);
        return total;

    }






}
