
public class zad1 {
    public static void main (String[]args){
        Integer[]int1 = new Integer[](1,2,1);
        Integer[]int2 = new Integer[](3,2,1);
        System.out.println(jestPalindromem(int1));
    }

    public static <T extends Comparable<T>> boolean jestPalindromem(T[] o){
        int start = 0;
        int end = o.length - 1;
        boolean palindrom = false;
        while (start != end){
            if(o[start].compareTo(o[end])==0){
                palindrom = true;
                start++;
                end--;
            }
            else {
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }
}
