/**
 * Mediator Pattern Interface.
 * Defines the contract for concrete mediators.
 */
interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
