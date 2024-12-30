package easy.LC383;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        int len1 = ransomNote.length();
        int len2 = magazine.length();

        if(len1 > len2){
            return false;
        }

        for (char ch : magazine.toCharArray()){
            if(ransomNote.isBlank() || ransomNote.isEmpty()){
                return true;
            }
            if(ransomNote.contains(ch+"")){
                ransomNote = ransomNote.replaceFirst(ch+""," ");
            }
        }

        return ransomNote.isBlank() || ransomNote.isEmpty();
    }

}
