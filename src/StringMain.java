import java.util.Arrays;
import java.util.Scanner;
public class StringMain {
    public static void replace(Scanner scanner){
        System.out.println("Введіть строку: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result = result + charArray[i];
        }
        System.out.println(result);
}
    public static void vowelDetect(Scanner scanner){
        int count = 0;
        System.out.println("введіть строку: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            switch (charArray[i]) {
                case('a'): count++; break;
                case('e'): count++; break;
                case('i'): count++; break;
                case('o'): count++; break;
                case('u'): count++; break;
            }
        }
        System.out.println("Кількість голосних: " + count);
    }
    public static void palindromes(Scanner scanner){
        System.out.println("Введіть строку: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        if(charArray[0] == charArray.length-2 & charArray[1] == charArray.length-1){
            System.out.println("Слово " + word + " є паліндромом!");
        }else{
            System.out.println("Слово " + word + " не є паліндромом!");
        }
    }
    public static void duplicates(Scanner scanner) {
//Намагався використати ArrayList для цього завдання, але видавало помилку "Unreachable code"
//Тому прийшлося імпровізувати
        System.out.println("Введіть строку: ");
        String word = scanner.nextLine();
        String result = "";
        for(int i=0; i < word.length(); i++){
            char character = word.charAt(i);
            if(result.contains(String.valueOf(character))){
                continue;
            }
            result += character;
        }
        System.out.println(result);
    }
    public static void transformStr(Scanner scanner){
        System.out.println("Введіть строку(декілька слів): ");
        String words = scanner.nextLine();
        String delimeter = " ";
        String[] splitedString = words.split(delimeter);
        System.out.println(Arrays.toString(splitedString));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        vowelDetect(scanner);
        palindromes(scanner);
        replace(scanner);
        duplicates(scanner);
        transformStr(scanner);
    }
}
