class Swapping{
 public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        int temp=0;
        System.out.println("swapping two nos are "+num1+" & "+num2);
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Swapped nos:"+num1+" & "+num2);
 }
}