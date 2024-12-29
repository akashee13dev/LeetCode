package LC941;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len == 1){
            return false;
        }
        if(len == 2){
            if(arr[0]<arr[1]){
                return true;
            }
            return false;
        }
        boolean isUpward = true;
        boolean isUpwardDone = false;
        boolean isDownwardDone = false;
        for (int i = 0 ; i<len-1 ; i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
            if(isUpward  && !isDownwardDone){
                isUpward = Math.min(arr[i], arr[i+1]) == arr[i];
            }
            if(isUpward){
                if(isDownwardDone){
                    return false;
                }
                isUpwardDone = true;
                if(arr[i] >= arr[i+1]){
                   isUpward = false;
                }

            }
            else {
                if(!isUpwardDone){
                    return false;
                }
                isDownwardDone = true;
                if(!(arr[i] >= arr[i+1])){
                    return false;
                }
            }
        }
        return isUpwardDone && isDownwardDone;
    }

}
