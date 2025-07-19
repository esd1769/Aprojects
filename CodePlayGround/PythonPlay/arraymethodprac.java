public class Main{
    public static int indexFinder(int [] arr,int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){return i;

            }
        }

    public static char[] StringtoArray(String str){
        char[] arr=new char[str.length()];
        for (int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        return arr;
    }


    }

}

