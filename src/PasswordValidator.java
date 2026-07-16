// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        if (pw == null) throw new IllegalArgumentException() ;
        if(pw.length()==MIN_LEN) return true ;
        if(pw.length()==MAX_LEN) return true ;
        
        if(pw.length()<8) return false ;
        if(pw.length()>20) return false ;

        // TODO: implement ตาม spec ใน README.md (R1-R6)
        boolean hasUpper = false ;
        boolean hasLower = false ;
        boolean hasDigit = false ;
        boolean hasNoSpace = true ;
        
        for (int i =0 ; i < pw.length() ; i ++){
            if(Character.isUpperCase(pw.charAt(i))) hasUpper =true ;
            if(Character.isLowerCase(pw.charAt(i))) hasLower = true ;
            if(Character.isDigit(pw.charAt(i))) hasDigit = true ;
            if(Character.isSpaceChar(pw.charAt(i))) hasNoSpace = false ;
              
            
            
        }
        return hasUpper&&hasLower&&hasDigit&&hasNoSpace;
    }
}
