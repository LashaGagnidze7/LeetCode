package Arrays101;

// A simple definition for a DVD.
public class DVD {
    public static DVD[] dvdCollection;

    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }


    public static void whatIsAnArray() {
        // The actual cole for creating an Array to hold DVD's.
        dvdCollection = new DVD[15];
    }

    public static void accessingElementInArrays() {
        // *** Writing Items into an Array ***
        // Firstly, we need to actually create a DVD object for The Avengers.
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

        // Next, we'll put it into the 8th place of the Array. Remember, because we
        // started numbering from 0, the index we want is 7.
        dvdCollection[7] = avengersDVD;

        // Three more DVDs added to the array.
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        // Put "The Incredibles" into the 4th place: index 3.
        dvdCollection[3] = incrediblesDVD;

        // Put "Finding Dory" into the 10th place: index 9.
        dvdCollection[9] = findingDoryDVD;

        // Put "The Lion King" into the 3rd place: index 2.
        dvdCollection[2] = lionKingDVD;

        // Fourth element array element has been overwritten.
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;

        // *** Reading Items from an Array ***
        // print out what's in indexes 7, 10, and 3.
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);

        // Will print:

        // The Avengers, directed by Joss Whedon, released in 2012
        // null
        // Star Wars, directed by George Lucas, released in 1977

        // *** Writing Items into an Array with a Loop ***
        int[] squareNumbers = new int[10];

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // We need to be careful with the 0-indexing. The next square number
            // is given by (i + 1) * (i + 1).
            // Calculate it and insert it into the Array at index i.
            int square  =(i + 1) * (i + 1);
            squareNumbers[i] = square;
        }

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // Access and print what's at the i'th index.
            System.out.println(squareNumbers[i]);
        }

        // Will print:
        // 1
        // 4
        // 9
        // 16
        // 25
        // 36
        // 49
        // 64
        // 81
        // 100

        // For each VALUE in the Array.
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.println(square);
        }
        // Prints exactly the same as the previous example.
    }

    public static void arrayCapacityVsLength() {
        // Create a new array with a capacity of 6.
        int[] array = new int[6];

        // Current length is 0, because it has 0 elements.
        int length = 0;

        // Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);

        // *** Handling Array Parameters ***
        class Solution {
            public int findMaxConsecutiveOnes(int[] nums) {
                // Hint: Initialise and declare a variable here to
                // keep track of how many 1's you've seen in a row.
                for (int i = 0; i < nums.length; i++) {
                    // Do something with element nums[i].
                }

                return 0; // For error-handling
            }
        }
    }
}
