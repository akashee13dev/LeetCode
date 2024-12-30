package easy.LC258;

public class AddDigits {

    public int addDigits(int num) {

        while (num > 9){
            String numStr = num+"";
            int total = 0;
            for (char numChar : numStr.toCharArray()){
                total += Integer.parseInt(numChar+"");
            }
            num = total;
        }
        return num;

    }

}
