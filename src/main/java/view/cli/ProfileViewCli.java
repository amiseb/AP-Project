package view.cli;

import model.user.User;
import view.api.ProfileView;

public class ProfileViewCli extends CliView implements ProfileView {
    // profile change-username command
    public void errorSameUsername() {
        displayError("The given username is the same as your old one.");
    }

    // profile change-nickname command
    public void errorSameNickname() {
        displayError("The given nickname is the same as your old one.");
    }

    // profile change-email command
    public void errorSameEmail() {
        displayError("The given email is the same as your old one.");
    }

    // profile change-password command
    public void errorSamePassword() {
        displayError("The given password is the same as your old one.");
    }

    public void errorWrongPassword() {
        displayError("The given password is incorrect.");
    }

    // profile show-info
    public void showUserInfo(User user) {
        // TODO: implement after the User class is done.
    }

}
