package easy.LC168;
import java.util.Map;

public class ExcelSheet {


    public String convertToTitle(int columnNumber) {

        Map<Integer, String> map = Map.ofEntries(
                Map.entry(1, "A"), Map.entry(2, "B"), Map.entry(3, "C"),
                Map.entry(4, "D"), Map.entry(5, "E"), Map.entry(6, "F"),
                Map.entry(7, "G"), Map.entry(8, "H"), Map.entry(9, "I"),
                Map.entry(10, "J"), Map.entry(11, "K"), Map.entry(12, "L"),
                Map.entry(13, "M"), Map.entry(14, "N"), Map.entry(15, "O"),
                Map.entry(16, "P"), Map.entry(17, "Q"), Map.entry(18, "R"),
                Map.entry(19, "S"), Map.entry(20, "T"), Map.entry(21, "U"),
                Map.entry(22, "V"), Map.entry(23, "W"), Map.entry(24, "X"),
                Map.entry(25, "Y"), Map.entry(26, "Z")
        );
        StringBuilder title = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Decrement to handle 1-based indexing
            int remainder = columnNumber % 26;
            title.insert(0, map.get(remainder + 1)); // Get the corresponding letter
            columnNumber /= 26;
        }

        return title.toString();
    }


}
