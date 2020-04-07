package lession8;

class CodeLeanA {
    public void methodPublic() {
        methodPrivate();
    }
    protected void methodProtected() {
        methodPrivate();
    }
    void methodDefault() {
        methodPrivate();
    }
    private void methodPrivate(){}
}
