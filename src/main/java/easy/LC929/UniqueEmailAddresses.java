package easy.LC929;

import java.util.HashSet;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> mails = new HashSet<>();
        for (String mail : emails){
            String domain = mail.split("@")[1];
            String emailName = mail.split("@")[0];
            emailName = emailName.split("\\+")[0];
            emailName = emailName.replaceAll("\\.","");
            mails.add(emailName.concat("@").concat(domain));
        }
        return mails.size();

    }

}
