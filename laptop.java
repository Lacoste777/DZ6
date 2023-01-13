package Homework;

class laptop {
    Integer id;
    Integer ram;
    Integer ssd;
    String os;
    String clr;

    laptop(){
        id = null;
        ram = null;
        ssd = null;
        os = null;
        clr = null;
    }
    laptop(Integer newid, Integer newram, Integer newssd, String newos, String newclr){
        id = newid;
        ram = newram;
        ssd = newssd;
        os = newos;
        clr = newclr;
    }
    @Override
    public String toString(){
        String str;
        System.out.println("=================================================================================================================");
        str = "№" + id +" " + "оперативная память(RAM) - " + ram + ", " + "жесткий диск(SSD) - " + ssd + ", " + "операционная система(OS) - " + os + ", " + "цвет(clr) - " + clr;
        return str;
    }
}