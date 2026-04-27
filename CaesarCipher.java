public class CaesarCipher {

    // Encodes a single lowercase letter using a Caesar cipher shift.
    // Example: caesarEncodeChar('h', 3) → 'k'
    public char caesarEncodeChar(char c, int shift) {

        // TODO: get the letter's position in the alphabet (0–25)
        //         pos = c - 'a'

        // TODO: shift it and wrap using % 26
        //         shifted = (pos + shift) % 26

        // TODO: convert back to a char and return it
        //         return (char)(shifted + 'a')

        return c; // replace this line
    }


    // Encodes a full lowercase word by calling caesarEncodeChar on each letter.
    // Non-letter characters (spaces, punctuation) pass through unchanged.
    // Example: caesarEncode("hello", 3) → "khoor"
    public String caesarEncode(String word, int shift) {

        // TODO: create an empty String to build your result

        // TODO: loop through every character in word using charAt(i)

        // TODO: for each character, check if it's a lowercase letter (>= 'a' && <= 'z')
        //         if it is: call caesarEncodeChar(c, shift) and add the result
        //         if it isn't: add it unchanged

        // TODO: return the encoded string

        return word; // replace this line
    }


    // Decodes a lowercase string by shifting backwards.
    // Example: caesarDecode("khoor", 3) → "hello"
    public String caesarDecode(String word, int shift) {

        // TODO: same structure as caesarEncode
        //       the only difference is the shift direction:
        //       shifted = (pos - shift + 26) % 26
        //       the +26 prevents negative numbers

        return word; // replace this line
    }


    // ── Stretch Goal ─────────────────────────────────────────────

    // Encodes a string that may contain upper and lowercase letters.
    // Uppercase letters encode to uppercase, lowercase to lowercase.
    // Example: caesarEncodeMixed("Hello", 3) → "Khoor"
    public String caesarEncodeMixed(String word, int shift) {

        // TODO: same loop as caesarEncode, but now check the case of each letter
        //       use Character.isUpperCase(c) to decide which base to use:
        //         uppercase: base = 'A'  (ASCII 65)
        //         lowercase: base = 'a'  (ASCII 97)
        //       the shift formula is the same — just swap in base:
        //         pos     = c - base
        //         shifted = (pos + shift) % 26
        //         result  = (char)(shifted + base)

        return word; // replace this line
    }


    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();

        // ── Test caesarEncodeChar ────────────────────────────────
        System.out.println("=== caesarEncodeChar ===");

        System.out.println(cc.caesarEncodeChar('h', 3));   // expected: k
        System.out.println(cc.caesarEncodeChar('a', 1));   // expected: b
        System.out.println(cc.caesarEncodeChar('z', 1));   // expected: a  (wraps!)
        System.out.println(cc.caesarEncodeChar('y', 3));   // expected: b  (wraps!)


        // ── Test caesarEncode ────────────────────────────────────
        System.out.println("\n=== caesarEncode ===");

        System.out.println(cc.caesarEncode("hello", 3));      // expected: khoor
        System.out.println(cc.caesarEncode("java", 1));        // expected: kbwb
        System.out.println(cc.caesarEncode("xyz", 3));         // expected: abc  (wraps!)
        System.out.println(cc.caesarEncode("hello world", 3)); // expected: khoor zruog  (space unchanged)


        // ── Test caesarDecode ────────────────────────────────────
        System.out.println("\n=== caesarDecode ===");

        System.out.println(cc.caesarDecode("khoor", 3));       // expected: hello
        System.out.println(cc.caesarDecode("kbwb", 1));        // expected: java
        System.out.println(cc.caesarDecode("abc", 3));         // expected: xyz  (wraps back!)


        // ── Test caesarEncodeMixed ───────────────────────────────
        System.out.println("\n=== caesarEncodeMixed (stretch) ===");

        System.out.println(cc.caesarEncodeMixed("Hello", 3));       // expected: Khoor
        System.out.println(cc.caesarEncodeMixed("Java", 1));        // expected: Kbwb
        System.out.println(cc.caesarEncodeMixed("Hello World", 3)); // expected: Khoor Zruog
    }

}
