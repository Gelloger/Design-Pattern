package pattern.factory;

import pattern.factory.store.SeoulStore;

public class main {
    public static void main(String args[]) {
        SeoulStore seoulStore = new SeoulStore();
        seoulStore.orderPizza("seoul");
    }
}
