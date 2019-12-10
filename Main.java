/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        byte[] key_vec = { 0x23, 0x42, (byte) 0xbb, (byte) 0x9e, (byte) 0xfa, 0x38, 0x54, 0x2c, 0x0a, (byte) 0xf7, 0x56,
                0x47, (byte) 0xf2, (byte) 0x9f, 0x61, 0x5d };
        try {
            Key key = new Key(key_vec);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}