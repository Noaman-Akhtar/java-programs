public class io {
    public static void main (String args []){
        if (args.length!=10) {
            System.out.println("enter 10 numbers only");
            return;
        }
        int [] arr = new int [10];
        int even =0,odd =0,i=0;
        for (String arg:args){
            try{
                arr[i]= Integer.parseInt(arg);
                i++;
            }catch(NumberFormatException e){
                System.out.println("");
            }
        }
    }
}
