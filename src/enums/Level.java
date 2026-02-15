package enums;
enum Level {
    LOW(1,"Low Priority"),
    MEDIUM(2,"Medium priority"),
    HIGH(3,"High priority");

    private int code;
    private String description;
    Level(int code,String description){
        this.code = code;
        this.description=description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);
        System.out.println(level.getCode());
        System.out.println(level.getDescription());
    }
}
