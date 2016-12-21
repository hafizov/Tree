public class Lab6_2 {
    public static void main(String[] args){
        String s="Расположить слова данного предложения в порядке убывания длин.";
        char a[]= s.toCharArray();
        String r = "";
        for (int i = 0; i <a.length; i++){
            if (a[i]==s.length()){
                r=r+a[i];
            }
        }
        r=r+a[s.length()-1];
        String s2 = new String(a);
        System.out.println("Из массива: " + r);

    }
}
