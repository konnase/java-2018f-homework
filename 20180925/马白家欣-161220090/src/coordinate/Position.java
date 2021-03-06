package com.homework3.coordinate;

/**
 * @Description 点的坐标
 * @Author LUCUS BAI
 * @Date 2018/10/23
 */
public class Position {

    private int row;
    private int col;

    public Position(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void move(int deltaRow, int deltaCol){
        this.row += deltaRow;
        this.col += deltaCol;
    }

}
