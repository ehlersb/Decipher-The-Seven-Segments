/**
 * Created by Benjamin Ehlers on 12/31/2018.
 */
public class DigitalNumber {
    private String topRow;
    private String middleRow;
    private String bottomRow;
    private int actualInteger;

    public DigitalNumber(String topRow, String middleRow, String bottomRow){
        this.topRow = topRow;
        this.middleRow = middleRow;
        this.bottomRow = bottomRow;
    }

    public DigitalNumber(){}

    public int findActualInteger() {
        if(topRow.substring(1, 2).equals(" ")) { // middle top is empty can be 4 or 1
            if(middleRow.substring(0,1).equals(" ")) return actualInteger = 1;
            else return actualInteger = 4;
        }
        else { // middle top is a line
            if(bottomRow.substring(1,2).equals(" ")) return actualInteger = 7;
            if(middleRow.substring(2,3).equals(" ")) { // middle right is empty
                if(bottomRow.substring(0,1).equals(" ")) return actualInteger = 5;
                else return actualInteger = 6;
            }
            else { // top right is a line (2,3,8,9 left)
                if(middleRow.substring(0,1).equals(" ")){ // middle left is empty
                    if(bottomRow.substring(0,1).equals(" ")) return actualInteger = 3;
                    else return actualInteger = 2;
                }
                else { // top left is full (8,9 left)
                    if(bottomRow.substring(0,1).equals(" ")) return actualInteger = 9;
                    else if (middleRow.substring(1,2).equals(" "))return actualInteger = 0;
                    else return actualInteger = 8;
                }
            }

        }
    }

    public String getTopRow() {
        return topRow;
    }

    public void setTopRow(String topRow) {
        this.topRow = topRow;
    }

    public String getMiddleRow() {
        return middleRow;
    }

    public void setMiddleRow(String middleRow) {
        this.middleRow = middleRow;
    }

    public String getBottomRow() {
        return bottomRow;
    }

    public void setBottomRow(String bottomRow) {
        this.bottomRow = bottomRow;
    }
}
