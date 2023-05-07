public class BookStoreClerk {

    // Partitions the single input String into 3 substrings depending
    // on the occurrences of '-' char and returns a String[] containing 3 elements:
    // First element is the substring from index 0 to first occurrence of '-' character
    // Second element contains the substring from the first occurrence of '-' character to its second
    // Third element contains the substring from the second occurrence of '-' character to the end of the input
    // In case of not finding enough '-' chars (2 in this case) in the input string, should throw Exception.
    private String[] partitionString(String str) throws IllegalArgumentException {
        try {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {
                    count++;
                }
            }
            if (count != 2) {
                throw new IllegalArgumentException("Invalid Input to partitionString method : Could not found find the seperator character \'-\'");
            }
            String[] words = str.split("-");

            if (words[0].isBlank()) {
                throw new IllegalArgumentException("Input BookName is invalid! ");
            }
            if (words[1].isBlank() || words[1] == null) {
                throw new IllegalArgumentException("Input AuthorName is invalid!");
            }
            if (words[2].isBlank() || words[2] == null) {
                throw new IllegalArgumentException("Input publishedYear is invalid!");
            }

            return words;
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
        return new String[3];
    }

    // Note that bookInfo should be in desired format, as it is explained in Lab Assignment Document
    // First checks whether input book info is blank or null, throws necessary exceptions
    // Then, calls partitionString method to partition input bookInfo into pieces
    // Saves the partitioned pieces into necessary variables
    // Finally, if all necessary info is valid,i.e., bookName, authorName and yearPublished, creates
    // a new book instance and returns it.
    public Book readAndValidateBook(String line) throws InvalidBookException {
        if (line == null || line.isBlank()) {
            throw new InvalidBookException("Input BookInfo is empty!");
        }
        try {
            String[] parts = partitionString(line);
            int yearPublished = Integer.parseInt(parts[2]);
            return new Book(parts[0], parts[1], yearPublished);

        } catch (NumberFormatException e) {
            throw new InvalidBookException("Invalid yearPublished argument for the book\ncaused by " + e.getClass().getCanonicalName());
        } catch (IllegalArgumentException e) {
            throw new InvalidBookException(e.getMessage() + "\ncaused by " + e.getClass().getCanonicalName());
        }
    }
}
