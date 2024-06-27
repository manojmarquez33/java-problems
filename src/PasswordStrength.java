public class PasswordStrength {

    public static void main(String[] args) {
        // Test cases
        String password1 = "GeeksforGeeks!@12";
        String password2 = "gfg!@12";
        String password3 = "weakpassword";  // This should be Weak

        System.out.println("Strength of '" + password1 + "': " + checkPasswordStrength(password1));
        System.out.println("Strength of '" + password2 + "': " + checkPasswordStrength(password2));
        System.out.println("Strength of '" + password3 + "': " + checkPasswordStrength(password3));
    }

    public static String checkPasswordStrength(String password) {
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        // Check length
        if (password.length() < 6) {
            return "Weak";
        }

        // Check each character of password for required criteria
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-+".indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        // Determine strength based on criteria
        if (hasLower && hasUpper && hasDigit && hasSpecial && password.length() >= 8) {
            return "Strong";
        } else if (hasLower && hasUpper && hasSpecial && password.length() >= 6) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }
}
