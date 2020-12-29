package com.vtb.lesson3;

public class MyArrayDataException extends MyArrayException{
    private final int row;
    private final int column;

    public int getRowIndex() {
        return row;
    }

    public int getColumnIndex() {
        return column;
    }

    public MyArrayDataException(int row, int column) {
        super("Неправильные данные в строке " + (row + 1) + " и столбце " + (column + 1) + ".");
        this.row = row;
        this.column = column;
    }
}
