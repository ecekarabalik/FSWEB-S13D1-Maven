package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Barking Dog
    // Koşul: Geçerli saat 0..23 arasında olmalı.
    // Köpek havlıyorSA ve saat < 8 veya saat > 22 ise uyan (true), aksi halde false.
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        return isBarking && (clock < 8 || clock > 22);
    }

    // Teen Number Checker
    // Herhangi bir yaş 13..19 (dahil) ise true
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // Playing Cat
    // Yazın: 25..45 arası; yaz değilse: 25..35 arası → true
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upper = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upper;
    }

    // Area Calculator - Dikdörtgen
    // Girdi negatifse -1 döner
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1.0;
        return width * height;
    }

    // Area Calculator - Daire
    // Yarıçap negatifse -1 döner
    public static double area(double radius) {
        if (radius < 0) return -1.0;
        return Math.PI * radius * radius;
    }
}