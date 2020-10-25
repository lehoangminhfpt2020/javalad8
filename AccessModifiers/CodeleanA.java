package lad8.AccessModifiers;

public class CodeleanA {
    public void methodPublic(){
        methodPrivate();
    }

    protected void methodProtected(){
        methodPrivate();
    }

    void mothodDefault(){

    }
    private void methodPrivate(){}
}
