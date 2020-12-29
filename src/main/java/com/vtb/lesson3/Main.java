package com.vtb.lesson3;

/* Разобрался тут с Exceptions, сделал несколько своих и изучил регулярки! :)
 Изначально, при неправильных данных я ловил NumberFormatException в Integer.parseInt()
 и кидал свой MyArrayDataException для вывода подробной информации, но потом переделал под if с регулярным выражением. */
public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "privet", "2"}
        };
        try {
            System.out.println(createArray(arr));
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Индекс строки " + " - " + e.getRowIndex());
            System.out.println("Индекс столбца " + " - " + e.getColumnIndex());
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }

    static int createArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        for (String[] strings : array) {
            if (array.length != 4 || strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].matches("[-+]?\\d+")){
                    sum += Integer.parseInt(array[i][j]);
                } else{
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
