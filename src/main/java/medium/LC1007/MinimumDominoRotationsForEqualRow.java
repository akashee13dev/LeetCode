package medium.LC1007;

public class MinimumDominoRotationsForEqualRow {

        public int minDominoRotations(int[] tops, int[] bottoms) {
            int candidate1 = tops[0];
            int candidate2 = bottoms[0];

            int result = check(tops, bottoms, candidate1);
            if (result != -1) {
                return result;
            }
            // If candidate1 fails, try candidate2
            if (candidate1 != candidate2) {
                return check(tops, bottoms, candidate2);
            }
            return -1;
        }

        private int check(int[] tops, int[] bottoms, int target) {
            int rotateTop = 0;
            int rotateBottom = 0;

            for (int i = 0; i < tops.length; i++) {
                if (tops[i] != target && bottoms[i] != target) {
                    return -1; // impossible at this index
                }
                if (tops[i] != target) {
                    rotateTop++;
                }
                if (bottoms[i] != target) {
                    rotateBottom++;
                }
            }

            return Math.min(rotateTop, rotateBottom);
        }

}
