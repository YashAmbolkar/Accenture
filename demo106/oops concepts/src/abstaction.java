abstract class car {
    abstract void fueltype();
    public void speed(){
        System.out.println("250Km/h");
    }
}

class NANO extends car {
    void fueltype() {
        System.out.println("Petrol");
    }

    public static void main(String[] args) {
        NANO n = new NANO();
        n.fueltype();
        n.speed();
    }
}
