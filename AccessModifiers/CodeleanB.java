package lad8.AccessModifiers;

public class CodeleanB {
    public static void main(String[] args) {
        new CodeleanA().methodPublic();
        new CodeleanA().methodProtected();
        new CodeleanA().mothodDefault();
    }

    public void methodPublic(){

    }

    protected void methodProtected(){

    }

    void methodDefault(){

    }

    private void methodPrivate(){

    }
}
