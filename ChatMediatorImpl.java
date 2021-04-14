

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator.
 * Has a list of users in the group and provide logic for the communication between the users.
 *
 */
class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}