// Write a program to demonstrate an enumerated type called 
// Directions {North, South, West and East}. Define variables
// dir1, dir2, dir3, dir4, for dir3 use direction type West 
// and for dir 2 use direction type South.

public class Compass {
    enum Directions {North, South, East, West}
    public static void main(String[] args) {
        Directions dir1, dir2, dir3, dir4;

        dir1 = Directions.North;
        dir2 = Directions.South;
        dir3 = Directions.West;
        dir4 = Directions.East;

        System.out.println("dir1 value: " + dir1);
        System.out.println("dir1 ordinal: " + dir1.ordinal());
        System.out.println("dir1 name: " + dir1.name());

        System.out.println();

        System.out.println("dir2 value: " + dir2);
        System.out.println("dir2 ordinal: " + dir2.ordinal());
        System.out.println("dir2 name: " + dir2.name());

        System.out.println();

        System.out.println("dir3 value: " + dir3);
        System.out.println("dir3 ordinal: " + dir3.ordinal());
        System.out.println("dir3 name: " + dir3.name());

        System.out.println();

        System.out.println("dir4 value: " + dir4);
        System.out.println("dir4 ordinal: " + dir4.ordinal());
        System.out.println("dir4 name: " + dir4.name());

        System.out.println();

    }
}
