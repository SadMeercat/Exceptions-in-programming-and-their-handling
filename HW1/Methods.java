import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods{

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(4, 3, 2);
        System.out.println(calc1(list1, list2));

        String strList1 = "1,2,3,4";
        String strList2 = "4,3,i,1";
        System.out.println(calc2(strList1, strList2));

        int[] arrList1 = new int[] {1,2,3,4};
        int[] arrList2 = new int[] {4,3,2};
        System.out.println(calc3(arrList1, arrList2));
    }

    public static String calc1(List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>();
        
        try{
            if(list1.size() != list2.size()){
                throw new Exception();
            }
            for (int i = 0; i < list1.size(); i++) {
                result.add(list1.get(i) / list2.get(i));
            }
        }
        catch(Exception ex){
            return "Длины массивов не совпадают";
        }
        String resultString = "";
        for (int i = 0; i < result.size(); i++) {
            resultString += String.valueOf(result.get(i)) + ", "; 
        }
        return resultString;
    }

    public static String calc2(String list1, String list2){
        String[] newList1Str = list1.split(",");
        String[] newList2Str = list2.split(",");
        String result = "";
        try{
            if(newList1Str.length != newList2Str.length){
                return "Разная длина массивов";
            }
            for (int i = 0; i < newList2Str.length; i++) {
                result += Integer.toString(Integer.parseInt(newList1Str[i]) / Integer.parseInt(newList2Str[i]));
            }
            return result;
        }
        catch(NumberFormatException ex){
            return "Не все элементы числа!";
        }
    }

    public static String calc3(int[] list1, int[] list2){
        List<Integer> result = new ArrayList<>();
        
        try{
            for (int i = 0; i < list1.length; i++) {
                result.add(list1[i] / list2[i]);
            }
        }
        catch(IndexOutOfBoundsException ex){
            return "Длины массивов не совпадают";
        }
        String resultString = "";
        for (int i = 0; i < result.size(); i++) {
            resultString += String.valueOf(result.get(i)) + ", "; 
        }
        return resultString;
    }
}