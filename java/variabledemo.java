class variabledemo{
    int globalnum1;
    String globalstring;
    boolean globalbool;
    char globalchar;
    public static void main(String[] args){
        int num1=9;
        System.out.println("Local num1:"+num1);

        variabledemo objnum1= new variabledemo();
        System.out.println("global num1:"+objnum1.globalnum1);
        System.out.println("global string:"+objnum1.globalstring);
        System.out.println("global bool:"+objnum1.globalbool);
        System.out.println("global char:"+objnum1.globalchar);

        int sum=num1+objnum1.globalnum1;
        System.out.println("sum:"+sum);

        float floatnum=10.5f;
        System.out.println("float:"+floatnum);

        double dnum=20.52;
        System.out.println("double:"+dnum);
        
        
        sum= (int)dnum + (int)floatnum;
        System.out.println("Sum:"+sum);

}
}