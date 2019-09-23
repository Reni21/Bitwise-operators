package task03;

class CountBitsService {

    public int countBitsInNumber(long number) {
        int res = 0;
        while (number > 0) {
            res = -(~res); // increment
            number >>= 1;
        }
        return res;
    }
}
