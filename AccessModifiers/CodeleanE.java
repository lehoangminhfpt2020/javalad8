package lad8.AccessModifiers;

public class CodeleanE extends CodeleanB {
    public static void main(String[] args) {
        new CodeleanB().methodPublic();
        new CodeleanB().methodProtected();
        new CodeleanE().methodProtected();
    }
}
