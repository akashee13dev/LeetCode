package easy.LC1854;

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {

        int birth = logs[0][0];
        int death = logs[0][1];
        int lowestBirth = 0;
        int populationCount = logs.length;
        boolean isFirstTime = true;
        for (int ind = 0; ind< populationCount; ind++){
            int[] years = logs[ind];
            int currentBirth = years[0];
            if((birth< currentBirth && currentBirth < death) && (!isFirstTime)){
                lowestBirth = lowestBirth != 0  ? Math.min(lowestBirth,currentBirth) :  currentBirth;
            }
            birth = Math.min(currentBirth, birth);
            death = Math.max(years[1], death);
            isFirstTime = false;
        }

        return lowestBirth != 0 ? lowestBirth : logs[0][0];
    }

}
