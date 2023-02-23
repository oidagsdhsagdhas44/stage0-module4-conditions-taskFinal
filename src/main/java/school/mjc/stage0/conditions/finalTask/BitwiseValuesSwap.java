package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
//    Implement the program that will swap 2 variables without creating new variables or objects, using bitwise operators:
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }
}
