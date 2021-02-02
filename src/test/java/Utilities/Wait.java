package Utilities;

public class Wait
    {
        public static void Wait(int second) {
            second *= 1000;
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                System.out.println("something happened in sleep method");

            }
        }
    }
