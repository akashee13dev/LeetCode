package easy.LC367;


public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {

        return (new Double(Math.sqrt(num))+"").endsWith(".0") ;

    }

}
