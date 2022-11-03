package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User newUser = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                newUser = user;
                break;
            }
        }
        if (newUser == null) {
            throw new UserNotFoundException("User not found");
        }
        return newUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Nikita", true)
        };
        try {
            User user = findUser(users, "Nikita");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
        }
    }

}
