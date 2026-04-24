public class CaesarCipher {

    // Encodes a lowercase string using a Caesar cipher shift.
    // Letters outside a-z (spaces, punctuation) pass through unchanged.
    // Example: caesarEncode("hello", 3) → "khoor"
    public String caesarEncode(String word, int shift) {

        // TODO: loop through every character in word using charAt(i)

        // TODO: for each character, check if it's a lowercase letter (>= 'a' && <= 'z')

        // TODO: if it is a letter:
        //         get its position: pos = c - 'a'
        //         shift it:         shifted = (pos + shift) % 26
        //         turn it back:     (char)(shifted + 'a')

        // TODO: if it's not a letter, add it unchanged

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

        // ── Test caesarEncode ────────────────────────────────────
        System.out.println("=== caesarEncode ===");

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
