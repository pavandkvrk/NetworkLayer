package sample;

/**
 * Created by Pavand on 11/19/17.
 */
public class IPDatagram {
    private final String version = "0100";
    private final String header = "0101";
    private final String tos = "00000000";
    private String totalLengt;
    private final String identification = "1001001110110111";
    private final String flags = "000";
    private final String fragmentOffset = "0000000000000";
    private final String tol = "00000111";
    private final String protocol = "00000110";
    private final String sourceAddressBinary = "01001010.00001110.11101111.11111100";// "74.14.239.252";
    private final String destinationAddressBinary = "11000000.10101000.00000010.00000011";// 192.168.2.3";
    private final String sourceAddress = "74.14.239.252";
    private final String destinationAddress = "192.168.2.3";

    public String getSourceAddressBinary() {
        return sourceAddressBinary;
    }
    public String getDestinationAddressBinary() {
        return destinationAddressBinary;
    }

    public String getTotalLengt() {
        return totalLengt;
    }
    public String getTos() {
        return tos;
    }

    public void setTotalLengt(String totalLengt) {
        this.totalLengt = totalLengt;
    }

    public String getIdentification() {
        return identification;
    }

    public String getHexcode() {
//		String[] source = sourceAddressBinary.split(Pattern.quote("."));
//		String[] destination = destinationAddressBinary.split(Pattern.quote("."));
//		ArrayList<String> list = new ArrayList<String>();
//		list.add(convertBinaryToHex(version));
//		list.add(convertBinaryToHex(header));
//		list.add(convertBinaryToHex(tos));
//		list.add(convertBinaryToHex(getTotalLengt()));
//		list.add(convertBinaryToHex(identification));
//		list.add(convertBinaryToHex(flags));
//		list.add(convertBinaryToHex(fragmentOffset));
//		list.add(convertBinaryToHex(tol));
//		list.add(convertBinaryToHex(protocol));
//		list.add(convertBinaryToHex(source[0] + source[1]));
//		list.add(convertBinaryToHex(source[2] + source[3]));
//		list.add(convertBinaryToHex(destination[0] + destination[1]));
//		list.add(convertBinaryToHex(destination[2] + destination[3]));
//		System.out.println(list.toString());
        //byte[] buf = hexStringToByteArray(hex);

        return "0x564";
    }

    public String getVersion() {
        return version;
    }

    public String getHeader() {
        return header;
    }

    public String getFlags() {
        return flags;
    }

    public String getFragmentOffset() {
        return fragmentOffset;
    }

    public String getTol() {
        return tol;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String convertBinaryToHex(String binary) {
        String hex = null;
        Integer decimal = Integer.parseInt(binary, 2);
        hex = Integer.toString(decimal, 16);
        return hex;
    }
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    public long calculateChecksum(byte[] buf) {
        int length = buf.length;
        int i = 0;

        long sum = 0;
        long data;

        while (length > 1) {
            data = (((buf[i] << 8) & 0xFF00) | ((buf[i + 1]) & 0xFF));
            sum += data;
            if ((sum & 0xFFFF0000) > 0) {
                sum = sum & 0xFFFF;
                sum += 1;
            }

            i += 2;
            length -= 2;
        }

        if (length > 0) {
            sum += (buf[i] << 8 & 0xFF00);
            if ((sum & 0xFFFF0000) > 0) {
                sum = sum & 0xFFFF;
                sum += 1;
            }
        }
        sum = ~sum;
        sum = sum & 0xFFFF;
        return sum;

    }

}
