package view.cli;

import view.api.AuthView;

public class AuthViewCli extends CliView implements AuthView {
    // register command
    //     errors:
    public void errorDuplicateName() {
        displayError("This username is already taken. Please use another one.");
    }

    public void errorWeakPassword() {
        displayError("This password is weak. Please use a stronger one.\n" +
                "It should at least have 8 characters using lowercase, uppercase, numbers and " +
                "special characters (? > < , \" ' ; : \\ / | [ ] } { + = ( ) * & ^ % $ # !   ).");
    }

    public void errorRepeatPasswordDoseNotMatch() {
        displayError("Re-Password does not match the password.");
    }

    public void errorNicknameLength() {
        displayError("Nickname length should at least be 3 characters at most 30.");
    }

    public void errorWrongEmailPattern() {
        displayError("This email is not a correct one.");
    }

    //     success:
    public void showUserCreated() {
        displayMessage("User account has been successfully created.");
    }

    // login command
    //     errors:
    public void errorWrongUsernameOrPassword() {
        displayError("Wrong Username or Password has been given.");
    }

    public void errorWrongUsernameOrEmail() {
        displayError("Wrong Username or Email has been given.");
    }

    public void errorWrongSecurityAnswer() {
        displayError("The answer is wrong.");
    }

    //     success:
    public void showUserLoggedIn() {
        displayMessage("You have been successfully logged in.");
    }

    public void showPasswordChanged() {
        displayMessage("Your password has been successfully changed.");
    }
}
