package sample;

/**
 * Created by Pavand on 10/20/17.
 */
public interface Converstion {
     String hexToBin(String SourceAddress);
     String hexToBin1(String DestinationAddress);
     String strToBin();
     String padinding();


     int[] convertBinaryToArray(String binary, int num_zero);
}
