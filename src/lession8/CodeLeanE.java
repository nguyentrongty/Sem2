package lession8;

public class CodeLeanE extends CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();

        new CodeLeanE().methodProtected();
    }
}
