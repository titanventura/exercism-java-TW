public class Lasagna {
    public static int expectedMinsInOven = 40;
    public static int layerTime = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.expectedMinsInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int n) {
        return this.expectedMinsInOven - n;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int n) {
        return n * this.layerTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int n) {
        return n + this.preparationTimeInMinutes(layers);
    }
}
