public class Lab6_1 {
    public static void main(String[] args) {
        String s = "Преобразовать... строку... символов.... заменив... в... ней... каждую... из.. групп.... "
                + "стоящих.. рядом. точек.... одной.. точкой...";
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println("Количество точек: " + count);
        char a[] = s.toCharArray();
        String r = "";
        for (int i=0; i< a.length-1; i++) {
            if(a[i] != '.') {
                r = r+ a[i];
            }
            else if (a[i+1]!= '.') {
                r=r+a[i];
            }
        }
        r=r+a[s.length()-1];
        String s2 = new String(a);
        System.out.println("Из массива: " + r);
    }
}

