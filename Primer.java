public class Primer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer(); // резеривирует буфер из 16 символов
        StringBuffer s2 = new StringBuffer(50); // устанавливает размер буфера 50 симв.
        StringBuffer s = new StringBuffer("Привет"); // устанавливает содержимое плюс еще 16 буфер
        System.out.println("Длина объекта: " + s.length());
        System.out.println("Общий объем памяти: " + s.capacity());
        int index = s.indexOf("р");
        s.setCharAt(index, 'л'); // устанавливает символ 'л' на позицию index
        System.out.println(s);
        System.out.println(s.charAt(0)); // получает символ позиции 0
        s.append(" мир!"); // добавить в конец строки дополнительно " мир!"
        System.out.println(s);
        System.out.println(s.reverse()); // меняет порядок символов
        s.deleteCharAt(0); // удаляет символ с позиции 0
        System.out.println(s);
        s.delete(0, 5); // удаляет символы с 0 по 4 включительно
        System.out.println(s);
        s.delete(0, s.length()); // очистим строку
        s.append("Это - тест");
        System.out.println(s);
        s.replace(4, 5, "был"); // заменяет набор символов с 4 по 5 (5 невключительно)словом "был"
        System.out.println(s);
        s.insert(7, " хороший"); // вставляет на позицию 7 подстроку " хороший"
        System.out.println(s);
        System.out.println(s.substring(0, 3)); // возвращает часть строки с 0 по 3 (3невключительно) символ
        System.out.println(s);

    }
}

