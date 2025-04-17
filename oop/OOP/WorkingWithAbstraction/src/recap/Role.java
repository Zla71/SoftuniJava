package recap;

// енумерация
public enum Role {

    // енъм стойност
    VIEWER(false),
    ADMINISTRATOR(true),
    EXPLORER(false),
    SUPPORT(true);

    // поле в енумерацията
    private boolean isAccessAllowed;

    // конструктора не може да е публичен (public), не може да се създават нови роли
    private Role(boolean isAccessAllowed) {
        this.isAccessAllowed = isAccessAllowed;
    }

    // енумерациите поддържат методи
    public boolean isAccessAllowed() {
        return isAccessAllowed;
    }
}
