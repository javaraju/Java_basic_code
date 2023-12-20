package Test;

public class Test3 {

    public static void main(String [] args){
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};
        System.out.println(checkEqualityOfArray(a2,a3));
    }
    private static boolean checkEqualityOfArray(Integer [] a1, Integer [] a2){
        boolean flag = false;

        for (int i=0; i<a1.length;i++){
            if (i >= a2.length){
                break;
            }
            if (a2[i].equals(a1[i])){
                flag = true;
            }
            else {
                flag = false;
            }
        }
       return flag;
    }
}
