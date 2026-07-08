package org.example.demo;

public class Board{
    private int dimension;

    private List<List<Cell>> board;

    private Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            List<Cell> row = new ArrayList<>();
            for(int j=0;j<dimension;j++){
                row.add(new Cell(i,j));
            }
            board.add(row);
        }
    }

    //. create  getter and setters
    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void printBoard(){
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                if(board.get(i).get(j).getCellState() == CellState.EMPTY){
                    System.out.print("- ");
                }
                else if(board.get(i).get(j).getCellState() == CellState.FILLED){
                    System.out.print(board.get(i).get(j).getPlayer().getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }
}