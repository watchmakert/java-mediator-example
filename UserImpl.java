
/**
 * Mediator Design Pattern Concrete Colleague.
 *
 */
class UserImpl extends User {

    UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    /**
     * The method is using mediator to send the message to the users and it has no idea how it will be handled by the mediator.
     *
     * @param msg message to send
     */
    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}