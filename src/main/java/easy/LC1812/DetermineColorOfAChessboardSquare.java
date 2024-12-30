package easy.LC1812;

public class DetermineColorOfAChessboardSquare {

    public boolean squareIsWhite(String coordinates) {
        int rowInt = ( coordinates.charAt(0) - 97 ) + 1;
        return ! (( rowInt + Integer.parseInt(coordinates.charAt(1)+"") )%2 == 0);
    }

}
