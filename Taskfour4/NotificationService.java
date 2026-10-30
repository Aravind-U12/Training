class NotificationService {

    private final MessageService messageService;

    // Constructor Dependency Injection
    public NotificationService(MessageService messageService) {

        this.messageService = messageService;
    }

    public void notifyUser(String message) {

        messageService.sendMessage(message);
    }
}
