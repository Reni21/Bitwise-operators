package task03;

class CountBitsService {

    int countBitsInPositiveNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Incorrect number format. Expected positive number.");
        }
        int res = 0;
        while (number > 0) {
            res = -(~res); // increment
            number >>= 1;
        }
        return res;
    }
}
