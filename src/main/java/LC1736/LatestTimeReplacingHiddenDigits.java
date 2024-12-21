package LC1736;

public class LatestTimeReplacingHiddenDigits {

    public String maximumTime(String time) {

        if(!time.contains("?")){
            return time;
        }

        String hour = time.split(":")[0];
        String minute = time.split(":")[1];

        String finalHour = hour;
        if(hour.contains("?")){
            if(hour.equals("??")){
                finalHour = "23";
            }
            else {
                finalHour = hour.startsWith("?") ? Integer.parseInt(finalHour.charAt(1)+"") >= 4 ?  finalHour.replace("?","1") :  finalHour.replace("?","2") : finalHour;
                finalHour = hour.endsWith("?") ? hour.startsWith("2") ? finalHour.replace("?","3") : finalHour.replace("?","9") : finalHour;
            }
        }
        String finalMinute = minute;
        if(minute.contains("?")){
            if(minute.equals("??")){
                finalMinute = "59";
            }
            else {
                finalMinute = minute.startsWith("?") ? finalMinute.replace("?","5") : finalMinute;
                finalMinute = minute.endsWith("?") ? finalMinute.replace("?","9") : finalMinute;
            }
        }
        return finalHour+":"+finalMinute;


    }

}
