package sample;

/**
 * Created by Pavand on 11/22/17.
 */
public class Transport_Layer {

        private final String Source_port = "1010010101110";
        private final String Destination_port = "110111011";
        private final String Sequencee_number = "100100001";
        private final String Ack_number = "101000110";
        private final String tcp_header = "1111101000";
        private final String unused = "00000000";
        private final String window_size = "111111110101";
        private final String checksum = "1011000010";
        private final String urgent_pointer = "0";
        private final String option = "0";
        private final String data ="10001000001110001001001001110";


        public String getSource_port() {
            return Source_port;
        }
        public String getDestination_port() {
            return Destination_port;
        }

        public String getSequencee_number() {
            return Sequencee_number;
        }
        public String getAck_number() {
            return Ack_number;
        }

        public String getTcp_header() {
            return tcp_header;
        }

        public String getUnused() {
            return unused;
        }

        public String getWindow_size() {
            return window_size;
        }

        public String getChecksum() {
            return checksum;
        }

        public String getUrgent_pointer() {
            return urgent_pointer;
        }

        public String getOption() {
            return option;
        }

        public String getData() {
            return data;
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


