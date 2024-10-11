import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);

    public static int getNum(){
        return sc.nextInt();
    }

    public static char getChar(){
        return sc.next().charAt(0);
    }

    public static String getString(){
        return sc.nextLine();
    }

    public static long getLong(){
        return sc.nextLong();
    }
    public static short getShort(){
        return sc.nextShort();
    }
    public static byte getByte(){
        return sc.nextByte();
    }
    public static float getFloat(){
        return sc.nextFloat();
    }
    public static double getDouble(){
        return sc.nextDouble();
    }
    public static boolean getBoolean(){
        return sc.nextBoolean();
    }

    
}
